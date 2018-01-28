package com.sb.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.projects.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
