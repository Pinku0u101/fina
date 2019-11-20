package com.insight.user.impl;

import java.util.Objects;

import com.insight.user.contract.RegistrationServiceInterface;
import com.insight.user.handler.RegistrationHandler;
import com.insight.user.model.User;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ResgistrationServiceImplementation implements RegistrationServiceInterface
{
    public RegistrationHandler registrationHandler;

    /*public ResgistrationServiceImplementation( RegistrationHandler registrationHandler )
    {
        Objects.requireNonNull( registrationHandler, "registrationHandler must not be null" );

        this.registrationHandler = registrationHandler;
    }*/

    @Override
    public User createUser( User userDetails )
    {
        User user = null;
        try
        {
            registrationHandler = new RegistrationHandler();
            user = registrationHandler.createNewUser(userDetails);
        }
        catch( Exception e)
        {
            //TODO: improve exception handling
            System.out.print( e.getCause() );
            this.throwNewUserRegistrationException( "Sorry, couldn't create user ");
        }

        return user;
    }

    private String throwNewUserRegistrationException( String message )
    {
        throw new RuntimeException( message );
    }
}
