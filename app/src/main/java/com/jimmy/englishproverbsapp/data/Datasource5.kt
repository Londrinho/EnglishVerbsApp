package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.General

//This is an internal data source class that has string and image resources.
class Datasource5 {
    fun loadGeneral(): List<General> {
        return listOf<General>(
            General(R.string.general1, R.drawable.anappleaday),
            General(R.string.general2, R.drawable.bettersafe1),
            General(R.string.general3, R.drawable.earlybed2),
            General(R.string.general4, R.drawable.mananddog3),
            General(R.string.general5, R.drawable.revengecold2)
        )
    }
}