package com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.food.R;

public class MainActivity extends AppCompatActivity {

    private ImageView nasiGorengImage, mieAyamImage, baksoImage, ayamGeprekImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nasiGorengImage = findViewById(R.id.nasiGorengImage);
        mieAyamImage = findViewById(R.id.mieAyamImage);
        baksoImage = findViewById(R.id.baksoImage);
        ayamGeprekImage = findViewById(R.id.ayamGeprekImage);

// Set click listener untuk setiap item menu
        nasiGorengImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke FoodActivity
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);

                // Menambahkan data yang dikirim ke FoodActivity
                intent.putExtra("foodName", "Nasi Goreng");
                intent.putExtra("foodPrice", "Rp 12.000");
                intent.putExtra("foodImage", R.drawable.nasigoreng); // Gambar harus ada di drawable

                // Memulai aktivitas FoodActivity
                startActivity(intent);
            }
        });

        mieAyamImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke FoodActivity
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);

                // Menambahkan data yang dikirim ke FoodActivity
                intent.putExtra("foodName", "Mie Ayam");
                intent.putExtra("foodPrice", "Rp 15.000");
                intent.putExtra("foodImage", R.drawable.mieayam); // Gambar harus ada di drawable

                // Memulai aktivitas FoodActivity
                startActivity(intent);
            }
        });

        baksoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke FoodActivity
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);

                // Menambahkan data yang dikirim ke FoodActivity
                intent.putExtra("foodName", "Bakso");
                intent.putExtra("foodPrice", "Rp 13.000");
                intent.putExtra("foodImage", R.drawable.bakso); // Gambar harus ada di drawable

                // Memulai aktivitas FoodActivity
                startActivity(intent);
            }
        });

        ayamGeprekImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke FoodActivity
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);

                // Menambahkan data yang dikirim ke FoodActivity
                intent.putExtra("foodName", "Ayam Geprek");
                intent.putExtra("foodPrice", "Rp 20.000");
                intent.putExtra("foodImage", R.drawable.ayamgeprek); // Gambar harus ada di drawable

                // Memulai aktivitas FoodActivity
                startActivity(intent);
            }
        });
    }
}