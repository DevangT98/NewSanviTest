package com.dev.testsanvioms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        tv1 = findViewById(R.id.textview1);
        tv2 = findViewById(R.id.textview2);
        tv3 = findViewById(R.id.textview3);
        tv4 = findViewById(R.id.textview4);
        im1 = findViewById(R.id.imageview1);

        Intent i = getIntent();

        int image = (int) i.getIntExtra("productImage", 0);
        String name = i.getStringExtra("productName");
        String price = i.getStringExtra("productPrice");
        String category = i.getStringExtra("productCategory");

        im1.setImageResource(image);
        tv1.setText(String.valueOf(image));
        tv2.setText(name);
        tv3.setText(price);
        tv4.setText(category);

    }
}
