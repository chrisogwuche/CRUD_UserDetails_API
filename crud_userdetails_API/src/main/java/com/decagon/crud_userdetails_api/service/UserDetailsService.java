package com.decagon.crud_userdetails_api.service;

import com.decagon.crud_userdetails_api.repository.UserDetailRepository;
import com.decagon.crud_userdetails_api.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    private final UserDetailRepository repo;
    @Autowired
    public UserDetailsService(UserDetailRepository repo){
        this.repo = repo;
    }

    public UserDetails createUser(UserDetails user){
      return repo.save(user);
    }

    public List<UserDetails> getAllUsers(){
        return  repo.findAll();
    }

    public List<UserDetails> deleteUser(Long id){
        repo.deleteById(id);

        return getAllUsers();
    }

    public List<UserDetails> updateUserDetails(UserDetails userDetails, Long id){
        UserDetails user = repo.findById(id)
                .orElseThrow(()->
                        new NullPointerException("User details not found with id: " +id));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        repo.save(user);

        return getAllUsers();
    }

}
