package com.codebox.lib.android.Fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity

fun FragmentActivity.removeFragment(frag: Fragment) {
    supportFragmentManager.beginTransaction().remove(frag).commit()
}