package com.codebox.lib.android.os

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.pm.ProviderInfo
import android.database.Cursor
import android.net.Uri
import com.codebox.lib.standard.delegation.DelegatesExt


class AppContextProvider : ContentProvider() {
    companion object {
        var appContext by DelegatesExt.notNullSingleValue<Context>()
            private set
    }

    override fun onCreate(): Boolean {
        appContext = context
        return true

    }

    override fun insert(uri: Uri?, values: ContentValues?): Uri {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun query(uri: Uri?, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(uri: Uri?, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(uri: Uri?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(uri: Uri?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attachInfo(context: Context, providerInfo: ProviderInfo?) {
        if (providerInfo == null) {
            throw NullPointerException("AppContextProvider ProviderInfo cannot be null.")
        }
        // So if the authorities equal the library internal ones, the developer forgot to set his applicationId
        if ("<your-library-applicationid>.AppContextProvider" == providerInfo.authority) {
            throw IllegalStateException("Incorrect provider authority in manifest. Most likely due to a " + "missing applicationId variable in application\'s build.gradle.")
        }
        super.attachInfo(context, providerInfo)
    }
}