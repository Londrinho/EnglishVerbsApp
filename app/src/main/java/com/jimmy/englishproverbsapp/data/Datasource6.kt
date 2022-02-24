package com.jimmy.englishproverbsapp.data

import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.model.Relationship

//This is an internal data source class that has string and image resources.
class Datasource6 {
    fun loadRelationship(): List<Relationship> {
        return listOf<Relationship>(
            Relationship(R.string.relationship1, R.drawable.absenceheart1),
            Relationship(R.string.relationship2, R.drawable.goldglitter1),
            Relationship(R.string.relationship3, R.drawable.beautyeye2),
            Relationship(R.string.relationship4, R.drawable.courseoflove1),
            Relationship(R.string.relationship5, R.drawable.bookjudgecover)
        )
    }
}