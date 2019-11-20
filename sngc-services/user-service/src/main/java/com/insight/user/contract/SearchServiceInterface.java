package com.insight.user.contract;

import java.util.List;

import com.insight.user.model.SearchDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface SearchServiceInterface
{
    @GetMapping("search")
    public List<SearchDetails> getSearchDetails( @RequestParam("firstName") String firstName,
                                           @RequestParam("lastName") String lastName );
}
