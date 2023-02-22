package com.example.lektion_5_lifecycleviewmodel

import androidx.lifecycle.ViewModel

// First Step - Extend ViewModel
class Counter : ViewModel() {

    var value: Int = 0

    fun add() {
        value++
    }

}
