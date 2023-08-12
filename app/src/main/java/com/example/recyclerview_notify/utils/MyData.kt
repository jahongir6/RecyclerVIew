package com.example.recyclerview_notify.utils

import com.example.recyclerview_notify.R
import com.example.recyclerview_notify.models.User

object MyData {

    val list = ArrayList<User>()
    fun addUser(){
        for (i in 0..10){
            list.add(User("jaloliddin",19, R.drawable.ic_launcher_foreground))
        }
    }
}