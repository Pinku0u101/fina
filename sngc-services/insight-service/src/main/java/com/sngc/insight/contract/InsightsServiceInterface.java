package com.sngc.insight.contract;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface InsightsServiceInterface
{
    @PostMapping("insights")
    public Map<String, Map<String, List<String>>> getInsight( @RequestBody Map<String, String> UserIds );

    @PostMapping("insights/create")
    public void createInsight();

    @PostMapping("insights/create/prop")
    public void createProperties();

    @GetMapping("insights/prop")
    public void getProperties();
}
