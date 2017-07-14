package com.phonegap.pgcontactsreadapp;
import android.os.Bundle;
import org.apache.cordova.DroidGap;
public class PGContactsReadAppActivity extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
