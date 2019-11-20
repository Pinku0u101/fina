package com.insight.user.impl;

import com.insight.user.contract.PropertiesServiceInterface;
import com.insight.user.handler.PropertiesHandler;
import com.insight.user.model.Properties;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesServiceImplementation implements PropertiesServiceInterface
{
    private PropertiesHandler propertiesHandler;
    @Override
    public Properties createProperties( Properties properties )
    {
        propertiesHandler = new PropertiesHandler();

        propertiesHandler.createProperties( properties );
        return properties;
    }
}
