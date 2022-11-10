package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.Problems

//This is an internal data source class that has string and image resources.
class Datasource4 {
    fun loadProblems(): List<Problems> {
        return listOf<Problems>(
            Problems(R.string.problems1, R.drawable.allswell1),
            Problems(R.string.problems2, R.drawable.madebed1),
            Problems(R.string.problems3, R.drawable.beggars1),
            Problems(R.string.problems4, R.drawable.godhelps1),
            Problems(R.string.problems5, R.drawable.eggsinbasket),
            Problems(R.string.problems6, R.drawable.dontbitehands),
            Problems(R.string.problems7, R.drawable.crysplitmilk),
            Problems(R.string.problems8, R.drawable.omelettebreak),
            Problems(R.string.problems9, R.drawable.tipiceburg),
            Problems(R.string.problems10, R.drawable.mountainmolehil),
            Problems(R.string.problems11, R.drawable.willway),
            Problems(R.string.problems12, R.drawable.manycooks),
            Problems(R.string.problems13, R.drawable.crossbridge1),
            Problems(R.string.problems14, R.drawable.twowrongs)
        )
    }
}