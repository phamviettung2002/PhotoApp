package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.show_image);
        textView1=findViewById(R.id.show_title);
        textView2=findViewById(R.id.show_sub);
        textView1.setText(DataPhoto.GetbyId((int) getIntent().getLongExtra("xy",0)).getTitle_photo());
        textView2.setText(DataPhoto.GetbyId((int) getIntent().getLongExtra("xy",0)).getSub_photo());
        Picasso.with(this).load(DataPhoto.GetbyId((int) getIntent().getLongExtra("xy",0)).getSource_photo()).into(imageView);
    }
}