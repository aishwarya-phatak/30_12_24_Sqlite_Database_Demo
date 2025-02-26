package com.bitcode.a30_12_24_sqlite_database_demo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var dbUtil= DBUtil(this)
        dbUtil.insertProduct(11,"Mixer",1002)
        dbUtil.insertProduct(12,"Tshirt", 342)

        for (i in 13..16){
            dbUtil.insertProduct(i,"Product " + i, i * 100 + 500)
        }

        for (eachProduct in dbUtil.getAllProducts()){
            Log.e("tag","eachproduct" + eachProduct.title)
        }
    }
}