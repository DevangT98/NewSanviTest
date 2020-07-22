package com.dev.testsanvioms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.dev.testsanvioms.database.ProductModel;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    ListView cartList;
    ArrayAdapter adapter;
    List<Model> cartItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartList = findViewById(R.id.cartList);
        adapter = new ArrayAdapter(CartActivity.this, android.R.layout.simple_list_item_1, cartItems);

        cartList.setAdapter(adapter);

        ProductModel.open();
        cartItems = ProductModel.getCartItems();
        Log.i("YAY", "CART ITEMS" + cartItems.get(0).getProductImage());
        Log.i("YAY", "CART ITEMS" + cartItems.get(0).getProductName());
        Log.i("YAY", "CART ITEMS" + cartItems.get(0).getProductPrice());
        Log.i("YAY", "CART ITEMS" + cartItems.get(0).getProductCategory());
        ProductModel.close();
    }
}
