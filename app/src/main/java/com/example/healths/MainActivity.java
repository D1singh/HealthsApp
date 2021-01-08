package com.example.healths;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity{
    private MaterialCardView Breakfast_card, Lunch_card, Dinner_card, Food_time, Fruit_time, Fitness_time;
//RecyclerView recyclerView ;
//    private NoteViewModel noteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Util.getAllItems(this);

        initViews();
        Breakfast_card.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, BreakFastActivity.class));
        });
        Lunch_card.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LunchActivity.class));
        });
        Dinner_card.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DinnerActivity.class));
        });

        Food_time.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FoodActivity.class));
        });
        Fruit_time.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FruitActivity.class));
        });

        Fitness_time.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FitnessActivity.class));
        });
    }

    private void initViews() {
        Breakfast_card = findViewById(R.id.Breakfast_card);
        Lunch_card = findViewById(R.id.Lunch_card);
        Dinner_card = findViewById(R.id.Dinner_card);
        Food_time = findViewById(R.id.Food_time);
        Fruit_time = findViewById(R.id.Fruit_time);
        Fitness_time = findViewById(R.id.Fitness_time);
    }


}