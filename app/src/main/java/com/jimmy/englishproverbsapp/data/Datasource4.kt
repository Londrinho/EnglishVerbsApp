package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.Problems

//This is an internal data source class that has string and image resources.
class Datasource4 {
    fun loadProblems(): List<Problems> {
        return listOf<Problems>(
            Problems(R.string.problems1, R.drawable.allswell),
            Problems(R.string.problems2, R.drawable.madebed1),
            Problems(R.string.problems3, R.drawable.beggars),
            Problems(R.string.problems4, R.drawable.godhelps1),
            Problems(R.string.problems5, R.drawable.eggsinbasket)
        )
    }
}