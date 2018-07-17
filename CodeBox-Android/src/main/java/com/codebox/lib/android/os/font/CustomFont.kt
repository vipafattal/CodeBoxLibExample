package com.codebox.lib.android.os.font

import android.graphics.Typeface

import android.widget.TextView
import com.codebox.lib.android.os.AppContextProvider.Companion.appContext

/**
 * Created by Abed on 3/2/2018.
 */

/**
 * fonts from assets folder example:
 * "roboto_medium.ttf"
 */

fun TextView.customFont(fontPath: String) {

    // Font path
    // Applying font
    val Cfont = Typeface.createFromAsset(appContext.assets, fontPath)
    this.typeface = Cfont

}