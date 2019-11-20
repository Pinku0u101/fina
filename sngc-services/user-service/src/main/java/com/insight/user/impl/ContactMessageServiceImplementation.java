package com.insight.user.impl;

import java.util.List;

import com.insight.user.contract.ContactMessageServiceInterface;
import com.insight.user.handler.ContactMessageHandler;
import com.insight.user.model.ContactMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactMessageServiceImplementation implements ContactMessageServiceInterface
{
    private ContactMessageHandler contactMessageHandler;
    @Override
    public List<ContactMessage> getAllContactMessages() {
        return null;
    }

    @Override
    public ContactMessage getContactMessageById() {
        return null;
    }

    @Override
    public ContactMessage createContactMessage( @RequestBody ContactMessage contactMessage)
    {
        contactMessageHandler = new ContactMessageHandler();

        ContactMessage contactMessage1 = contactMessageHandler.createNewMessage( contactMessage );

        return contactMessage1;
    }
}
