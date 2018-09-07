package com.codebox.lib.android.Fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction

fun FragmentActivity.applyTransitionWithoutBackStack(fragment: Fragment, containerID: Int, tag: String?): FragmentTransaction =
        supportFragmentManager.beginTransaction().apply {
            setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            replace(containerID, fragment, tag)
            commit()
        }


/**
 * Created by Abed on 3/20/2018.
 */
fun FragmentActivity.applyTransitionWithBackStack(fragment: Fragment, containerID: Int, tag: String?): FragmentTransaction =
        supportFragmentManager.beginTransaction().apply {
            setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            replace(containerID, fragment, tag)
            addToBackStack(null)
            commit()

        }

