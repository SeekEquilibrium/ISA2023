package com.example.Clinic.Controller;

import com.example.Clinic.DTO.RegistrationRequestDTO;
import com.example.Clinic.Model.Donor;
import com.example.Clinic.Model.User;
import com.example.Clinic.Service.DonorService;
import com.example.Clinic.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UserService userService;
    @Autowired
    private DonorService donorService;

    @PostMapping("/signup")
    public ResponseEntity<User> addUser(@Valid @RequestBody RegistrationRequestDTO request) {
       if(userService.UserExists(request.getUsername())){
           return new ResponseEntity<>(null, HttpStatus.CONFLICT);
       }
       Donor donor = donorService.register(request);
       return new ResponseEntity<>(donor , HttpStatus.CREATED);
    }
}
