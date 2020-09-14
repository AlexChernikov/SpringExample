package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class  MainController {
    @GetMapping("/main")
    public String main() {
        return "index";
    }

    @PostMapping("/mainPost")
    public String mainPost(@RequestBody phoneAndMessage phoneAndMessage) {
        System.out.println(phoneAndMessage.getPhoneNumber());
        System.out.println(phoneAndMessage.getMessage());
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
