package com.insight.user.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import com.insight.user.model.ProfessionalDetails;
import com.insight.user.model.Properties;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.record.OEdge;
import com.orientechnologies.orient.core.record.OVertex;
import com.orientechnologies.orient.core.sql.executor.OResult;
import com.orientechnologies.orient.core.sql.executor.OResultSet;

public class PropertiesRepository
{
    private static final String EDGE_CLASS_STUDY = "study";
    private static final String EDGE_CLASS_WRITE = "writing";
    private static final String EDGE_CLASS_WATCH_TV = "tv";
    private static final String EDGE_CLASS_COMPUTER_GAMES = "computerGames";
    private static final String EDGE_CLASS_OUT_DOOR_GAMES = "games";
    private static final String EDGE_CLASS_TRAVEL = "travel";
    private static final String EDGE_CLASS_SLEEP = "sleep";
    private static final String EDGE_CLASS_READ = "reading";



    public Properties createProperties( Properties properties )
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        String statement = "SELECT FROM Users WHERE userName = ? ";
        OResultSet rs = db.query(statement, properties.getUserSessionDetails() );

        while(rs.hasNext())
        {
            OResult row = rs.next();

            Optional<OVertex> oVertexOptional = row.getVertex();

            OVertex ov = oVertexOptional.get();

            if( properties.getPreDefinedProperties() != null )
            {
                this.processProperties( properties.getPreDefinedProperties(), db, ov );
            }

            if( properties.getMiscProperties() != null )
            {
                this.processMiscProperties( properties.getMiscProperties(), db, ov );
            }

        }

        db.close();
        orientDB.close();

        return null;
    }

    private void processMiscProperties( Map<String, String> properties, ODatabaseSession db, OVertex ov )
    {
        for( String key : properties.keySet() )
        {
            try
            {
                if( key.equals( "sslcMarks" ) || key.equals( "plusTwoMarks" ) || key.equals( "degreeMarks" ) )
                {
                    String statement = "SELECT FROM Marks WHERE name = ? ";
                    OResultSet rs = db.query( statement, properties.get( key ) );

                    while ( rs.hasNext() ) {
                        OResult row = rs.next();
                        Optional<OVertex> oVertexOptional = row.getVertex();

                        OVertex oVertex = oVertexOptional.get();

                        OEdge oEdge = this.createEdges( db, ov, oVertex, key );

                        oEdge.save();

                    }
                }
                else
                {
                    String statement = "SELECT FROM Time WHERE name = ? ";
                    OResultSet rs = db.query( statement, properties.get( key ) );

                    while ( rs.hasNext() ) {
                        OResult row = rs.next();
                        Optional<OVertex> oVertexOptional = row.getVertex();

                        OVertex oVertex = oVertexOptional.get();

                        OEdge oEdge = this.createEdges( db, ov, oVertex, key );

                        oEdge.save();

                    }
                }

            }
            catch ( Exception e)
            {

            }
            finally {


            }

        }
    }

    private OEdge createEdges( ODatabaseSession db, OVertex ov, OVertex oVertex, String key )
    {
        OEdge oEdge = null;

        if( checkStudy( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_STUDY ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_STUDY );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_STUDY );
        }
        else if( checkRead( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_READ ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_READ );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_READ );
        }
        else if( checkWrite( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_WRITE ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_WRITE );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_WRITE );
        }
        else if( checkWatchTv( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_WATCH_TV ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_WATCH_TV );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_WATCH_TV );
        }
        else if( checkComputerGames( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_COMPUTER_GAMES ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_COMPUTER_GAMES );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_COMPUTER_GAMES );
        }
        else if( checkOutDoorGames( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_OUT_DOOR_GAMES ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_OUT_DOOR_GAMES );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_OUT_DOOR_GAMES );
        }
        else if( checkSleep( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_SLEEP ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_SLEEP );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_SLEEP );
        }
        else if( checkTravel( key ) )
        {
            /*if( db.getClass( EDGE_CLASS_TRAVEL ) == null )
            {
                db.createEdgeClass( EDGE_CLASS_TRAVEL );
            }*/

            oEdge = db.newEdge( ov, oVertex, EDGE_CLASS_TRAVEL );
        }
        else
        {
            /*if( db.getClass( key ) == null )
            {
                db.createEdgeClass( key );
            }*/

            oEdge = db.newEdge( ov, oVertex, key );
        }

        return oEdge;
    }

    private void processProperties( List<Map<String, List<String>>> properties, ODatabaseSession db, OVertex ov )
    {
        try
        {
            if ( properties != null )
            {
                for( Map<String, List<String>> propertyMap: properties)
                {
                    for ( String key : propertyMap.keySet() )
                    {
                        if( key.equals( "likesToEat" ) )
                        {

                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM Food WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();


                                    OEdge oEdge = db.newEdge( ov, oVertex, key );
                                    oEdge.save();
                                }
                            }
                        }

                        if( key.equals( "wantToBecome" ) )
                        {
                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM Ambition WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();


                                    OEdge oEdge = db.newEdge( ov, oVertex, key );
                                    oEdge.save();

                                }
                            }
                        }
                        if( key.equals( "interested" ) )
                        {
                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM Hobbies WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();

                                    OEdge oEdge = db.newEdge( ov, oVertex, key );
                                    oEdge.save();
                                }
                            }
                        }
                        if( key.equals( "notInterested" ) )
                        {
                            if ( db.getClass( "Hobbies" ) == null )
                            {
                                db.createVertexClass( key );
                                db.newVertex( key );
                            }

                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM Hobbies WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();


                                    OEdge oEdge = db.newEdge( ov, oVertex, key );
                                    oEdge.save();
                                }
                            }
                        }
                        if( key.equals( "SpokenLanguages" ) )
                        {
                            if ( db.getClass( "Hobbies" ) == null )
                            {
                                db.createVertexClass( key );
                                db.newVertex( key );
                            }

                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM SpokenLanguages WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();


                                    OEdge oEdge = db.newEdge( ov, oVertex, "knowsLanguages" );
                                    oEdge.save();
                                }
                            }
                        }

                        if ( !key.equals( "SpokenLanguages" ) && !key.equals( "notInterested" ) && !key.equals( "interested" ) && !key.equals( "wantToBecome" ) && !key.equals( "likesToEat" ) )
                        {
                            if ( db.getClass( key ) == null )
                            {
                                db.createVertexClass( key );
                                db.newVertex( key );
                            }

                            for ( String value : propertyMap.get( key ) )
                            {
                                String statement = "SELECT FROM "+ key+ " WHERE name = ? ";
                                OResultSet rs = db.query( statement, value );

                                while(rs.hasNext()) {

                                    OResult row = rs.next();
                                    Optional<OVertex> oVertexOptional = row.getVertex();

                                    OVertex oVertex = oVertexOptional.get();


                                    OEdge oEdge = db.newEdge( ov, oVertex, "has" + key );
                                    oEdge.save();
                                }
                            }
                        }

                    }
                }

            }
        }
        catch ( Exception e)
        {
           System.err.println(e);
        }
        finally {


        }
    }

    private boolean checkStudy( String key )
    {
        return key.equals( EdgeNames.MonStudy.toString() ) || key.equals( EdgeNames.TueStudy.toString() ) || key.equals( EdgeNames.WedStudy.toString() ) || key.equals( EdgeNames.ThuStudy.toString() ) || key.equals( EdgeNames.FriStudy.toString() ) ||key.equals( EdgeNames.SatStudy.toString() ) || key.equals( EdgeNames.SunStudy.toString() );
    }

    private boolean checkRead( String key )
    {
        return key.equals( EdgeNames.MonRead.toString() ) || key.equals( EdgeNames.TueRead.toString() ) || key.equals( EdgeNames.WedRead.toString() ) || key.equals( EdgeNames.ThuRead.toString() ) || key.equals( EdgeNames.FriRead.toString() ) ||key.equals( EdgeNames.SatRead.toString() ) || key.equals( EdgeNames.SunRead.toString() );
    }

    private boolean checkWrite( String key )
    {
        return key.equals( EdgeNames.MonWrite.toString() ) || key.equals( EdgeNames.TueWrite.toString() ) || key.equals( EdgeNames.WedWrite.toString() ) || key.equals( EdgeNames.ThuWrite.toString() ) || key.equals( EdgeNames.FriWrite.toString() ) ||key.equals( EdgeNames.SatWrite.toString() ) || key.equals( EdgeNames.SunWrite.toString() );
    }

    private boolean checkWatchTv( String key )
    {
        return key.equals( EdgeNames.MonWatchTv.toString() ) || key.equals( EdgeNames.TueWatchTv.toString() ) || key.equals( EdgeNames.WedWatchTv.toString() ) || key.equals( EdgeNames.ThuWatchTv.toString() ) || key.equals( EdgeNames.FriWatchTv.toString() ) ||key.equals( EdgeNames.SatWatchTv.toString() ) || key.equals( EdgeNames.SunWatchTv.toString() );
    }

    private boolean checkComputerGames( String key )
    {
        return key.equals( EdgeNames.MonComputerGames.toString() ) || key.equals( EdgeNames.TueComputerGames.toString() ) || key.equals( EdgeNames.WedComputerGames.toString() ) || key.equals( EdgeNames.ThuComputerGames.toString() ) || key.equals( EdgeNames.FriComputerGames.toString() ) ||key.equals( EdgeNames.SatComputerGames.toString() ) || key.equals( EdgeNames.SunComputerGames.toString() );
    }

    private boolean checkOutDoorGames( String key )
    {
        return key.equals( EdgeNames.MonOutDoorGames.toString() ) || key.equals( EdgeNames.TueOutDoorGames.toString() ) || key.equals( EdgeNames.WedOutDoorGames.toString() ) || key.equals( EdgeNames.ThuOutDoorGames.toString() ) || key.equals( EdgeNames.FriOutDoorGames.toString() ) ||key.equals( EdgeNames.SatOutDoorGames.toString() ) || key.equals( EdgeNames.SunOutDoorGames.toString() );
    }

    private boolean checkTravel( String key )
    {
        return key.equals( EdgeNames.MonTravel.toString() ) || key.equals( EdgeNames.TueTravel.toString() ) || key.equals( EdgeNames.WedTravel.toString() ) || key.equals( EdgeNames.ThuTravel.toString() ) || key.equals( EdgeNames.FriTravel.toString() ) ||key.equals( EdgeNames.SatTravel.toString() ) || key.equals( EdgeNames.SunTravel.toString() );
    }

    private boolean checkSleep( String key )
    {
        return key.equals( EdgeNames.MonSleep.toString() ) || key.equals( EdgeNames.TueSleep.toString() ) || key.equals( EdgeNames.WedSleep.toString() ) || key.equals( EdgeNames.ThuSleep.toString() ) || key.equals( EdgeNames.FriSleep.toString() ) ||key.equals( EdgeNames.SatSleep.toString() ) || key.equals( EdgeNames.SunSleep.toString() );
    }

}
