package com.example.demo.repos;

import com.example.demo.entity.UserProblem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProblemRepo extends JpaRepository<UserProblem, Integer> {
}
