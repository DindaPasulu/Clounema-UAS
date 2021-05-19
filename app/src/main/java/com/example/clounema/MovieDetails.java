package com.example.clounema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MovieDetails extends AppCompatActivity {

    private Button pilihJadwal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        pilihJadwal = findViewById(R.id.btn_pilih_jadwal);
        pilihJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieDetails.this, PilihJadwal.class);
                startActivity(intent);
            }
        });
    }
}