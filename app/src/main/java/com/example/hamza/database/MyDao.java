package com.example.hamza.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addNotes(StikyNotes stikyNotes);

    @Query("select * from StikyNotes")

    public List<StikyNotes> getNotes();

    @Delete
    public void delNote(StikyNotes stikyNotes);

    @Update
    public void updateNote(StikyNotes stikyNotes);



}
