package com.example.hamza.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {StikyNotes.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase{

    public abstract MyDao myDao();

}
