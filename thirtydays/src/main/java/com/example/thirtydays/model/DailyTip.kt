package com.example.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DailyTip(
    val day: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
)

