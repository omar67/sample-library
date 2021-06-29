package com.omar67.mylibrary

import android.util.Log

object MyLogger {
    private const val TAG = "MyLogger"

    fun d(msg: String){
        Log.d(TAG, msg)
    }
}