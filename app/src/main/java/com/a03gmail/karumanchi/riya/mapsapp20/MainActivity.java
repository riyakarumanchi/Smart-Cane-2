package com.a03gmail.karumanchi.riya.mapsapp20;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // Just randoly adding a comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get origin and destination text
                EditText origin = (EditText) findViewById(R.id.origin);
                EditText destination = (EditText) findViewById(R.id.destination);
                String originText = origin.getText().toString();
                String destText = destination.getText().toString();

                // convert all spaces to + for json request
                originText = originText.replaceAll(" ", "+");
                destText = destText.replaceAll(" ", "+");



                String url = "https://maps.googleapis.com/maps/api/directions/json?origin=" +
                        originText + "&destination=" + destText +
                        "&mode=walking&key=AIzaSyD8974NwJZgDcS7x82l3wYgAVMWzBiXu6U";

                JsonObjectRequest jsObjRequest = new JsonObjectRequest
                        (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("test", "Response: " + response.toString());
                            }
                        }, new Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("jsonError", error.toString());
                            }
                        });

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });





        // add in text box listeners for getting the start and destination
        // DON'T FORGET, EVENTUALLY USER SHOULD BE ABLE TO DO THIS VERBALLY
        // I.E. app should say "say where you would like to go", and start
        // should automatically take current location

        //Testing the parser to return latitude and longitude
        //Parser parser = new Parser();
        //parser.googleMapsParser();

    }

    public void goToHelpScreen(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
