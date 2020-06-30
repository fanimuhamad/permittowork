package com.example.permit_towork;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static  final String DATABASE_NAME = "dbpermiittowork";
    public static  final String TABLE_NAME = "user";
    public static  final String ID = "ID";
    public static  final String KOL_1 = "dbpermiittowork";
    public static  final String KOL_2 = "dbpermiittowork";

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}