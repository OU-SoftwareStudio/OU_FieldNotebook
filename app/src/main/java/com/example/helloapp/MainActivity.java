package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // removing top bar.
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);
        Log.d("HelloApp", "onCreate called."); // This is a log output!
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("HelloApp", "onStart called."); // This is a log output!
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("HelloApp", "onResume called."); // This is a log output!


    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("HelloApp", "onPause called."); // This is a log output!
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("HelloApp", "onStop called."); // This is a log output!
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("HelloApp", "onDestroy called."); // This is a log output!
    }
}
