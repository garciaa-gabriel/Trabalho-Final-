package com.example.barbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Barber Shop");
        getSupportActionBar().hide();

        btsend = (Button) findViewById(R.id.btsend);
        btsend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.btsend){
            Intent intent = new Intent(getApplicationContext(), homeActivity.class);
            startActivity(intent);
        }
    }



}