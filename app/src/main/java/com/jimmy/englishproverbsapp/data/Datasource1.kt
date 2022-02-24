package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.People

//This is an internal data source class that has string and image resources.
class Datasource1 {
    fun loadPeople(): List<People> {
        return listOf<People>(
            People(R.string.people1, R.drawable.allsorts),
            People(R.string.people2, R.drawable.asknoquestions),
            People(R.string.people3, R.drawable.betterdevilknow),
            People(R.string.people4, R.drawable.twocompany),
            People(R.string.people5, R.drawable.miceplay)
        )
    }
}