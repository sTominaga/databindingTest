package com.example.ptn0411.kotlindatabindingtest

import android.databinding.BaseObservable

/**
 * Created by ptn0411 on 2017/02/27.
 */

class StringModel(var editTextString: String) : BaseObservable() {
    init {
        this.editTextString = editTextString
    }
}