package com.codebox.lib.android.widgets.fabButton

import android.content.res.ColorStateList
import android.support.design.widget.FloatingActionButton
import com.codebox.lib.android.resoures.Colour

infix fun FloatingActionButton.colour(color: Int): Unit {
    this.backgroundTintList = ColorStateList.valueOf(Colour(color))
}