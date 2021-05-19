package com.example.clounema;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    private Button signOutBtn;
    ImageView poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //assign variable
        poster1 = findViewById(R.id.movie1);
        poster2 = findViewById(R.id.movie2);
        poster3 = findViewById(R.id.movie3);
        poster4 = findViewById(R.id.movie4);
        poster5 = findViewById(R.id.movie5);
        poster6 = findViewById(R.id.movie6);
        poster7 = findViewById(R.id.movie7);
        poster8 = findViewById(R.id.movie8);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navbar);
        //set home selected
        navigationView.setSelectedItemId(R.id.nav_home);

        // Intent to MovieDetail
        poster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });
        poster8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MovieDetails.class);
                startActivity(intent);
            }
        });

        //ItemSelectedList
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        return true;
                    case R.id.nav_ticket:
                        startActivity(new Intent(getApplicationContext(), OrderDetails.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}