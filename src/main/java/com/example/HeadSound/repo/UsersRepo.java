package com.example.HeadSound.repo;

import com.example.HeadSound.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {}
