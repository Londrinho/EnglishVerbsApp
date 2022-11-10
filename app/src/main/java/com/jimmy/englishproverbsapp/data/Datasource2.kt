package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R

import com.jimmy.englishproverbsapp.model.Work

//This is an internal data source class that has string and image resources.
class Datasource2 {
    fun loadWork(): List<Work> {
        return listOf<Work>(
            Work(R.string.work1,R.drawable.actionsspeak1),
            Work(R.string.work2, R.drawable.jackdullboy3),
            Work(R.string.work3, R.drawable.tools1),
            Work(R.string.work4, R.drawable.jackofalltrades3),
            Work(R.string.work5, R.drawable.practiceperfect),
            Work(R.string.work6, R.drawable.makehandslightwo1),
            Work(R.string.work7, R.drawable.strikeironhot),
            Work(R.string.work8, R.drawable.honestbestpol),
            Work(R.string.work9, R.drawable.romewasntbul)
        )
    }
}