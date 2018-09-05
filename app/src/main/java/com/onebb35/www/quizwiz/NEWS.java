package com.onebb35.www.quizwiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NEWS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        WebView wv=(WebView)findViewById(R.id.the_webview);
        wv.loadUrl("https://www.realmadrid.com/en/about-real-madrid/news");
    }
}
