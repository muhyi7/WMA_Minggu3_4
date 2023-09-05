package com.polije.tif.wma_minggu3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scrollView(View view) {
        Intent pindahScrollView = new Intent(MainActivity.this,ScrollView.class);
        startActivity(pindahScrollView);
    }

    public void scrollViewHorizontal(View view) {
        Intent pindahScrollViewHorizontal = new Intent(MainActivity.this,ScrollViewHorizontal.class);
        startActivity(pindahScrollViewHorizontal);
    }
}