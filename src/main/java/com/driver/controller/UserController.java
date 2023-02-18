package com.driver.controller;

import com.driver.models.User;
import com.driver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/create")
    public ResponseEntity<Void> createUser(@RequestParam String username, @RequestParam String password) {
        // create a new user with given username and password
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable int userId) {
        // delete user using deleteById
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestParam Integer id, @RequestParam String password) {
        // update password of given user
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
