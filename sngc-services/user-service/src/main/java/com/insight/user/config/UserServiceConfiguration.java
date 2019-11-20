package com.insight.user.config;


import com.insight.user.handler.ContactMessageHandler;
import com.insight.user.handler.PropertiesHandler;
import com.insight.user.handler.RegistrationHandler;
import com.insight.user.handler.UserHandler;
import com.insight.user.impl.ContactMessageServiceImplementation;
import com.insight.user.repository.ContactMessageRepository;
import com.insight.user.repository.PropertiesRepository;
import com.insight.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration
{
    /*@Bean
    public UserRepository userRepository( @Value( "${orientDb.Server.location}") String dbServerName,
                                          @Value( "${orientDb.databaseName}") String dbName,
                                          @Value( "${orientDb.userName}") String userName,
                                          @Value( "${orientDb.password}") String password,
                                          @Value( "${orientDb.collectionNameUser}") String collectionName )
    {
        return new UserRepository( dbServerName, dbName, userName, password, collectionName );
    }

    @Bean
    public ContactMessageRepository contactMessageRepository( @Value( "${orientDb.Server.location}") String dbServerName,
                                          @Value( "${orientDb.databaseName}") String dbName,
                                          @Value( "${orientDb.userName}") String userName,
                                          @Value( "${orientDb.password}") String password,
                                          @Value( "${orientDb.collectionNameContact}") String collectionName )
    {
        return new ContactMessageRepository( dbServerName, dbName, userName, password, collectionName );
    }

    @Bean
    public PropertiesRepository propertiesRepository( @Value( "${orientDb.Server.location}") String dbServerName,
                                                              @Value( "${orientDb.databaseName}") String dbName,
                                                              @Value( "${orientDb.userName}") String userName,
                                                              @Value( "${orientDb.password}") String password,
                                                              @Value( "${orientDb.collectionNameProperty}") String collectionName )
    {
        return new PropertiesRepository( dbServerName, dbName, userName, password, collectionName );
    }

    @Bean
    public UserHandler userHandler( UserRepository userRepository )
    {
        return new UserHandler( userRepository );
    }

    @Bean
    public PropertiesHandler propertiesHandler( PropertiesRepository propertiesRepository )
    {
        return new PropertiesHandler( propertiesRepository );
    }

    @Bean
    public ContactMessageHandler contactMessageHandler( ContactMessageRepository contactMessageRepository )
    {
        return new ContactMessageHandler( contactMessageRepository );
    }

    *//*@Bean
    public UserServiceImplementation userServiceImplementation1( UserHandler userHandler )
    {
        return new UserServiceImplementation(  userHandler );
    }*//*

    @Bean
    public RegistrationHandler registrationHandler( UserRepository userRepository )
    {
        return new RegistrationHandler( userRepository );
    }

    @Bean
    public ContactMessageServiceImplementation abcd( ContactMessageHandler contactMessageHandler )
    {
        return new ContactMessageServiceImplementation( contactMessageHandler );
    }*/
}
