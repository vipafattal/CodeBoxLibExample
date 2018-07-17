package com.codebox.lib.standard.Collections

fun <T> Collection<T>.ListSizeData(): Pair<Collection<T>, Int> = Pair(this, size)