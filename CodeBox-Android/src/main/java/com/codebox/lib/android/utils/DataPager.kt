package com.codebox.lib.android.utils

import android.support.v7.app.AppCompatActivity
import com.codebox.lib.standard.lambda.unitFun

class DataPager<T : Any>(
        @PublishedApi internal
        val dataList: List<T>) {

    @PublishedApi
    internal
    var pagerActivity: AppCompatActivity? = null
        private set

    constructor(dataList: List<T>, activity: AppCompatActivity?) : this(dataList) {
        pagerActivity = activity
    }

    var dataIndex = 0

    lateinit var item: T

    inline fun getNextItem(doOnDataListUpdated: unitFun): T {

        if (dataIndex < dataList.size) {

            item = dataList[dataIndex++]
            doOnDataListUpdated.invoke()

        } else {

            pagerActivity?.finish()

        }
        return item
    }

    //fun nextItem(): T = dataList[dataIndex++]

    /**
     *
    TODO
    1.do some thing before finishing the activity that by handling dataSize in interface
    2.to deal with interface in instead of dealing with this class
     *
     **/
}