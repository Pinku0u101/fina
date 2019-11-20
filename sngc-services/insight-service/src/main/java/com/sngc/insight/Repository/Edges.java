package com.sngc.insight.Repository;

import java.util.List;

public enum Edges
{
    SINGLETON;

    public static class EdgeProperties
    {
        List<String> inProperties;
        List<String> outProperties;

        public EdgeProperties()
        {
            outProperties.add( "interested" );
            outProperties.add( "notInterested" );

        }

        public List<String> getInProperties()
        {
            return inProperties;
        }

        public void setInProperties( List<String> inProperties )
        {
            this.inProperties = inProperties;
        }

        public List<String> getOutProperties()
        {
            return outProperties;
        }

        public void setOutProperties( List<String> outProperties )
        {
            this.outProperties = outProperties;
        }
    }

    public EdgeProperties getEdgeProperties()
    {
        EdgeProperties edgeProperties = new EdgeProperties();

        return edgeProperties;
    }

}
