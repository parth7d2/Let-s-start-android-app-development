package com.example.android.project_15a.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.project_15a.data.PetContract.PetEntry;

public class PetDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // create table pets (id INTEGER PRIMARY KEY, name TEXT, weight INTEGER);
        // create a string that contains the SQL statement to create the pets table
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + "(" + PetEntry._ID + " INTERGER PRIMARY KEY AUTOINCREMENT ," +
                PetEntry.COLUMN_PET_NAME + "TEXT NOT NULL ,"
                + PetEntry.COLUMN_PET_BREED + "TEXT ,"
                + PetEntry.COLUMN_PET_GENDER + "INTEGER NOT NULL ,"
                + PetEntry.COLUMN_PET_WEIGHT + "INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
