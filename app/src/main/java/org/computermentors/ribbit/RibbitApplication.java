package org.computermentors.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by CryoFlar3 on 5/22/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "rUX4eiHdm2NCsXO9tu32tAleZjlEbazatPz1ImkU", "FA7woDwObZUQGvwGZHAnqMUEkQYbjbZ94kfjJTRH");


    }
}
