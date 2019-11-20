package com.insight.user.handler;

import com.insight.user.model.ContactMessage;
import com.insight.user.repository.ContactMessageRepository;

public class ContactMessageHandler
{
    private ContactMessageRepository contactMessageRepository;

    public ContactMessage createNewMessage( ContactMessage contactMessage )
    {
        contactMessageRepository = new ContactMessageRepository();
        ContactMessage newContactMessage = contactMessageRepository.createContactMessage( contactMessage );

        return newContactMessage;

    }
}
