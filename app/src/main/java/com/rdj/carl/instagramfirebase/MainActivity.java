package com.rdj.carl.instagramfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    //banner_ad_unit_id
    private AdView adAdMob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MobileAds.initialize(getApplicationContext(), "ca-app-pub-3609428154012395/7642232011");

        adAdMob = (AdView) findViewById(R.id.adAdMob);
        AdRequest adRequest = new AdRequest.Builder().build();
        adAdMob.loadAd(adRequest);

    }
}
