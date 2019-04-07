package com.codebox.lib.android.os

import android.content.Context
import com.codebox.lib.standard.delegation.DelegatesExt


object AppContextProvider {
    internal var appContext by DelegatesExt.notNullSingleValue<Context>()
        private set

    fun init(context: Context) {
        appContext = context
    }
}