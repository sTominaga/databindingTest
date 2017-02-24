package com.example.ptn0411.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ptn0411 on 2017/02/24.
 */

public class TestStringData extends BaseObservable{
    public String inputString = "";

    public TestStringData(String inputString) {
        this.inputString = inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
        notifyPropertyChanged(BR.testStringData);
    }

    @Bindable
    public String getInputString() {
        return inputString;

    }

}
