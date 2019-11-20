package com.insight.user.impl;

import javax.jws.soap.SOAPBinding;

import com.insight.user.Gender;
import com.insight.user.contract.UserServiceInterface;
import com.insight.user.handler.UserHandler;
import com.insight.user.model.LoginDetails;
import com.insight.user.model.User;
import com.insight.user.model.UserToken;
import com.insight.user.repository.UserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImplementation implements UserServiceInterface
{
    private UserHandler userHandler;

    @Override
    public User getUser()
    {
        User newUser = new User("Aswathy", "Ashok", 22, Gender.FEMALE.toString(), "kdfkdsb","66487698","abc","abc", "","","");

        /*userRepository = new UserRepository();
        userRepository.createConnection(newUser);
*/
        return newUser;
    }

    @Override
    public UserToken authenticateUser( LoginDetails loginDetails )
    {
        UserToken userToken= null;
        try{
            userHandler = new UserHandler();

            userToken = userHandler.authenticateUser( loginDetails );
        }
        catch (Exception e)
        {
            throw new RuntimeException( "Username or password is incorrect" );
        }

        return userToken;
    }
}
