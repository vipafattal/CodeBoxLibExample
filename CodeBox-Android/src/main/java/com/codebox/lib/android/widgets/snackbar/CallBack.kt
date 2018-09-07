package com.codebox.lib.android.widgets.snackbar

import android.support.design.widget.Snackbar
import com.codebox.lib.standard.lambda.unitFun


inline fun Snackbar.onDismissed(crossinline block: unitFun) {
    addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
            super.onDismissed(transientBottomBar, event)
            block()
        }

    })
}

inline fun Snackbar.onShown(crossinline block: unitFun) {
    addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
            super.onDismissed(transientBottomBar, event)
            block()
        }
    })
}