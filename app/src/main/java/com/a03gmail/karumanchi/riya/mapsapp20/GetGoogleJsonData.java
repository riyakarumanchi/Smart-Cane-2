package com.a03gmail.karumanchi.riya.mapsapp20;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Mike on 29-Apr-17.
 */

public class GetGoogleJsonData extends AsyncTask<String, Void, String> {

    private Activity myActivity;

    /**
     * constructor that gets the activity
     * @param inActivity
     */
    public GetGoogleJsonData(Activity inActivity) {

        myActivity = inActivity;

    }

    /**
     * creates a background call for getting async data
     * @param params
     * @return
     */
    @Override
    protected String doInBackground(String... params) {

        Log.d("uri", "Starting Background Task");
        String results = "";


        try {
            URL url = new URL(params[0]);           // was HttpGet

            // Open the Connection - GET is the default setRequestMethod
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Read the response
            int statusCode = conn.getResponseCode();
            Log.d("uri", "Response Code: " + statusCode);

            if (statusCode == 200) {
                InputStream inputStream = new BufferedInputStream(conn.getInputStream());

                BufferedReader bufferedReader =
                        new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    results += line;                // Use a StringBuilder class if expecting many lines!!
                }
            }

        } catch (IOException ex) {
            Log.d("uri", ex.getMessage());
        }

        return results;
    }


    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        // Dismiss the progress dialog
        if(result !=null)
        {
            try {
                JSONObject m_obj = new JSONObject(result);
                JSONArray m_arr = m_obj
                        .getJSONArray("routes");

                for (int i = 0; i < m_arr.length(); i++) {
                    JSONObject m_sJobj = m_arr.getJSONObject(i);
                    JSONArray legs_array = m_sJobj.getJSONArray("legs");
                    for(int j =0; j< legs_array.length(); j++){
                        JSONObject legs_obj = legs_array.getJSONObject(j);
                        JSONArray steps_array = legs_obj.getJSONArray("steps");
                        for(int k =0; k< steps_array.length(); k++){
                            String step =  steps_array.getJSONObject(k).getString("html_instructions");
                            step.length();
                        }
                    }
                }
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
/**
 * Updating parsed JSON data into ListView
 * */
 /*  ListAdapter adapter = new SimpleAdapter(
        MainActivity.this, contactList,
        R.layout.list_item, new String[] { TAG_LONGNAME, TAG_SHORTNAME,
                TAG_TYPES }, new int[] { R.id.name,
                R.id.email, R.id.mobile });

setListAdapter(adapter);
 */
    }
}
