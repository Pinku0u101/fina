package com.insight.user.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.insight.user.model.LoginDetails;
import com.insight.user.model.User;
import com.insight.user.model.UserToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserServiceInterface
{
    @GetMapping("user")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser();

    @PutMapping("user/authenticate")
    @Produces( MediaType.APPLICATION_JSON )
    @Consumes( MediaType.APPLICATION_JSON )
    public UserToken authenticateUser( @RequestBody LoginDetails loginDetails );
}
