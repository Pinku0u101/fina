package com.insight.user.impl;

import java.util.List;

import com.insight.user.contract.SearchServiceInterface;
import com.insight.user.model.SearchDetails;
import com.insight.user.repository.UserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchServiceImplementation implements SearchServiceInterface
{
    private UserRepository userRepository;

    @Override
    public List<SearchDetails> getSearchDetails( String firstName,
                                           String lastName )
    {
        userRepository = new UserRepository();

        List<SearchDetails> searchDetailsList = userRepository.getSearchDetails( firstName, lastName );

        return searchDetailsList;
    }
}
