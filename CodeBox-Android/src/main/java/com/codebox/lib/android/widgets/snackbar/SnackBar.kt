package com.codebox.lib.android.widgets.snackbar

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.codebox.lib.standard.lambda.unitFun

/**
 *invoking snackbar from activity without any Lambda Exception
 */


fun AppCompatActivity.snackbar(
        msg: String,
        v: View = findViewById(android.R.id.content),
        duration: Int = Snackbar.LENGTH_INDEFINITE,
        textColor: Int? = null
): Snackbar {

    val sn = Snackbar.make(v, msg, duration)
    sn.show()

    if (textColor != null) {
        sn.setSnackbarTextColor(textColor)
    }

    return sn
}

/**
 *invoking snackbar from activity with Lambda Exception
 */
inline fun AppCompatActivity.snackbar(
        msg: String,
        v: View = findViewById(android.R.id.content),
        duration: Int = Snackbar.LENGTH_INDEFINITE,
        textColor: Int? = null,
        crossinline block: unitFun): Snackbar =

        Snackbar.make(v, msg, duration).apply {
            show()

            if (textColor != null) {
                setSnackbarTextColor(textColor)
            }

            setAction(msg) {
                block.invoke()
            }
        }


