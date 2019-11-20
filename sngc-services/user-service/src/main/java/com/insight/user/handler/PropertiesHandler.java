package com.insight.user.handler;

import com.insight.user.model.Properties;
import com.insight.user.repository.PropertiesRepository;

public class PropertiesHandler
{
    private PropertiesRepository propertiesRepository;

    public void createProperties( Properties properties )
    {
        propertiesRepository = new PropertiesRepository();

        propertiesRepository.createProperties( properties );
    }
}
