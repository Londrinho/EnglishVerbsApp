package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R

import com.jimmy.englishproverbsapp.model.Work

//This is an internal data source class that has string and image resources.
class Datasource2 {
    fun loadWork(): List<Work> {
        return listOf<Work>(
            Work(R.string.work1,R.drawable.actionsspeak),
            Work(R.string.work2, R.drawable.jackdullboy1),
            Work(R.string.work3, R.drawable.tools1),
            Work(R.string.work4, R.drawable.jakeofalltrades),
            Work(R.string.work5, R.drawable.practiceperfect)
        )
    }
}