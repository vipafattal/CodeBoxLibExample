package com.codebox.lib.android.Fragments

fun androidx.fragment.app.FragmentActivity.removeFragment(frag: androidx.fragment.app.Fragment) {
    supportFragmentManager.beginTransaction().remove(frag).commit()
}