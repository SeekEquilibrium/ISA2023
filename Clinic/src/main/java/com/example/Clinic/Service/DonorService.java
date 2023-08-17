package com.example.Clinic.Service;

import com.example.Clinic.DTO.RegistrationRequestDTO;
import com.example.Clinic.Model.Adress;
import com.example.Clinic.Model.Donor;
import com.example.Clinic.Model.Gender;
import com.example.Clinic.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorService {

    @Autowired
    private UserRepository userRepository;


    public Donor register(RegistrationRequestDTO request){
        Donor donor = new Donor();
        donor.setName(request.getName());
        donor.setSurname(request.getSurname());
        donor.setEmail(request.getEmail());
        donor.setUsername(request.getUsername());
        donor.setPassword(request.getPassword());
        donor.setPhoneNumber(request.getPhoneNumber());
        donor.setOccupation(request.getOccupation());
        donor.setEducation(request.getEducation());
        donor.setAdress(new Adress(request.getStreet(), request.getCity(), request.getCountry()));
        donor.setGender(request.getGender().trim().equalsIgnoreCase("male")? Gender.MALE:Gender.FEMALE);

        return userRepository.save(donor);
    }
}
