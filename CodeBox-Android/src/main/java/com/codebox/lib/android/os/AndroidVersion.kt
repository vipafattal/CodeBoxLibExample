package com.codebox.lib.android.os

import android.os.Build
import com.codebox.lib.standard.lambda.unitFun

/**
 * Created by Abed on 2/3/2018.
 */


inline fun versionSupport(newerSDK: Int, newerSDKBlock: () -> Unit, olderSDKBlock: () -> Unit) {
    if (Build.VERSION.SDK_INT >= newerSDK)
        newerSDKBlock()
    else
        olderSDKBlock()
}

inline fun versionSupport(SDKVersion: Int, codeBlock: unitFun) {
    if (Build.VERSION.SDK_INT >= SDKVersion) {
        codeBlock()
    }
}