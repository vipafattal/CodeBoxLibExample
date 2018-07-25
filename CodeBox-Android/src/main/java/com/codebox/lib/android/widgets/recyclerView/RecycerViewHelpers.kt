package com.codebox.lib.android.widgets.recyclerView

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.animation.AnimationUtils
import android.widget.LinearLayout

fun RecyclerView.animateItems(animFile:Int) {
    val controller = AnimationUtils.loadLayoutAnimation(context, animFile)
    layoutAnimation = controller
    adapter!!.notifyDataSetChanged()
    scheduleLayoutAnimation()
}
fun RecyclerView.LinearLayoutV(){
    layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
}
fun RecyclerView.LinearLayoutH(){
    layoutManager = LinearLayoutManager(context, LinearLayout.HORIZONTAL, false)
}