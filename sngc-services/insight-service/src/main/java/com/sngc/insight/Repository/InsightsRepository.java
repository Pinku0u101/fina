package com.sngc.insight.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.record.ODirection;
import com.orientechnologies.orient.core.record.OVertex;
import com.orientechnologies.orient.core.sql.executor.OResult;
import com.orientechnologies.orient.core.sql.executor.OResultSet;
import com.sngc.insight.Handler.Helper;
import org.apache.commons.lang.WordUtils;

public class InsightsRepository
{
    public List<OVertex> getUsers( Map<String, List<String>> userIdMap ) {
        OrientDB orientDB = new OrientDB( "plocal:/Users/prakashp/sngc-insights/sngc-insights/orientdb-3.0.22/databases/", OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( "Insights", "admin", "admin" );

        String[] userId = new String[15];
        int i=0;
        String userName = "anu";
        List<OVertex> oVertexes = new ArrayList<>();

        try {
            for ( String key : userIdMap.keySet() )
            {
                if( key == "userId" )
                {
                    for( String value : userIdMap.get( key ))
                    {
                        userId[ i ] = value;
                        i++;
                    }
                }
                else
                {
                    userName = userIdMap.get( key ).get( 0 );
                }
            }
            String statement = "SELECT FROM Users WHERE userName = ? OR id in ? ";
            OResultSet rs = db.query( statement, userName, "fa48967b-2391-45af-a1a1-11d37f40de6e" );

            while ( rs.hasNext() ) {
                OResult row = rs.next();

                Optional<OVertex> ov = row.getVertex();


                ov.get().getVertices( ODirection.BOTH);

                oVertexes.add( ov.get() );
            }
            rs.close();
        } catch ( Exception e ) {
            throw new RuntimeException( e.getMessage() );
        } finally {

            db.close();
            orientDB.close();
        }
        return oVertexes;
    }

    public Map<String, Map<String, List<String>>> getEdges( Map<String, String> userIdMap )
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        List<String> userId = new ArrayList<>();
        int i=0;
        String userName = userIdMap.get( "userName" );
        String userIds;
            /*for ( String key : userIdMap.keySet() )
            {
                if( key == "userId" )
                {
                    for( String value : userIdMap.get( key ))
                    {
                        userId.add( value );
                    }
                }
                else
                {
                    userName = userIdMap.get( key ).get( 0 );
                }
            }*/

        for ( String key : userIdMap.keySet() )
        {
            if( key == "userId" )
            {
                userIds = userIdMap.get("userId").replace("\"id\":","").replace("{","").replace("}","")
                        .replace("[\"","").replace("\"]","").replace( "\"","" );

                for( String id : userIds.split( "," ) )
                {
                    userId.add( id );
                }
            }
            else
            {
                userName = userIdMap.get( key );
            }
        }


        String statement = "SELECT (out('interested').name) As interested, (out('notInterested').name) AS notInterested," +
                "(out('isCricketer').name) AS isCricketer, (out('isEngineer').name) AS isEngineer, (out('isScientist').name) AS isScientist, (out('isStudent').name) AS isStudent," +
                "(out('likesToEat').name) AS likesToEat, (out('livesIn').name) AS livesIn, (out('sleep').name) AS sleep, (out('sslcMarks').name) AS sslcMarks, (out('plusTwoMarks').name) AS plusTwoMarks," +
                "(out('hasEducation').name) AS studied, (out('hasFavouriteMusic').name) AS FavouriteMusic, (out('hasFavouriteMovies').name) AS FavouriteMovies, (out('hasFavouriteCuisine').name) AS FavouriteCuisine," +
                "(out('degreeMarks').name) AS degreeMarks, (out('reading').name) AS reading, (out('writing').name) AS writing, (out('study').name) AS study, (out('games').name) AS games, (out('computerGames').name) AS computerGames, (out('tv').name) AS tv," +
                "(out('studiesAt').name) AS studiesAt, (out('travel').name) AS travel, (out('wantToBecome').name) AS wantToBecome, (out('wasPresident').name) AS wasPresident, (out('knowsLanguages').name) AS knowsLanguages\n" +
                ", userName, firstName, lastName, occupation, college from Users WHERE userName = ? OR id in ? ";
        OResultSet rs = db.query( statement, userName, userId );

        Map<String, Map<String, List<String>>> userProperties = new HashMap<>();
        while ( rs.hasNext() ) {
            OResult row = rs.next();
            Map<String, List<String>> propertyMap = new HashMap<>();

            Set<String> abc = row.getPropertyNames();
            String user;

            for( String propName : abc )
            {
                try
                {
                    List<String> props = row.getProperty( propName );
                    if( props.size() > 0 )
                    {
                        propertyMap.put( propName, props );
                    }
                }
                catch ( Exception e )
                {
                    List<String> userDetails = new ArrayList<>();
                    userDetails.add( WordUtils.capitalize( row.getProperty( "userName" ) ) );
                    userDetails.add( WordUtils.capitalize( row.getProperty( "firstName" ) + " " + row.getProperty( "lastName" ) ) );
                    userDetails.add( WordUtils.capitalize( row.getProperty( "occupation" ) ) );
                    userDetails.add( WordUtils.capitalize( propertyMap.get( "studiesAt" ).get( 0 ) ) );
                    userDetails.add( WordUtils.capitalize( propertyMap.get( "studied" ).get( 0 ) ) );
                    propertyMap.put( "userDetails", userDetails );

                }

            }
            userProperties.put( "user"+i, propertyMap );
            i++;

        }
        rs.close();

        db.close();
        orientDB.close();
        return userProperties;

    }

}

