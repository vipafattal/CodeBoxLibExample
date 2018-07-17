package com.codebox.lib.android.resoures

import android.content.Context
import android.content.res.Resources
import android.support.v4.content.ContextCompat
import com.codebox.lib.android.os.AppContextProvider.Companion.appContext

val appResources: Resources = appContext.resources


fun Colour(colorID: Int, context: Context = appContext): Int = ContextCompat.getColor(context, colorID)

fun Stringer(stringID: Int, mContext: Context = appContext) = mContext.resources.getString(stringID)

fun Image(drawableImg: Int, context: Context = appContext) = ContextCompat.getDrawable(context, drawableImg)
/**
 * @resourcesID is string resources
 *  arrayOfStrings(R.string.appName,R.string.Welcome,R.string.Login)
 */
fun arrayOfStrings(vararg resourcesID: Int): List<String> {
    val stringsArray = ArrayList<String>()
    resourcesID.forEach {
        stringsArray.add(Stringer(it))
    }
    return stringsArray
}

fun arrayOfColor(vararg colorsID: Int): List<Int> {
    val colorsArray = ArrayList<Int>(colorsID.size)
    colorsID.forEach {
        colorsArray.add(Colour(it))
    }
    return colorsArray
}



