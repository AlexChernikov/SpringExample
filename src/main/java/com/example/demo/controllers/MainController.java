package com.example.demo.controllers;

import com.example.demo.entity.UserProblem;
import com.example.demo.repos.UserProblemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class  MainController {

    @Autowired
    UserProblemRepo userProblemRepo;

    @GetMapping("/main")
    public String main() {
        return "index";
    }

    @PostMapping("/mainPost")
    public String mainPost(@RequestBody phoneAndMessage phoneAndMessage) {
        System.out.println(phoneAndMessage.getPhoneNumber());
        System.out.println(phoneAndMessage.getMessage());
        UserProblem userProblem = new UserProblem(phoneAndMessage.getPhoneNumber(), phoneAndMessage.getMessage());
        userProblemRepo.saveAndFlush(userProblem);
        return "index";
    }

    public static class phoneAndMessage {
        private String phoneNumber;
        private String message;

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
