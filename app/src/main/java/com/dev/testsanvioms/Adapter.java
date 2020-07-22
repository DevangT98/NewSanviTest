package com.dev.testsanvioms;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);
        final ImageView productImage;
        TextView productName, productPrice;
        Button addToCartButton;

        productImage = view.findViewById(R.id.productImageView);
        productName = view.findViewById(R.id.productNameTextView);
        productPrice = view.findViewById(R.id.priceTextView);
        addToCartButton = view.findViewById(R.id.addToCartButton);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int image = models.get(position).getProductImage();
                String name = models.get(position).getProductName();
                String category = models.get(position).getProductCategory();
                String price = models.get(position).getProductPrice();
                Log.i("YAY","*******************************");
                Log.i("YAY","YOU CLICKED ME: "+image);
                Log.i("YAY","YOU CLICKED ME: "+name);
                Log.i("YAY","YOU CLICKED ME: "+category);
                Log.i("YAY","YOU CLICKED ME: "+price);
                Log.i("YAY","*******************************");

                Intent i = new Intent(context.getApplicationContext(),CartActivity.class);
                i.putExtra("productImage",image);
                i.putExtra("productName",name);
                i.putExtra("productPrice",price);
                i.putExtra("productCategory",category);
                context.startActivity(i);
            }
        });

        productImage.setImageResource(models.get(position).getProductImage());
        productName.setText(models.get(position).getProductName());
        productPrice.setText(models.get(position).getProductPrice());
        container.addView(view,0);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
