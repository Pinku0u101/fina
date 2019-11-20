package com.insight.user.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProfessionalDetails
{
    private String education;
    private String college;
    private String educationDetail;
    private String employedIn;
    private String occupation;
    private String occupationInDetail;
    private String annualIncome;

    @JsonCreator
    public ProfessionalDetails( @JsonProperty( value = "education" ) String education,
                                @JsonProperty( value = "college" ) String college,
                                @JsonProperty( value = "educationDetail" ) String educationDetail,
                                @JsonProperty( value = "employedIn" ) String employedIn,
                                @JsonProperty( value = "occupation" ) String occupation,
                                @JsonProperty( value = "occupationInDetail" ) String occupationInDetail,
                                @JsonProperty( value = "annualIncome" ) String annualIncome )
    {
        this.education = education;
        this.college = college;
        this.educationDetail = educationDetail;
        this.employedIn = employedIn;
        this.occupation = occupation;
        this.occupationInDetail = occupationInDetail;
        this.annualIncome = annualIncome;
    }

    public String getEducation()
    {
        return education;
    }

    public void setEducation( String education )
    {
        this.education = education;
    }

    public String getCollege()
    {
        return college;
    }

    public void setCollege( String college )
    {
        this.college = college;
    }

    public String getEducationDetail()
    {
        return educationDetail;
    }

    public void setEducationDetail( String educationDetail )
    {
        this.educationDetail = educationDetail;
    }

    public String getEmployedIn()
    {
        return employedIn;
    }

    public void setEmployedIn( String employedIn )
    {
        this.employedIn = employedIn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation( String occupation )
    {
        this.occupation = occupation;
    }

    public String getOccupationInDetail()
    {
        return occupationInDetail;
    }

    public void setOccupationInDetail( String occupationInDetail )
    {
        this.occupationInDetail = occupationInDetail;
    }

    public String getAnnualIncome()
    {
        return annualIncome;
    }

    public void setAnnualIncome( String annualIncome )
    {
        this.annualIncome = annualIncome;
    }

    @Override
    public String toString()
    {
        String toString = new ToStringBuilder( this )
                .append( "education", this.education )
                .append( "college", this.college )
                .append( "educationDetail", this.educationDetail )
                .append( "employedIn", this.employedIn )
                .append( "occupation", this.occupation )
                .append( "occupationInDetail", this.occupationInDetail )
                .append( "annualIncome", this.annualIncome )
                .toString();

        return toString;
    }
}
