package com.jimmy.englishproverbsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//This is a data class which represents one instance of the
//data to be used in the app
data class Work (@StringRes val stringResourceId: Int,
                 @DrawableRes val imageResourceId: Int)