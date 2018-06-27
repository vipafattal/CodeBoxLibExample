package com.codebox.lib.android.widgets

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.codebox.lib.R
import com.codebox.lib.android.resoures.Colour
import com.codebox.lib.libHelpers.getAttributeColor

internal val appAccentColor = getAttributeColor(colorAttribute = R.attr.colorAccent)

fun View.snackbar(message: CharSequence, duration: Int = Snackbar.LENGTH_INDEFINITE) {
    val snackbar = Snackbar.make(this, message, duration)

    snackbar.setActionTextColor(
            Colour(appAccentColor)
    )
    snackbar.setAction("Dismiss", { snackbar.dismiss() })
            .show()
}

fun AppCompatActivity.snackbar(message: CharSequence, duration: Int = Snackbar.LENGTH_INDEFINITE) {
    val rootView = window.decorView.rootView

    val snackBar = Snackbar.make(rootView, message, duration)
    snackBar.setActionTextColor(
            Colour(appAccentColor)
    )
    snackBar.setAction("Dismiss", { snackBar.dismiss() })
            .show()
}

fun AppCompatActivity.snackbar(message: Int, duration: Int = Snackbar.LENGTH_INDEFINITE) {
    val rootView = window.decorView.rootView

    val snackBar = Snackbar.make(rootView, getString(message), duration)
    snackBar.setActionTextColor(
            Colour(appAccentColor)
    )
    snackBar.setAction("Dismiss", { snackBar.dismiss() })
            .show()
}