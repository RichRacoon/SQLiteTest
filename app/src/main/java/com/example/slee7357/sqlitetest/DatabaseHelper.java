package com.example.slee7357.sqlitetest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by cmartyniuk1656 on 12/1/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String TABLE_NAME = "USER_TABLE";
    private static final String COL1 = "ID";
    private static final String COL2 = "EMAIL";
    private static final String COL3 = "PASSWORD";
    private static final String COL4 = "USER_NAME";



    public DatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE "+ TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL2 + " TEXT, "+ COL3 +" TEXT, "+ COL4 +" TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public boolean addData(String email, String password, String user_Name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, email);
        contentValues.put(COL3, password);
        contentValues.put(COL4, user_Name);

        Log.d(TAG, "addDate: Adding " + email + " , "+ user_Name+" to " + TABLE_NAME);

        long result = db.insert(TABLE_NAME, null, contentValues);

        if(result == -1){
            return false;
        }
        else{
            return true;
        }

    }
}
