package com.bitcode.a30_12_24_sqlite_database_demo

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DBHelper(context : Context?,
                db : String?,
                factory: CursorFactory?,
                version : Int) : SQLiteOpenHelper(context,db,factory,version) {

    override fun onCreate(db : SQLiteDatabase?) {
        Log.e("tag", "onCreate method called")
        if (db != null) {
            db.execSQL("create table Product(id integer primary key, title text NOT NULL, price integer);")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        Log.e("tag", "onUpgrade method called")
    }

    override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        super.onDowngrade(db, oldVersion, newVersion)
        Log.e("tag", "onDownGrade method called")
    }
}