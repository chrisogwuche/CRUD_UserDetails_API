package com.decagon.crud_userdetails_api.controller;

import com.decagon.crud_userdetails_api.entity.UserDetails;
import com.decagon.crud_userdetails_api.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDetailController {

    private  final UserDetailsService service;
    @Autowired
    public UserDetailController(UserDetailsService service){
        this.service = service;
    }

    @GetMapping
    public List<UserDetails> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/creates")
    public UserDetails createUser(@RequestBody UserDetails userDetails){
        return service.createUser(userDetails);
    }

    @PutMapping("/updates/{user_id}")
    public List<UserDetails> update(@PathVariable Long user_id,@RequestBody UserDetails userDetails){
        return service.updateUserDetails(userDetails,user_id);
    }

    @DeleteMapping("/delete/{user_id}")
    public List<UserDetails> delete(@PathVariable Long user_id){
        return service.deleteUser(user_id);
    }

}
