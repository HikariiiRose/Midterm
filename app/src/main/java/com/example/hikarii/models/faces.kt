package com.example.hikarii.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class faces (
    @StringRes
    val stringResourceId: Int,
    @DrawableRes
    val imageResourceId: Int
) {
    companion object {
        val stringResourceId: Int
            get() {
                TODO()
            }
        val imageResourceId: Int = 0
    }
}

