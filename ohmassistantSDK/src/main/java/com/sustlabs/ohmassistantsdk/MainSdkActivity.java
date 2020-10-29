package com.sustlabs.ohmassistantsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainSdkActivity extends AppCompatActivity {
    WebView ohmWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sdk);
        ohmWebView = findViewById(R.id.ohmWebView);
        ohmWebView.setWebViewClient(new MyWebViewClient());
        ohmWebView.getSettings().setDomStorageEnabled(true);
        ohmWebView.getSettings().setJavaScriptEnabled(true);
        ohmWebView.loadUrl("https://sustlabs-app-in-app.firebaseapp.com");
//        ohmWebView.loadUrl("http://www.google.com");

    }
    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.equals("https://stackoverflow.com/users/7666442/nilesh-rathod?tab=profile")) {

                finish() ;
                Toast.makeText(MainSdkActivity.this, "URL DETECTED", Toast.LENGTH_SHORT).show();
                // perform your action here
            } else {
                view.loadUrl(url);
            }
            return true;
        }
    }

}