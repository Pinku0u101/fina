package com.insight.user.handler;

import com.insight.user.model.User;
import com.insight.user.repository.UserRepository;

public class RegistrationHandler
{
    private UserRepository userRepository;

    public RegistrationHandler()
    {

    }

    /*public RegistrationHandler( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }*/

    public User createNewUser(User user)
    {
        userRepository = new UserRepository();
        userRepository.createConnection(user);

        return user;

    }
}
