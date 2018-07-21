package com.codebox.lib.android.widgets.snackbar

import android.support.design.widget.Snackbar
import android.widget.TextView
import com.codebox.lib.android.resoures.Colour

@PublishedApi
internal fun Snackbar.setSnackbarTextColor(textColor: Int) {

    val tv: TextView = view.findViewById(android.support.design.R.id.snackbar_text)
    tv.setTextColor(Colour(textColor))

}