package com.noaimnolab.somnum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {
    private Button logout,alarm, music, tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        logout = findViewById(R.id.logout);
        alarm = findViewById(R.id.alarm);
        music = findViewById(R.id.music);
        tips = findViewById(R.id.tips);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Dashboard.this, WelcomeScreen2.class);
                startActivity(intent);
                finish();
            }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Dashboard.this, Alarm.class);
                startActivity(intent);
                finish();
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Dashboard.this, Music.class);
                startActivity(intent);
                finish();
            }
        });

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Dashboard.this, TipOne.class);
                startActivity(intent);
                finish();
            }
        });
    }
}