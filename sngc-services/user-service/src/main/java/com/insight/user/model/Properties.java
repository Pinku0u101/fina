package com.insight.user.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Properties
{
    private String id;
    private String userSessionDetails;
    private List<Map<String, List<String>>> preDefinedProperties;
    private ProfessionalDetails professionalDetails;
    private Map<String, String> miscProperties;

    public Properties()
    {

    }

    @JsonCreator
    public Properties( @JsonProperty( "userSessionDetails" ) String  userSessionDetails,
                       @JsonProperty( "preDefinedProperties" ) List<Map<String, List<String>>> preDefinedProperties,
                       @JsonProperty( "ProfessionalDetails" ) ProfessionalDetails professionalDetails,
                       @JsonProperty( "miscProperties" ) Map<String, String> miscProperties )
    {
        this.id = UUID.randomUUID().toString();
        this.userSessionDetails = userSessionDetails;
        this.preDefinedProperties = preDefinedProperties;
        this.professionalDetails = professionalDetails;
        this.miscProperties = miscProperties;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getUserSessionDetails()
    {
        return userSessionDetails;
    }

    public void setUserSessionDetails( String userSessionDetails )
    {
        this.userSessionDetails = userSessionDetails;
    }

    public List<Map<String, List<String>>> getPreDefinedProperties()
    {
        return preDefinedProperties;
    }

    public void setPreDefinedProperties( List<Map<String, List<String>>> preDefinedProperties )
    {
        this.preDefinedProperties = preDefinedProperties;
    }

    public ProfessionalDetails getProfessionalDetails()
    {
        return professionalDetails;
    }

    public void setProfessionalDetails( ProfessionalDetails professionalDetails )
    {
        this.professionalDetails = professionalDetails;
    }

    public Map<String, String> getMiscProperties()
    {
        return miscProperties;
    }

    public void setMiscProperties( Map<String, String> miscProperties )
    {
        this.miscProperties = miscProperties;
    }

    @Override
    public String toString()
    {
        String toString = new ToStringBuilder( this )
                .append( "id", this.id )
                .append( "userSessionDetails", this.userSessionDetails )
                .append( "preDefinedProperties", this.preDefinedProperties )
                .append( "professionalDetails", this.professionalDetails )
                .append( "miscProperties", this.miscProperties )
                .toString();

        return toString;
    }

}
