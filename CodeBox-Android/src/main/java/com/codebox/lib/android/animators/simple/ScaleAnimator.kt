package com.codebox.lib.android.animators.simple

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Animation
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.extrenalLib.doOnEnd

import com.codebox.lib.standard.lambda.unitFun

/**
 * Created by Abed on 2/28/2018.
 */
fun View.scaleAnimator(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount)


inline fun View.scaleAnimator(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE, crossinline doOnEnd: unitFun): ValueAnimator =
        scale(valueFrom, valueTo, time, repeatCount).apply {

            doOnEnd {
                doOnEnd.invoke()
            }

        }


@PublishedApi
internal fun View.scale(valueFrom: Float, valueTo: Float, time: Interval, RepeatCount: Int): ValueAnimator =
        ValueAnimator.ofFloat(valueFrom, valueTo).apply {
            duration = time
            repeatCount = RepeatCount
            repeatMode = ValueAnimator.REVERSE
            addUpdateListener {
                scaleX = animatedValue as Float
                scaleY = animatedValue as Float
            }
            start()
        }
