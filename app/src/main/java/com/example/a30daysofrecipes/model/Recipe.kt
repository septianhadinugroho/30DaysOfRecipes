package com.example.a30daysofrecipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe (
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)