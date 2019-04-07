package com.codebox.lib.android.views.listeners

import android.view.View


inline fun <T : View> T.onClick(crossinline block: T.() -> Unit) {
    setOnClickListener {
        block()
    }
}
