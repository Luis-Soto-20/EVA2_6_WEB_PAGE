package com.example.eva2_6_web_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent irYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v){
        String myUriString = "http://www.youtube.com";
        irYoutube = new Intent(Intent.ACTION_VIEW, Uri.parse(myUriString));
        startActivity(irYoutube);

    }

}
