package com.example.kotlin1_41

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0
    private val liveData = MutableLiveData<Int>()
    var observer: LiveData<Int> = liveData
    private var list = mutableListOf<String>()

    fun plusCounter() {
        counter++
        liveData.value = counter
        list.add("+")
    }

    fun minusCounter() {
        counter--
        liveData.value = counter
        if (counter == 0) list.add("0")
        else list.add("-")
    }

    fun getState(): Int? {
        return liveData.value
    }

    fun getHistory(): List<String> {
        return list
    }

}