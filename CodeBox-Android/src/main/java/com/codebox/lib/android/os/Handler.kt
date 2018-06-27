package com.codebox.lib.android.os

import android.os.Handler

/**
 * Created by Abed on 2/23/2018.
 */
//for crossinline visit (and read answer 2):
// https://stackoverflow.com/questions/38827186/what-is-the-difference-between-crossinline-and-noinline-in-kotlin
val appHandler by lazy { Handler() }

inline fun Handler.wait(timer: Long, crossinline block: () -> Unit) {
    this.postDelayed({
        block()
    }, timer)
}