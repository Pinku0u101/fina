package com.insight.user.model;

import java.util.Objects;

public class UserToken
{
    private String userName;
    private String firstName;
    private String occupation;
    private String token;

    public UserToken( String userName,
                      String firstName,
                      String occupation,
                      String token )
    {
        Objects.requireNonNull( userName, "userName must not be null" );
        Objects.requireNonNull( firstName, "firstName must not be null" );
        Objects.requireNonNull( token, "token must not be null" );

        this.userName = userName;
        this.token = token;
        this.occupation = occupation;
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation( String occupation ) {
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //TODO toString
}
