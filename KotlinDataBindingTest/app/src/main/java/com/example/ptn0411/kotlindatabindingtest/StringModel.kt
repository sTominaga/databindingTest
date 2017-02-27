package com.example.ptn0411.kotlindatabindingtest

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by sTominaga on 2017/02/27.
 */

class StringModel: BaseObservable() {

    @get:Bindable
    var editTextString: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.editTextString)
        }

}