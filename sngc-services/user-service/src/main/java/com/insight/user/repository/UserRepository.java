package com.insight.user.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.insight.user.model.LoginDetails;
import com.insight.user.model.SearchDetails;
import com.insight.user.model.User;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.record.OEdge;
import com.orientechnologies.orient.core.record.OElement;
import com.orientechnologies.orient.core.record.OVertex;
import com.orientechnologies.orient.core.sql.executor.OResult;
import com.orientechnologies.orient.core.sql.executor.OResultSet;

public class UserRepository
{
    public void createConnection( User user )
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        try
        {
            OVertex userVertex = db.newVertex("Users");
            userVertex.setProperty("id", user.getId().toLowerCase());
            userVertex.setProperty("age",user.getAge());
            userVertex.setProperty("firstName",user.getFirstName().toLowerCase());
            userVertex.setProperty("lastName",user.getLastName().toLowerCase());
            //userVertex.setProperty("gender", Gender.FEMALE.toString());
            userVertex.setProperty( "email", user.getEmail().toLowerCase());
            userVertex.setProperty("phoneNumber", user.getPhoneNumber().toLowerCase());
            userVertex.setProperty( "occupation", user.getOccupation().toLowerCase() );
            userVertex.setProperty("userName", user.getUserName().toLowerCase());
            userVertex.setProperty( "password", user.getPassword().toLowerCase());

            userVertex.save();

            String statement = "SELECT FROM Occupation WHERE name = ? ";
            OResultSet rs = db.query(statement, user.getOccupation().toLowerCase() );

            while(rs.hasNext())
            {
                OResult row = rs.next();

                Optional<OVertex> oVertexOptional = row.getVertex();

                OVertex ov = oVertexOptional.get();

                OEdge oEdge = db.newEdge( userVertex, ov, "is"+user.getOccupation() );
                oEdge.save();
            }

            String statement1 = "SELECT FROM Countries WHERE name = ? ";
            OResultSet rs1 = db.query(statement1, user.getCountry().toLowerCase() );

            while(rs1.hasNext())
            {
                OResult row = rs1.next();

                Optional<OVertex> oVertexOptional = row.getVertex();

                OVertex ov = oVertexOptional.get();

                OEdge oEdge = db.newEdge( userVertex, ov, "livesIn" );
                oEdge.save();
            }

            String statement2 = "SELECT FROM College WHERE name = ? ";
            OResultSet rs2 = db.query(statement2, user.getCollege() );

            while(rs2.hasNext())
            {
                OResult row = rs2.next();

                Optional<OVertex> oVertexOptional = row.getVertex();

                OVertex ov = oVertexOptional.get();

                OEdge oEdge = db.newEdge( userVertex, ov, "studiesAt" );
                oEdge.save();
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException( e.getMessage() + e.getCause() );
        }
        finally
        {
            db.close();
            orientDB.close();
        }



    }

    public LoginDetails getUserDetails( LoginDetails loginDetails)
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        LoginDetails loginDetailsFromDb = null;
        try
        {
            String statement = "SELECT FROM Users WHERE userName = ? and password = ?";
            OResultSet rs = db.query(statement, loginDetails.getUserName().toLowerCase(), loginDetails.getPassword().toLowerCase() );

            while( rs.hasNext() )
            {
                OResult row = rs.next();

                loginDetailsFromDb = new LoginDetails( row.getProperty( "userName" ), row.getProperty( "password" ), row.getProperty( "occupation" ), row.getProperty( "firstName" ) );

            }
            rs.close();
        } catch (Exception e)
        {
            throw new RuntimeException( e.getMessage() );
        }
        finally
        {

            db.close();
            orientDB.close();
        }

        return loginDetailsFromDb;
    }

    public List<SearchDetails> getSearchDetails( String firstName, String lastName )
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        List<SearchDetails> searchDetailsList = new ArrayList<>();

        try
        {
            String statement = "SELECT FROM Users WHERE firstName = ? and lastName = ?";
            OResultSet rs = db.query( statement, firstName.toLowerCase(), lastName.toLowerCase() );

            SearchDetails searchDetails = null;

            while( rs.hasNext() )
            {
                OResult row = rs.next();

                searchDetails = new SearchDetails( row.getProperty( "id" ), row.getProperty( "userName" ), row.getProperty( "firstName" ) + " " + row.getProperty( "lastName" ), row.getProperty( "occupation" ) );

                searchDetailsList.add( searchDetails );

            }
            rs.close();
        } catch (Exception e)
        {
            throw new RuntimeException( e.getMessage() );
        }
        finally
        {

            db.close();
            orientDB.close();
        }

        return searchDetailsList;
    }
}
