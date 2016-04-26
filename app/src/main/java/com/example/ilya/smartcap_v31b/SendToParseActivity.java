package com.example.ilya.smartcap_v31b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Stanley on 4/25/16.
 */

public class SendToParseActivity extends AppCompatActivity {
    private static final String TAG = "SendToParseActivity";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_to_parse);
        boolean conn = isNetworkConnected();
        Log.v(TAG, String.valueOf(conn));
        Parse.initialize(this, "BDo39lSOtPuBwDfq0EBDgIjTzztIQE38Fuk03EcR", "6exCVtTYC6JhQP6gw1OFByyP2RRq5McznAsoQ3Gq");
        ParseUser.enableAutomaticUser();
        Date now = new Date();
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(now);
        ParseObject testObject = new ParseObject("Bottle");
        Log.v(TAG, timestamp);
        testObject.put("UUID", timestamp);
        testObject.saveInBackground();



//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.IMG_20160216_215228925);
//        ByteArrayOutputStream stream = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
//        byte[] image = stream.toByteArray();
//        ParseFile file = new ParseFile("smile.png", image);
//        file.saveInBackground();
//        ParseObject testObjectImage = new ParseObject("Image");
//        testObjectImage.put("image", file);
//        testObjectImage.saveInBackground();





//        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo ni = cm.getActiveNetworkInfo();
//        if ((ni != null) && (ni.isConnected())) {
//            if (!ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())) {
//                // If we have a network connection and a current
//                // logged in user, sync the todos
//                Toast.makeText(
//                        getApplicationContext(),
//                        "Connected",
//                        Toast.LENGTH_LONG).show();
//            } else {
//                // If we have a network connection but no logged in user, direct
//                // the person to log in or sign up.
//                Toast.makeText(
//                        getApplicationContext(),
//                        "No logged",
//                        Toast.LENGTH_LONG).show();
//                //ParseLoginBuilder builder = new ParseLoginBuilder(this);
//                //startActivityForResult(builder.build(), LOGIN_ACTIVITY_CODE);
//            }
//        } else {
//            // If there is no connection, let the user know the sync didn't happen
//            Toast.makeText(
//                    getApplicationContext(),
//                    "Your device appears to be offline. Some todos may not have been synced to Parse.",
//                    Toast.LENGTH_LONG).show();
//        }
//        Log.v(TAG, "dddddddd");
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null) {
            // There are no active networks.
            return false;
        } else
            return true;
    }
}