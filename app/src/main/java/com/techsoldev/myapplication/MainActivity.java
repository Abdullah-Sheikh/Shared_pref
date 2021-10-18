package com.techsoldev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("Mobile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Name","Abdullah");
        editor.putInt("Age",20);


        SharedPreferences sharedPreferences1 =getSharedPreferences("Mobile",0);
        String name = sharedPreferences1.getString("Name","");
        int age=sharedPreferences1.getInt("Age",0);

        Toast.makeText(this, "The name is : "+name + "and Age is : "+ age, Toast.LENGTH_SHORT).show();
    }
}