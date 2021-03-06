package com.bdg.master.abstraction;


import com.bdg.master.abstraction.publishmnet.FacebookPublisher;
import com.bdg.master.abstraction.publishmnet.GooglePublisher;
import com.bdg.master.abstraction.publishmnet.Placement;
import com.bdg.master.abstraction.publishmnet.Publisher;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        String publishServiceName = "google";
        Placement placement = new Placement("Google", "some google placement", new byte[100]);


        Publisher publisher = null;

        if (publishServiceName == "google") {
            publisher = new GooglePublisher();
        } else {
            publisher = new FacebookPublisher();
        }

        publisher.doPublish(placement);
    }
}
