package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PhoTo> arrayList;
    GridView gridView;
    @SuppressLint("MissingInflatedId")
//    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//            intent.putExtra("xy",gridView.getAdapter().getItemId(position));
//            startActivity(intent);
//        }
//    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView =findViewById(R.id.grid);
        arrayList=DataPhoto.GetData();
        PhoToAdapter phoToAdapter = new PhoToAdapter(arrayList,getApplicationContext());
        gridView.setAdapter(phoToAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("xy",gridView.getAdapter().getItemId(position));
                startActivity(intent);
            }
        });
    }
}