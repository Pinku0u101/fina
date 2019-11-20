package com.insight.user.contract;

import com.insight.user.model.Properties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PropertiesServiceInterface
{
    @PostMapping("properties/create")
    public Properties createProperties( @RequestBody Properties properties );
}
