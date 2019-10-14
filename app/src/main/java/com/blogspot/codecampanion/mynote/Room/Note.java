package com.blogspot.codecampanion.mynote.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "NoteTable")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

}
