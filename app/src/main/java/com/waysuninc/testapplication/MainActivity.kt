package com.waysuninc.testapplication

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val LOG_TAG = "MainActivity:"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<TextView>(R.id.output)
        view.text = "MANUFACTURER: "+ android.os.Build.MANUFACTURER
        val view2 = findViewById<TextView>(R.id.output2)
        view2.text = "MODEL: "+ android.os.Build.MODEL

        Log.d(LOG_TAG, "manufacturer: " + android.os.Build.MANUFACTURER)
        Log.d(LOG_TAG, "model: " + android.os.Build.MODEL)
        Log.d(LOG_TAG, "hardware: " + android.os.Build.HARDWARE)
        Log.d(LOG_TAG, "ID: " + android.os.Build.ID)
        Log.d(LOG_TAG, "product: " + android.os.Build.PRODUCT)
        Log.d(LOG_TAG, "brand: " + android.os.Build.BRAND)
    }

    fun isDeviceGoogle(): Boolean {
        val GOOGLE = "Google"
        val model2 = "CMDC"
        val model = android.os.Build.MODEL

        return model == model2
    }
}