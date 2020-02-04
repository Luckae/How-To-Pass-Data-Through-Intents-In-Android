package com.books.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    String string;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        Intent intent = SecondActivity.this.getIntent();

        string = Objects.requireNonNull(intent.getExtras()).getString("FIRST");

        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();



    }
}
