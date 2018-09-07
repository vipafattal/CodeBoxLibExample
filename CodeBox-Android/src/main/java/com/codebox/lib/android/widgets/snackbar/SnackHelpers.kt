package com.codebox.lib.android.widgets.snackbar

import android.support.design.widget.Snackbar
import android.widget.TextView
import com.codebox.lib.R
import com.codebox.lib.android.resoures.Colour

fun Snackbar.setSnackbarTextColor(textColor: Int) {

    val tv: TextView = view.findViewById(R.id.snackbar_text)
    tv.setTextColor(Colour(textColor))

}