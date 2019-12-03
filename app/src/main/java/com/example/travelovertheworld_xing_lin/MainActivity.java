package com.example.travelovertheworld_xing_lin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spain_pin = (Button) findViewById(R.id.spain_pin);
        spain_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Spain_1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button china_pin = (Button) findViewById(R.id.china_pin);
        china_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), China_1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button australia_pin = (Button) findViewById(R.id.australia_pin);
        australia_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Australia_1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button india_pin = (Button) findViewById(R.id.australia_pin);
        india_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), India_1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button us_pin = (Button) findViewById(R.id.australia_pin);
        us_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Us_1.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
