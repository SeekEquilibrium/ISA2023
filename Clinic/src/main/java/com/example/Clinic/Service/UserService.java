package com.example.Clinic.Service;

import com.example.Clinic.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean UserExists(String username) {
        return userRepository.existsByUsername(username);
    }
}
