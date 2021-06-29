package com.omar67.librarysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omar67.mylibrary.MyLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyLogger.d("test123")
        MyLogger.d(getString(R.string.tag2))

    }
}