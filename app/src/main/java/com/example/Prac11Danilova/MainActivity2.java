package com.example.Prac11Ptushkin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
                startActivity(MainActivity3);
            }
        });
    }
}