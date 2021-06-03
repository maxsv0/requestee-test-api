package com.example.appengine.springboot.controller;

import com.example.appengine.springboot.google.Util;
import com.example.appengine.springboot.model.GSuiteReport;
import com.example.appengine.springboot.model.GSuiteUser;
import com.example.appengine.springboot.model.Report;
import com.example.appengine.springboot.model.ResponseConnect;
import com.example.appengine.springboot.model.User;
import com.example.appengine.springboot.service.UserRepository;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GSuiteLoginController {

  @Autowired
  UserRepository userRepository;

  @PostMapping(path = "/connect", consumes = "application/json", produces = "application/json")
  public ResponseConnect connect(@RequestBody String token) {

    GoogleIdToken idToken = Util.verifyIdTokenString(token);
    if (idToken != null) {
      String email = idToken.getPayload().getEmail();

      Optional<User> userResult = userRepository.findUserByEmail(email);
      if (userResult.isPresent()) {
        User userDb = userResult.get();
        userDb.setToken(token);
        userDb.setUpdateDate(new Date());
        userRepository.save(userDb);
      } else {

        User userDb = new User();
        userDb.setEmail(email);
        userDb.setToken(token);
        userDb.setUpdateDate(new Date());
        userRepository.save(userDb);
      }

      return new ResponseConnect(true);
    }

    return new ResponseConnect(false);
  }

  @GetMapping("/getReport")
  public GSuiteReport getReport(@RequestParam String token) {

  }
}
