package com.charactergeneratorgroup.charactergenerator.controller.interfaces;

import com.charactergeneratorgroup.charactergenerator.model.User;

public interface AuthControllerInterface {

    void login(User user);

    void register(User user);
}
