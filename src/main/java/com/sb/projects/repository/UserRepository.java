package com.sb.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.projects.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
