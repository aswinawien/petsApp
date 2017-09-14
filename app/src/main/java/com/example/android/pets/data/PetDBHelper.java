package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aswinawien on 29/08/17.
 */

public class PetDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "shelter.db";
    public static final int DATABASE_VERSION = 1;
    public static final String CREATE_PETS_TABLE ="CREATE TABLE " +
                                                    PetContract.PetEntry.TABLE_PETS_NAME +
                                                    "(" +
                                                    PetContract.PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                    PetContract.PetEntry.COLUMN_PET_NAME +" TEXT NOT NULL, "+
                                                    PetContract.PetEntry.COLUMN_PET_BREED +" TEXT, "+
                                                    PetContract.PetEntry.COLUMN_PET_GENDER +" INTEGER NOT NULL DEFAULT 0, "+
                                                    PetContract.PetEntry.COLUMN_PET_WEIGHT +" INTEGER NOT NULL"+
                                                    ");";
    public PetDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
