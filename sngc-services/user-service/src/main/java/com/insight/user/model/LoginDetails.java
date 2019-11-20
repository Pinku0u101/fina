package com.insight.user.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginDetails
{
    private String firstName;
    private String userName;
    private String occupation;
    private String password;

    @JsonCreator
    public LoginDetails( @JsonProperty(value = "username", required = true ) String userName,
                         @JsonProperty(value = "password", required = true ) String password,
                         @JsonProperty(value = "occupation" )String occupation,
                         @JsonProperty(value = "firstName" )String firstName)
    {
        Objects.requireNonNull( userName, "userName must not be null" );
        Objects.requireNonNull( password, "password must not be null" );

        this.userName = userName;
        this.password = password;
        this.occupation = occupation;
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation( String occupation ) {
        this.occupation = occupation;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //TODO toString
}
