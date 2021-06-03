package com.example.appengine.springboot.google;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.services.directory.Directory;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

public class Util {

  public static Directory buildDirectoryService(String token) {

    GoogleCredential credential = new GoogleCredential().setAccessToken(token);

    return new Directory.Builder(
            Utils.getDefaultTransport(), Utils.getDefaultJsonFactory(), credential)
        .setApplicationName("Backend")
        .build();
  }

  public static GoogleIdToken verifyIdTokenString(String idTokenString) {
    GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(Utils.getDefaultTransport(), Utils.getDefaultJsonFactory())
        // Specify the CLIENT_ID of the app that accesses the backend:
        .setAudience(Collections.singletonList("539380930807-dclv9k9rlu0hucaui8e3ad7k2clacoct.apps.googleusercontent.com"))
        .build();

    try {
      return verifier.verify(idTokenString);
    } catch (IOException | GeneralSecurityException e) {
      return null;
    }
  }
}
