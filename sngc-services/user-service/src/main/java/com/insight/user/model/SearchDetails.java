package com.insight.user.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SearchDetails
{
    private String id;
    private String userName;
    private String name;
    private String occupation;

    public SearchDetails( String id,
                          String userName,
                          String name,
                          String occupation)
    {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.occupation = occupation;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation( String occupation )
    {
        this.occupation = occupation;
    }

    @Override
    public String toString()
    {
        String toString = new ToStringBuilder( this )
                .append( "id", this.id )
                .append( "name", this.name )
                .append( "occupation", this.occupation )
                .toString();

        return toString;
    }
}
