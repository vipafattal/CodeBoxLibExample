package com.codebox.lib.android.utils

import android.support.v4.text.TextUtilsCompat
import android.support.v4.view.ViewCompat
import java.util.*

val isRightToLeft: Int
    get() =
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == ViewCompat.LAYOUT_DIRECTION_LTR) 1
        else -1

