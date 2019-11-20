package com.insight.user.contract;

import java.util.List;

import com.insight.user.model.ContactMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ContactMessageServiceInterface
{
//TODO add domains and request POJOs
    @GetMapping("contact")
    public List<ContactMessage> getAllContactMessages();

    @GetMapping("contact/{contactId}")
    public ContactMessage getContactMessageById();

    @PostMapping("contact")
    public ContactMessage createContactMessage( @RequestBody ContactMessage contactMessage );



}
