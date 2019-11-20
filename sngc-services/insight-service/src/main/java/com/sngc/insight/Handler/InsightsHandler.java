package com.sngc.insight.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.record.OEdge;
import com.orientechnologies.orient.core.record.OVertex;
import com.orientechnologies.orient.core.sql.executor.OResult;
import com.orientechnologies.orient.core.sql.executor.OResultSet;
import com.sngc.insight.Repository.InsightsRepository;

public class InsightsHandler
{
    private static final String INSIGHTS = "insights";
    private InsightsRepository insightsRepository;

    public Map<String, Map<String, List<String>>> getInsights( Map<String, String> UserIds )
    {
        insightsRepository = new InsightsRepository();

        Map<String, Map<String, List<String>>> userProps = insightsRepository.getEdges( UserIds );

        this.createInsights( userProps );

        return userProps;
    }

    private void createInsights( Map<String, Map<String, List<String>>> userProps ) {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER, OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        Map<String, List<String>> user1Properties = userProps.get( "user1" );
        Map<String, List<String>> user2Properties = userProps.get( "user0" );

        Map<String, List<String>> insights = new HashMap<>();

        try {


            String user0 = user2Properties.get( "userDetails" ).get( 0 );
            String user1 = user1Properties.get( "userDetails" ).get( 0 );

            this.AnalyseTotalHoursSpend( user1Properties, user2Properties, insights, user0, user1 );

            List<String> marks = new ArrayList<>();

            for ( String key : user1Properties.keySet() ) {
                if ( user2Properties.get( key ) != null ) {
                    if ( key.equals( Helper.FAVOURITE_MUSIC ) ) {
                        List<String> favouriteMusic = new ArrayList<>();
                        for ( String value : user1Properties.get( key ) ) {
                            if ( user2Properties.get( key ).contains( value ) ) {
                                favouriteMusic.add( "Both users are interested in " + value );
                            }
                        }

                        insights.put( key, favouriteMusic );
                    }


                    if ( key.equals( Helper.INTERESTED ) ) {
                        for ( String value : user1Properties.get( key ) ) {
                            if ( user2Properties.get( key ) != null ) {
                                insights.put( key, Arrays.asList( "Both users are interested in " + value ) );
                            }
                        }
                    }

                    if ( key.equals( Helper.SSLC_MARKS ) ) {


                        int sslc1 = Integer.parseInt( user1Properties.get( key ).get( 0 ).substring( 0, 2 ) );
                        int sslc2 = Integer.parseInt( user2Properties.get( key ).get( 0 ).substring( 0, 2 ) );

                        if ( sslc2 > sslc1 ) {
                            marks.add( user1 + " scored better marks than you in 10th exam" );
                            if ( sslc2 > 90 ) marks.add( user1 + " scored excellent marks in 10th exam" );
                        } else {
                            marks.add( "you have scored better marks in the 10th exam" );
                            if ( sslc1 > 90 ) marks.add( " you have scored excellent marks in 10th exam" );
                            if ( sslc2 < 50 ) marks.add( user1 + " performed poorly in 10th exam" );
                        }

                    }

                    if ( key.equals( Helper.PLUS_TWO_MARKS ) ) {


                        int plus1 = Integer.parseInt( user1Properties.get( key ).get( 0 ).substring( 0, 2 ) );
                        int plus2 = Integer.parseInt( user2Properties.get( key ).get( 0 ).substring( 0, 2 ) );

                        if ( plus2 > plus1 ) {
                            marks.add( user1 + " scored better marks than you in 12th exam" );
                            if ( plus2 > 90 ) marks.add( user1 + " scored excellent marks in 12th exam" );
                        } else {
                            marks.add( "you have scored better marks in the 12th exam" );
                            if ( plus1 > 90 ) marks.add( " you have scored excellent marks in 12th exam" );
                            if ( plus2 < 50 ) marks.add( user1 + " performed poorly in 12th exam" );
                        }

                    }

                    if ( key.equals( Helper.DEGREE_MARKS ) ) {


                        int plus1 = Integer.parseInt( user1Properties.get( key ).get( 0 ).substring( 0, 2 ) );
                        int plus2 = Integer.parseInt( user2Properties.get( key ).get( 0 ).substring( 0, 2 ) );

                        if ( plus2 > plus1 ) {
                            marks.add( user1 + " scored better marks than you in degree exam" );
                            if ( plus2 > 90 ) marks.add( user1 + " scored excellent marks in degree exam" );
                        } else {
                            marks.add( "you have scored better marks in the degree exam" );
                            if ( plus1 > 90 ) marks.add( " you have scored excellent marks in degree exam" );
                            if ( plus2 < 50 ) marks.add( user1 + " performed poorly in degree exam" );
                        }

                    }

                    insights.put( Helper.MARKS, marks );

                    if ( key.equals( Helper.NOT_INTERESTED ) ) {
                        List<String> notInterested = new ArrayList<>();
                        for ( String value : user1Properties.get( key ) ) {

                            if ( user2Properties.get( Helper.INTERESTED ).contains( value ) )
                                notInterested.add( user0 + " is not interested in " + value + " buy you are interested " );

                            insights.put( key, notInterested );
                        }
                    }

                    if ( key.equals( Helper.LIKES_TO_EAT ) ) {
                        List<String> likesToEat = new ArrayList<>();
                        List<String> unHealthyFoods = new ArrayList<>( Arrays.asList( "pizza", "burger", "fries" ) );


                        if ( user2Properties.get( key ).contains( unHealthyFoods ) )
                            likesToEat.add( "avoid eating unhealthy foods. This will make you lazy. reduce your concentration and eventually become less active" );

                        if ( user2Properties.get( key ).contains( unHealthyFoods ) && !user1Properties.get( key ).contains( unHealthyFoods ) )
                            likesToEat.add( user0 + " does not eat unhealthy foods !!! Would be better to improve it from your side as well" );

                        if ( !user2Properties.get( key ).contains( unHealthyFoods ) )
                            likesToEat.add( "you have good eating habits !!! Whooo  hoooooo" );

                        insights.put( key, likesToEat );
                    }

                    List<String> wantToBecome = new ArrayList<>();
                    List<String> wantToBecomeLinks = new ArrayList<>();
                    if ( key.equals( Helper.WANT_TO_BECOME ) ) {


                        if ( user2Properties.get( key ).get( 0 ).equals( "civil service".toLowerCase() ) ) {
                            String statement = "SELECT * FROM " + Helper.CIVIL_SERVICE;
                            OResultSet rs = db.query( statement );

                            while ( rs.hasNext() ) {
                                OResult row = rs.next();
                                wantToBecome.add( row.getProperty( "name" ) );
                                if ( !row.getProperty( Helper.LINK ).equals( Helper.NA ) ) {
                                    wantToBecomeLinks.add( row.getProperty( "link" ) );
                                }

                            }
                        } else if ( user2Properties.get( key ).get( 0 ).equals( "top it companies" ) ) {
                            String statement = "SELECT * FROM " + Helper.TOP_IT_COMPANIES;
                            OResultSet rs = db.query( statement );

                            while ( rs.hasNext() ) {
                                OResult row = rs.next();
                                wantToBecome.add( row.getProperty( "name" ) );
                                if ( !row.getProperty( Helper.LINK ).equals( Helper.NA ) ) {
                                    wantToBecomeLinks.add( row.getProperty( "link" ) );
                                }

                            }

                        } else if ( user2Properties.get( key ).get( 0 ).equals( "Govt Job" ) ) {
                            String statement = "SELECT * FROM " + Helper.GOVT_JOV;
                            OResultSet rs = db.query( statement );

                            while ( rs.hasNext() ) {
                                OResult row = rs.next();
                                wantToBecome.add( row.getProperty( "name" ) );
                                if ( !row.getProperty( Helper.LINK ).equals( Helper.NA ) ) {
                                    wantToBecomeLinks.add( row.getProperty( "link" ) );
                                }

                            }

                        }

                        insights.put( key, wantToBecome );
                        insights.put( key + "links", wantToBecomeLinks );

                    }


                }
            }


            int size1 = user1Properties.get( "interested" ).size();
            int size2 = user2Properties.get( "interested" ).size();

            List<String> user0List = new ArrayList<>();
            List<String> user1List = new ArrayList<>();

            for ( int i = 0; i < size1; i++ ) {
                user1List.add( String.valueOf( ( int ) ( Math.random() * ( 20 ) + 1 ) ) );
            }

            for ( int i = 0; i < size2; i++ ) {
                user0List.add( String.valueOf( ( int ) ( Math.random() * ( 20 ) + 1 ) ) );
            }

            userProps.get( "user0" ).put( "day", user0List );
            userProps.get( "user1" ).put( "day", user1List );

            userProps.put( INSIGHTS, insights );
        }
        finally {
            orientDB.close();
            db.close();
        }
    }

    private void AnalyseTotalHoursSpend( Map<String, List<String>> user1Properties, Map<String, List<String>> user2Properties, Map<String, List<String>> insights, String user1, String user2 )
    {
        List<Integer> user1TotalTime = new ArrayList<>();
        List<Integer> user2TotalTime = new ArrayList<>();

        List<String> keyList = new ArrayList<>();

        Integer totalStudyUser1 = user1Properties.get( Helper.STUDY ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.STUDY, Arrays.asList( totalStudyUser1.toString() ) );

        keyList.add( Helper.STUDY );

        user1TotalTime.add( totalStudyUser1 );

        Integer totalStudyUser2 = user2Properties.get( Helper.STUDY ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.STUDY+ "2", Arrays.asList( totalStudyUser2.toString() ) );
        user2TotalTime.add( totalStudyUser2 );

        Integer totalTravelUser1 = user1Properties.get( Helper.TRAVEL ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        keyList.add( Helper.TRAVEL );

        insights.put( Helper.TRAVEL, Arrays.asList( totalTravelUser1.toString() ) );

        user1TotalTime.add( totalTravelUser1 );

        Integer totalTravelUser2 = user2Properties.get( Helper.TRAVEL ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.TRAVEL+ "2", Arrays.asList( totalTravelUser2.toString() ) );

        user2TotalTime.add(totalTravelUser2);


        Integer totalGamesUser1 = user1Properties.get( Helper.GAMES ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        keyList.add( Helper.GAMES );

        insights.put( Helper.GAMES, Arrays.asList( totalStudyUser1.toString() ) );

        user1TotalTime.add( totalGamesUser1 );

        Integer totalGamesUser2 = user2Properties.get( Helper.GAMES ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.GAMES+ "2", Arrays.asList( totalGamesUser2.toString() ) );

        user2TotalTime.add( totalGamesUser2 );

        /*Integer totalSleepUser1 = user1Properties.get( Helper.SLEEP ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );


        insights.put( Helper.SLEEP, Arrays.asList( totalSleepUser1.toString() ) );

        user1TotalTime.add( totalSleepUser1 );

        Integer totalSleepUser2 = user2Properties.get( Helper.SLEEP ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.SLEEP+ "2", Arrays.asList( totalSleepUser2.toString() ) );

        user2TotalTime.add( totalSleepUser2 );
*/
        Integer totalReadingUser1 = user1Properties.get( Helper.READING ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        keyList.add( Helper.READING );

        insights.put( Helper.READING, Arrays.asList( totalReadingUser1.toString() ) );

        user1TotalTime.add( totalReadingUser1 );

        Integer totalReadingUser2 = user2Properties.get( Helper.READING ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.READING+ "2", Arrays.asList( totalReadingUser2.toString() ) );

        user2TotalTime.add( totalReadingUser2 );

        Integer totalWritingUser1 = user1Properties.get( Helper.WRITING ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.WRITING, Arrays.asList( totalWritingUser1.toString() ) );

        keyList.add( Helper.WRITING );

        user1TotalTime.add( totalWritingUser1 );

        Integer totalWritingUser2 = user2Properties.get( Helper.WRITING ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.WRITING + "2", Arrays.asList( totalWritingUser2.toString() ) );

        user2TotalTime.add( totalWritingUser2 );

        Integer totalTvUser1 = user1Properties.get( Helper.TV ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );
        insights.put( Helper.TV, Arrays.asList( totalTvUser1.toString() ) );
        keyList.add( Helper.TV );


        user1TotalTime.add( totalTvUser1 );

        Integer totalTvUser2 = user2Properties.get( Helper.TV ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );
        insights.put( Helper.TV+ "2", Arrays.asList( totalTvUser2.toString() ) );

        user2TotalTime.add( totalTvUser2 );

        Integer totalComputerGamesUser1 = user1Properties.get( Helper.COMPUTER_GAMES ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );
        insights.put( Helper.COMPUTER_GAMES, Arrays.asList( totalComputerGamesUser1.toString() ) );

        keyList.add( Helper.COMPUTER_GAMES );

        user1TotalTime.add( totalComputerGamesUser1 );

        Integer totalComputerGamesUser2 = user2Properties.get( Helper.COMPUTER_GAMES ).stream().map( x -> Integer.parseInt( x ) )
                .reduce( 0, Integer::sum );

        insights.put( Helper.COMPUTER_GAMES + "2", Arrays.asList( totalComputerGamesUser2.toString() ) );

        user2TotalTime.add( totalComputerGamesUser2 );

        Collections.sort( user1TotalTime );
        Collections.sort( user2TotalTime );

        List<String> timeAnalysys = new ArrayList<>();

        int minTimeUser1 = user1TotalTime.get( 0 );
        int maxTimeUser1 = user1TotalTime.get( user1TotalTime.size() - 1 );
        int minTimeUser2 = user2TotalTime.get( 0 );
        int maxTimeUser2 = user2TotalTime.get( user2TotalTime.size() - 1 );

        for( String key : keyList )
        {
            if ( user1Properties.get( key ).stream().map( x -> Integer.parseInt( x ) )
                    .reduce( 0, Integer::sum ).equals( minTimeUser1 ) )
            {
                timeAnalysys.add( user1 + " min time spend on " + key );
            }
            if ( user1Properties.get( key ).stream().map( x -> Integer.parseInt( x ) )
                    .reduce( 0, Integer::sum ).equals( maxTimeUser1 ) )
            {
                timeAnalysys.add( user1 + " max time spend on " + key );
            }

        }

        for( String key : keyList )
        {
            if ( user2Properties.get( key ).stream().map( x -> Integer.parseInt( x ) )
                    .reduce( 0, Integer::sum ).equals( minTimeUser2 ) )
            {
                timeAnalysys.add( user2 + " min time spend on " + key );
            }
            if ( user2Properties.get( key ).stream().map( x -> Integer.parseInt( x ) )
                    .reduce( 0, Integer::sum ).equals( maxTimeUser2 ) )
            {
                timeAnalysys.add( user2 + " max time spend on " + key );
            }

        }

        insights.put( "timeAnalysys", timeAnalysys );


    }
}
