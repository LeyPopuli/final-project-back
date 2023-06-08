package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@NoArgsConstructor
@DynamicUpdate
public class User {

    @Id
    @Size(min = 5, message = "Username must have at least 5 characters.")
    private String userName;

    @Size(min = 5, message = "Password must have at least 5 characters.")
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        hashPassword(password);
    }

    public void setPassword(String password) {
        hashPassword(password);
    }

    public void hashPassword(String rawPassword) {
        this.password = DigestUtils.sha256Hex(rawPassword);
    }

    public boolean checkPassword(String rawPassword) {
        String hashedInput = DigestUtils.sha256Hex(rawPassword);
        return hashedInput.equals(password);
    }

}