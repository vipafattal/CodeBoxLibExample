package com.codeboxlib.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.codebox.lib.android.resoures.Colour

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Colour(R.color.colorAccent)
        R.color.brown_700
    }
}
