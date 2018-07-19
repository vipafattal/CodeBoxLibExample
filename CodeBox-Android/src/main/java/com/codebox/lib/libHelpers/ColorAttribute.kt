package com.codebox.lib.libHelpers

import android.content.Context
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.v4.content.ContextCompat
import com.codebox.lib.android.os.AppContextProvider.Companion.appContext
import android.R.attr.data
import android.util.TypedValue
import android.support.annotation.NonNull




@ColorInt
internal fun getAttributeColor(context: Context = appContext, @AttrRes colorAttribute: Int): Int {
    val attrs = intArrayOf(colorAttribute)
    val ta = context.obtainStyledAttributes(attrs)
    /*Get the color resourceID that we want (the first index, and only item, in the
    attrs array). Use ContextCompat to get the color according to the theme.
    */
    @ColorInt val color = ContextCompat.getColor(context,
            ta.getResourceId(0, -1))
    // ALWAYS call recycle() on the TypedArray when you’re done.
    ta.recycle()
    return color
}

@ColorInt
fun getThemeColor(
        context: Context,
        @AttrRes attributeColor: Int
): Int {
    val value = TypedValue()
    context.theme.resolveAttribute(attributeColor, value, true)
    return value.data
}