package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByUserName(String userName);
}
