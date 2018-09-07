package com.codebox.lib.standard.Collections.filters

fun <T>MutableList<T>.mFilter(predicate:(T)->Boolean): MutableList<T> {
    return filterTo(this, predicate)
}