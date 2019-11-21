package com.insight.user.handler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.insight.user.model.LoginDetails;
import com.insight.user.model.UserToken;
import com.insight.user.repository.Helper;
import com.insight.user.repository.UserRepository;

public class UserHandler
{
    private UserRepository userRepository;

    public UserHandler()
    {}

    /*public UserHandler( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }*/

    public UserToken authenticateUser( LoginDetails loginDetails )
    {
        UserToken userToken = null;

        userRepository = new UserRepository();

        LoginDetails loginDetailsfromDb = userRepository.getUserDetails( loginDetails );

        if( loginDetailsfromDb.getUserName().equals( loginDetails.getUserName() ) &&
                 loginDetailsfromDb.getPassword().equals( loginDetails.getPassword() ) )
        {
            userToken = new UserToken(loginDetails.getUserName(), loginDetailsfromDb.getFirstName(), loginDetailsfromDb.getOccupation(), UUID.randomUUID().toString() );
        }


        return userToken;

    }

    public List<String> getTips()
    {
        List<String> tips = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        Integer day = calendar.get(Calendar.DAY_OF_WEEK);

        tips = Helper.getTipOfTheDay( day );

        return tips;
    }
}
