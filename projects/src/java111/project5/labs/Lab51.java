package java111.project5.labs;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *  Lab 5-1
 *
 *@author    eknapp
 */
public class Lab51 {

    /**
     *  Main processing method for the Lab51 object
     */
    public void run() {

        // Locale Date
        System.out.println("[java111.project5.labs.Lab51 > run( )] "
                 + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));
        // Custom Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String customDate = sdf.format(new Date());
        System.out.println("[java111.project5.labs.Lab51 > run( )] "
                 + customDate);
        // Original deprecated
        // System.out.println("[java111.project5.labs.Lab51 > run( )] "
        //       + (new Date()).toLocaleString());

    }
}
