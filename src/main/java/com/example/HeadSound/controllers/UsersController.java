package com.example.HeadSound.controllers;

import ch.qos.logback.core.model.Model;
import com.example.HeadSound.repo.UsersRepo;
import com.example.HeadSound.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {
    private final UsersRepo usersRepo;

    public UsersController(UsersRepo usersRepo){this.usersRepo = usersRepo;}

    @GetMapping("/users")
    @ResponseBody
    public List<Users> Users (Model model){
        List<Users> list = usersRepo.findAll();
        return list;
    }
}
