package com.example.healths;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.healths.NoteAdapter.BREAKFAST_ID;

public class BreakFastDetailActivity extends AppCompatActivity {
   TextView txt_Breakfast_name,txt_short_disc;
   ImageView Breakfast_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_fast_detail);

        txt_Breakfast_name = findViewById(R.id.txt_Breakfast_name);
        txt_short_disc = findViewById(R.id.txt_short_disc);
        Breakfast_image = findViewById(R.id.Breakfast_image);

        Intent intent = getIntent();
        if (null != intent){
            int breakfast_name = intent.getIntExtra(BREAKFAST_ID ,-1);
            if (breakfast_name !=-1){
                // TODO: 1/8/2021 get the breakfast by their id

            }
        }
    }
}