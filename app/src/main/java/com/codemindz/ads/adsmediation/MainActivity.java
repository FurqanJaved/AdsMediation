package com.codemindz.ads.adsmediation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    private FrameLayout nativeAdContainer;
    String admob_native = "ca-app-pub-3940256099942544/224769611";
    String applovin_native = "35d5c7242db04144";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nativeAdContainer = findViewById(R.id.native_ad_layout);

        NativeAds.NativeAds(nativeAdContainer, MainActivity.this, admob_native, applovin_native);
    }
}