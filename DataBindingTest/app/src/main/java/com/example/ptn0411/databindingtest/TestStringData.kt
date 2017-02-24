package com.example.ptn0411.databindingtest

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by ptn0411 on 2017/02/24.
 */

class TestStringData(var inputStringText: String) : BaseObservable() {
//    var inputStringText :String = ""

    init {
        this.inputStringText = inputStringText
    }

    fun setInputString(inputStringText: String) {
        this.inputStringText = inputStringText
        notifyPropertyChanged(BR.testStringData)
    }

    @Bindable
    fun getInputString(): String {
        return inputStringText

    }

}
