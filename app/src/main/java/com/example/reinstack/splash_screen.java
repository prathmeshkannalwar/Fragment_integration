package com.example.reinstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {
    ImageView logo;
    TextView txtMarquee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

// casting of textview
        txtMarquee = (TextView) findViewById(R.id.marqueetxtmain);

        // Now we will call setSelected() method
        // and pass boolean value as true
        txtMarquee.setSelected(true);

        logo = findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);

    }
}