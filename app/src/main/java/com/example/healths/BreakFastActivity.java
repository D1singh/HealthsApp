package com.example.healths;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class BreakFastActivity extends AppCompatActivity {
private NoteViewModel noteViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_fast);
        RecyclerView recyclerView = findViewById(R.id.Breakfast_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);

        NoteAdapter adapter = new NoteAdapter(this);
        recyclerView.setAdapter(adapter);
        noteViewModel = new ViewModelProvider(this).get(NoteViewModel.class);
      noteViewModel.getAllNotes().observe(this, new Observer<List<Note>>() {
          @Override
          public void onChanged(List<Note> notes) {
                adapter.setNotes(notes);
          }
      });
    }
}