package com.insight.user.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserSessionDetails
{
    private String userName;
    private String firstName;
    private String token;

    @JsonCreator
    public UserSessionDetails( @JsonProperty( value = "userName" ) String userName,
                               @JsonProperty( value = "firstName" ) String firstName,
                               @JsonProperty( value = "token" ) String token )
    {
        Objects.requireNonNull( userName, "userName must not be null" );

        this.userName = userName;
        this.firstName = firstName;
        this.token = token;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken( String token )
    {
        this.token = token;
    }

    @Override
    public String toString()
    {
        String toString = new ToStringBuilder( this )
                .append( "userName", this.userName )
                .append( "firstName", this.firstName )
                .append( "token", this.token )
                .toString();

        return toString;
    }
}
