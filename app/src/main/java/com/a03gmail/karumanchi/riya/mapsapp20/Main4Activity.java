package com.a03gmail.karumanchi.riya.mapsapp20;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

import static com.a03gmail.karumanchi.riya.mapsapp20.Main2Activity.PREFS_NAME;

public class Main4Activity extends AppCompatActivity {
    private IGenericClient client;
    FhirContext ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        int patientId = settings.getInt("patientId", -1);
        if (patientId > 0) {

        }

        Log.d("TIIII","Got ID: ");
    }

    public void saveUser(View view) throws ParseException {

        EditText editTextGivenName = (EditText) findViewById(R.id.input_given_name);
        EditText editTextFamilyName = (EditText) findViewById(R.id.input_family_name);
        EditText editTexttDob = (EditText) findViewById(R.id.input_dob);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date dob_var = sdf.parse(editTexttDob.getText().toString());
        ctx = FhirContext.forDstu2();
        client = ctx.newRestfulGenericClient("http://fhirtest.uhn.ca/baseDstu2");
        Patient patient = new Patient();
        // ..populate the patient object..
        patient.addIdentifier().setSystem("urn:system").setValue("12345");
        patient.addName().addFamily("Smith").addGiven("John");

        // Invoke the server create method (and send pretty-printed JSON
        // encoding to the server
        // instead of the default which is non-pretty printed XML)
        MethodOutcome outcome = client.create()
                .resource(patient)
                .prettyPrint()
                .encodedJson()
                .execute();

        // The MethodOutcome object will contain information about the
        // response from the server, including the ID of the created
        // resource, the OperationOutcome response, etc. (assuming that
        // any of these things were provided by the server! They may not
        // always be)
        IdDt id = (IdDt) outcome.getId();
        Log.d("TIIII","Got ID: " + id.getValue());

    }
}
