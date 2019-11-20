package com.sngc.insight.implementation;

import java.util.List;
import java.util.Map;

import com.sngc.insight.Handler.InsightsHandler;
import com.sngc.insight.contract.InsightsServiceInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsightServiceImplementation implements InsightsServiceInterface
{
    private InsightsHandler insightsHandler;
    @Override
    public Map<String, Map<String, List<String>>> getInsight( Map<String, String> userIds)
    {
        insightsHandler = new InsightsHandler();
        Map<String, Map<String, List<String>>> userProps = insightsHandler.getInsights( userIds );

        return userProps;

    }

    @Override
    public void createInsight()
    {
    }

    @Override
    public void createProperties()
    {
    }

    @Override
    public void getProperties()
    {
    }
}
