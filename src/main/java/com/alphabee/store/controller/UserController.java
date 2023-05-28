package com.alphabee.store.controller;

import com.alphabee.store.model.User;
import com.alphabee.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

  @Autowired
  private UserService userService;

  public UserController(UserService userService){
    this.userService=userService;
  }

  @PostMapping("/add")
  public String addUser(@RequestBody User user){
    return userService.addUser(user);
  }

  @GetMapping("/{userid}")
  public User getUser(@PathVariable Integer userid){
    return userService.getUser(userid);
  }

  @DeleteMapping("/delete/{userid}")
  public String deleteUser(@PathVariable Integer userid){
    return userService.deleteUser(userid);
  }
}
