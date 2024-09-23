package com.example.reinstack;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyBDHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Income";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "Income";

    public static final String Entered_Income_Amount = "Income_Amount";
    public static final String Payment_Method  = "Payment_Method";
    public static final String Description = "Description";


    public MyBDHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE" + TABLE_NAME + "(" + Entered_Income_Amount+ "INTEGER," + Payment_Method + "TEXT,"
        + Description + "Text)");

        SQLiteDatabase database = this.getWritableDatabase();
        database.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public void addIncome(int entered_Income_Amount , String payment_Method){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues  values  = new ContentValues();
        values.put(Entered_Income_Amount,entered_Income_Amount);
        values.put(Payment_Method,payment_Method);
        sqLiteDatabase.insert(TABLE_NAME, null,values );

    }
}
