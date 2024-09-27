package com.example.compose_counterapplication_with_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel (): ViewModel(){
    //this class will act as viewmodel for our application
    var count  by mutableStateOf(0)

    //here separating logic or functionality from UI,this is called separation of concern
    fun increaseCounter(){
        count++
    }

}