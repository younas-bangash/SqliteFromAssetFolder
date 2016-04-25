package com.emergency.app;

import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        *         getFragmentManager().beginTransaction()
                    .add(R.id.container, new VerifyPhoneFragment())
                    .commit();
        * */


        AssetDatabaseOpenHelper myDbHelper = new AssetDatabaseOpenHelper(getApplicationContext());
       // AssetDatabaseOpenHelper myDbHelper = new AssetDatabaseOpenHelper(this);


        try {
            myDbHelper.createDataBase();
            myDbHelper.openDataBase();
            myDbHelper.getAllCountryRecord();

      }catch(SQLException sqle){

            throw sqle;
      } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
