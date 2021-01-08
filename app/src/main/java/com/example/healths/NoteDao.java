package com.example.healths;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);
    @Query("Select * from node_table")
    LiveData<List<Note>> getAll();

}
