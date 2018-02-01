package com.bignerdranch.android.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button urlButton;
    private static WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openUrl();
    }

    public void openUrl(){
        urlButton = (Button)findViewById(R.id.button);
        browser = (WebView)findViewById(R.id.webView);

        urlButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //String url = url_text.getText().toString();
                        String url = "http://128.199.46.182/arabisk/CSN/0/0.html";
                        browser.getSettings().setLoadsImagesAutomatically(true);
                        browser.getSettings().setJavaScriptEnabled(true);
                        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        browser.loadUrl(url);
                    }
                }
        );
    }
}
