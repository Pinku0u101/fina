package com.insight.user.model;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User
{
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String email;
    private String phoneNumber;
    private String occupation;
    private String college;
    private String country;
    private String username;
    private String password;

    @JsonCreator
    public User( @JsonProperty(value = "firstName") String firstName,
                 @JsonProperty(value = "lastName") String lastName,
                 @JsonProperty(value = "age") Integer age,
                 @JsonProperty(value = "gender") String gender,
                 @JsonProperty(value = "email") String email,
                 @JsonProperty(value = "phoneNumber") String phoneNumber,
                 @JsonProperty(value = "occupation") String occupation,
                 @JsonProperty(value = "college") String college,
                 @JsonProperty(value = "country") String country,
                 @JsonProperty(value = "username") String userName,
                 @JsonProperty(value = "password") String password)
    {
        Objects.requireNonNull( firstName, "firstName must not be null" );
        Objects.requireNonNull( lastName, "lastName must not be null" );
        Objects.requireNonNull( age, "age must not be null" );
        //Objects.requireNonNull( gender, "gender must not be null" );
        Objects.requireNonNull( email, "email must not be null" );
        Objects.requireNonNull( phoneNumber, "phoneNumber must not be null" );
        Objects.requireNonNull( occupation, "occupation must not be null" );
        Objects.requireNonNull( college, "college must not be null" );
        Objects.requireNonNull( country, "country must not be null" );
        Objects.requireNonNull( userName, "userName must not be null" );
        Objects.requireNonNull( password, "password must not be null" );

        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.college = college;
        this.country = country;
        this.username = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation( String occupation )
    {
        this.occupation = occupation;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege( String college ) {
        this.college = college;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        String toString = new ToStringBuilder( this )
                .append( "id", this.id )
                .append( "firstName", this.firstName )
                .append( "lastName", this.lastName )
                .append( "age", this.age )
                .toString();

        return toString;
    }
}
