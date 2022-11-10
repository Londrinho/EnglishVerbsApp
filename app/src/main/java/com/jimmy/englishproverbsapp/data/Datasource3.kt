package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.Time

//This is an internal data source class that has string and image resources.
class Datasource3 {
    fun loadTime(): List<Time> {
        return listOf<Time>(
            Time(R.string.time1, R.drawable.timemoney),
            Time(R.string.time2, R.drawable.timeflies2),
            Time(R.string.time3, R.drawable.timehealer2),
            Time(R.string.time4,R.drawable.notimelikepresent),
            Time(R.string.time5, R.drawable.timeandplace2),
            Time(R.string.time6, R.drawable.betterlatenev),
            Time(R.string.time7, R.drawable.earlybirdworm1),
            Time(R.string.time8, R.drawable.stitchintime)
        )
    }
}