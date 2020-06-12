package com.example.handy_guard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButton1(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
        startActivity(myIntent);

    }
}
