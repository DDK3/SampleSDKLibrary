package com.sustlabs.ohmassistantsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PairingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairing);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }
}