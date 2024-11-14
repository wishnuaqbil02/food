package com;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food.R;

public class FoodActivity extends AppCompatActivity {

    private ImageView foodImage;
    private TextView foodName, totalPrice;
    private EditText buyerName, phoneNumber, order;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        // Inisialisasi View
        foodImage = findViewById(R.id.FoodImage);
        foodName = findViewById(R.id.NasiGoreng); // Pastikan ID ini benar sesuai dengan yang ada di XML
        buyerName = findViewById(R.id.buyerName);
        phoneNumber = findViewById(R.id.phoneNumber);
        order = findViewById(R.id.order);
        totalPrice = findViewById(R.id.totalPrice);

        // Mendapatkan data yang dikirim dari MainActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("foodName");
        String price = intent.getStringExtra("foodPrice");
        int imageResource = intent.getIntExtra("foodImage", R.drawable.nasigoreng);

        // Menampilkan data di UI
        foodImage.setImageResource(imageResource);
        foodName.setText(name);
        totalPrice.setText(price);
    }
}
