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
            People(R.string.people5, R.drawable.miceplay),
            People(R.string.people6, R.drawable.scratchback),
            People(R.string.people7, R.drawable.learnwalkberun),
            People(R.string.people8, R.drawable.bitemorechew),
            People(R.string.people9, R.drawable.glasshouses),
            People(R.string.people10, R.drawable.mannersfive)
        )
    }
}