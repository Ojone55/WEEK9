package com.tech4dev.assessment9.ui.myfamily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyfamilyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is myfamily Fragment"
    }
    val text: LiveData<String> = _text
}