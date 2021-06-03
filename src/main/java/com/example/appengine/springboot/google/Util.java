package com.example.appengine.springboot.google;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.services.directory.Directory;

public class Util {

  public static Directory buildDirectoryService(String token) {

    GoogleCredential credential = new GoogleCredential().setAccessToken(token);

    return new Directory.Builder(
            Utils.getDefaultTransport(), Utils.getDefaultJsonFactory(), credential)
        .setApplicationName("Backend")
        .build();
  }
}
