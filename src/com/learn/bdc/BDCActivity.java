package com.learn.bdc;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class BDCActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFullscreen();
        super.loadUrl("file:///android_asset/www/index.html");
        
    }
    public void setFullscreen() {  
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);//清除FLAG  
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
                       WindowManager.LayoutParams.FLAG_FULLSCREEN);  
    }
}
