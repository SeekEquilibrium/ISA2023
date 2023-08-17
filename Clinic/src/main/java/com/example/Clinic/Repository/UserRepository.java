package com.example.Clinic.Repository;

import com.example.Clinic.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public boolean existsByUsername(String username);
}
