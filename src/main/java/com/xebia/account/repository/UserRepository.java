package com.xebia.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xebia.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}