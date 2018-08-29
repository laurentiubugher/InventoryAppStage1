package com.example.android.inventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.inventoryapp.data.InventoryContract.InventoryEntry;

public class InventoryDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = InventoryDbHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "inventory.db";

    private static final int DATABASE_VERSION = 2;


    public InventoryDbHelper(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
       }


       @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_INVENTORY_TABLE = "CREATE TABLE " + InventoryEntry.TABLE_NAME + "("
                + InventoryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + InventoryEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, "
                + InventoryEntry.COLUMN_PRICE + " INTEGER, "
                + InventoryEntry.COLUMN_QUANTITY + " INTEGER NOT NULL, "
                + InventoryEntry.COLUMN_SUPPLIER_NAME + " TEXT, "
                + InventoryEntry.COLUMN_SUPPLIER_PHONE_NUMBER + " INTEGER);";

        db.execSQL(SQL_CREATE_INVENTORY_TABLE);

       }



       @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

       }
}
