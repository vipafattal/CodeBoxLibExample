package com.codebox.lib.android.animators

import android.view.View
import android.view.ViewAnimationUtils
import com.codebox.lib.R
import com.codebox.lib.android.os.versionSupport
import com.codebox.lib.android.resoures.Colour

/**
 * Created by Abed on 3/18/2018.
 */

fun View.circularRevealAnimation(color: Int = R.color.trans_white) {
    versionSupport(21) {
        val finalRadius = Math.hypot(this.width / 2.000, this.height / 2.000).toFloat()
        val anim = ViewAnimationUtils.createCircularReveal(this, this.width / 2, this.height / 2, 0f, finalRadius)
        this.setBackgroundColor(Colour(color))
        anim.start()
    }

}