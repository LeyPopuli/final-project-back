package com.charactergeneratorgroup.charactergenerator.service.interfaces;

import com.charactergeneratorgroup.charactergenerator.model.User;

public interface AuthServiceInterface {

    void login(User user);

    void register(User user);
}
