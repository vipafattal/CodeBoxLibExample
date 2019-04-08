package com.codeboxlib.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codebox.lib.android.os.AppContextProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppContextProvider.init(this)
    }
}
