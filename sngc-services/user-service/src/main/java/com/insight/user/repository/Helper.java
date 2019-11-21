package com.insight.user.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Helper
{
    public static final String DB_SERVER = "plocal:/Users/prakashp/sngc-insights/sngc-insights/orientdb-3.0.22/databases/";
    public static final String DB_NAME = "Insights";
    public static final String USER_NAME = "admin";
    public static final String PASSWORD = "admin";

    public static List<String> getTipOfTheDay(Integer day)
    {
        Map<String, List<String>> tips = new HashMap<>();

        //TODO move this data to db

        List<String> values1 = new ArrayList<>();

        values1.add( "Cold Busting Foods" );
        values1.add( "Apple" );
        values1.add( "Garlic" );
        values1.add( "White Mushrooms" );
        values1.add( "Dried Cranberries" );
        values1.add( "Pomogranate" );

        tips.put( "1",  values1 );
        tips.put( "5",  values1 );

        List<String> values2 = new ArrayList<>();

        values2.add( "Dates are good for your health" );
        values2.add( "Prevents abdominal cancer" );
        values2.add( "Maintain healthy wait" );
        values2.add( "Great Energy booster" );
        values2.add( "Strengthen bones" );
        values2.add( "Reduce risk of Stroke" );
        values2.add( "Diminish Allergic reactions" );
        values2.add( "Lower night blindness" );

        tips.put( "2",  values2 );
        tips.put( "6",  values2 );

        List<String> values3 = new ArrayList<>();

        values3.add( "Top calcium rich foods to strengthen your bones" );
        values3.add( "Milk" );
        values3.add( "Yogurt" );
        values3.add( "Soya Beans" );
        values3.add( "Orange" );
        values3.add( "Ladies Finger" );
        values3.add( "Cheese" );
        values3.add( "Turnip Greens" );
        values3.add( "Almonds" );
        values3.add( "Cinnamon" );

        tips.put( "3",  values3 );
        tips.put( "7",  values3 );

        List<String> values4 = new ArrayList<>();

        values4.add( "Protein rich nuts and seeds" );
        values4.add( "Peanut" );
        values4.add( "hemp seeds" );
        values4.add( "Soya Beans" );
        values4.add( "sunflower seeds" );
        values4.add( "sesame" );
        values4.add( "pistachios" );
        values4.add( "pumpkin seeds" );
        values4.add( "Almonds" );
        values4.add( "cashews" );

        tips.put( "4",  values4 );

        return tips.get( day.toString() );
    }
}
