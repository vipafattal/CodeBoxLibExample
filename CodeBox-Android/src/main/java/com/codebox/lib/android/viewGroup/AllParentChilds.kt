package com.codebox.lib.android.viewGroup

import android.view.View
import android.view.ViewGroup

fun ViewGroup.allChild(): List<View> {
    val arrayList = ArrayList<View>()

    for (child in 0 until childCount) {
        arrayList.add(this.getChildAt(child) as View)
    }
    return arrayList

}