package com.example.appengine.springboot.controller;

import com.example.appengine.springboot.google.Util;
import com.google.api.services.directory.Directory;
import com.google.api.services.directory.model.User;
import com.google.api.services.directory.model.Users;
import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GSuiteLoginController {

  @GetMapping("/connect")
  public List<User> connect(@RequestParam String token) throws IOException {

    Directory directory = Util.buildDirectoryService(token);

    Users result =
        directory
            .users()
            .list()
            .setCustomer("my_customer")
            .setMaxResults(10)
            .setOrderBy("email")
            .execute();

    return result.getUsers();
  }
}
