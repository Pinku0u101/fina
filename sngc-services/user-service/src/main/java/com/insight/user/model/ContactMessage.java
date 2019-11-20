package com.insight.user.model;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactMessage
{
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String message;

    public ContactMessage()
    {

    }

    @JsonCreator
    public ContactMessage( @JsonProperty( value = "email" ) String email,
                           @JsonProperty( value = "firstName" ) String firstName,
                           @JsonProperty( value = "lastName" ) String lastName,
                           @JsonProperty( value = "phoneNumber" ) String phoneNumber,
                           @JsonProperty( value = "message" ) String message )
    {
        Objects.requireNonNull( email, "email must no be null" );
        Objects.requireNonNull( firstName, "firstName must no be null" );
        Objects.requireNonNull( lastName, "lastName must no be null" );
        Objects.requireNonNull( phoneNumber, "phoneNumber must no be null" );
        Objects.requireNonNull( message, "message must no be null" );

        this.id = UUID.randomUUID().toString();

        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.message = message;

    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    //TODO toString
}
