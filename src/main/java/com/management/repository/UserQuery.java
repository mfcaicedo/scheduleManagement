package com.management.repository;

import com.management.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuery extends JpaRepository<User, String> {
}
