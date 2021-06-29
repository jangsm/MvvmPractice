package com.example.mvvmpractice.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var mApplication = application;
    var mainText: ObservableField<String> = ObservableField("Main")

    fun onClickButton() {
        Toast.makeText(mApplication, "Click!!", Toast.LENGTH_LONG).show()
    }
}