package com.example.demo;

import com.example.demo.domain.UserProblem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProblemRepo extends JpaRepository<UserProblem, Integer> {
}
