package com.sustlabs.sdksampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sustlabs.ohmassistantsdk.OhmUIHelper;

public class MainActivity extends AppCompatActivity {

    Button mPairingButton;
    Button mOhmButton;
    OhmUIHelper mOhmHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOhmHelper = new OhmUIHelper(this);
        mPairingButton = findViewById(R.id.btn_pairing);
        mOhmButton = findViewById(R.id.btn_ohm);

        mPairingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mOhmHelper.startPairingProcess();
            }
        });

        mOhmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mOhmHelper.startOhmUI();
            }
        });

    }
}