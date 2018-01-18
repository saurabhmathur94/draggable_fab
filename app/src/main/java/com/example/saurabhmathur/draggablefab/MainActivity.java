package com.example.saurabhmathur.draggablefab;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Floating Button");
        toolbar.setTitleTextColor(getResources().getColor(R.color.White));

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });



    }


}
