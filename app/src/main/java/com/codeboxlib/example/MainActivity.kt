package com.codeboxlib.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.codebox.lib.android.widgets.snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.snackbar("Error",R.color.colorAccent)
    }
}
