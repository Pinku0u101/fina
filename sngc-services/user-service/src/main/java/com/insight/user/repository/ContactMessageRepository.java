package com.insight.user.repository;


import com.insight.user.model.ContactMessage;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.record.OElement;

public class ContactMessageRepository
{

    public ContactMessage createContactMessage( ContactMessage contactMessage )
    {
        OrientDB orientDB = new OrientDB( Helper.DB_SERVER , OrientDBConfig.defaultConfig() );

        ODatabaseSession db = orientDB.open( Helper.DB_NAME, Helper.USER_NAME, Helper.PASSWORD );

        if ( db.getClass( "ContactMessage" ) == null  )
        {
            db.createVertexClass( "ContactMessage" );
            db.newVertex( "ContactMessage" );
        }

        try
        {
            OElement vertex = db.newInstance( "ContactMessage" );
            vertex.setProperty("Id", contactMessage.getId());
            vertex.setProperty("Email", contactMessage.getEmail());
            vertex.setProperty("FirstName", contactMessage.getFirstName());
            vertex.setProperty("LastName", contactMessage.getLastName());
            vertex.setProperty("phoneNumber", contactMessage.getPhoneNumber());
            vertex.setProperty("Message", contactMessage.getMessage() );

            vertex.save();
            vertex.clear();


        }
        catch (Exception e)
        {

        }
        finally
        {
            db.close();
            orientDB.close();

        }
        return contactMessage;
    }
}
