package com.alphabee.store.service;

import com.alphabee.store.model.User;
import com.alphabee.store.repository.UserRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {


  @Autowired
  private UserRepo userRepo;

  public UserService(UserRepo userRepo){
    this.userRepo=userRepo;
  }
  public String addUser(User user){
    System.out.println(user);
    userRepo.save(user);
    return "User added";
  }

  public User getUser(Integer userid) {
    Optional<User> userOptional = userRepo.findById(userid);
    if(userOptional.isPresent()) {
      System.out.println(userOptional.get());
      return userOptional.get();
    }
    return null;
  }

  public String deleteUser(Integer userid){
    userRepo.deleteById(userid);
    return "user deleted";
  }
}
