package com.a03gmail.karumanchi.riya.mapsapp20.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.a03gmail.karumanchi.riya.mapsapp20.R;


public class UserProfileActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "PATIENTDATA";

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        int patientId = settings.getInt("patientId", -1);
        if (patientId > 0) {

        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(UserProfileActivity.this, EditProfileActivity.class);
                startActivity(newIntent);
            }
        });
    }

}
