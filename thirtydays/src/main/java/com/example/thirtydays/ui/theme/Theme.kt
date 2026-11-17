package com.example.thirtydays.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Purple40,
    secondary = Teal40,
    tertiary = Orange40,
    background = LightBackground,
    surface = LightBackground,
)

private val DarkColors = darkColorScheme(
    primary = Purple80,
    secondary = Teal80,
    tertiary = Orange80,
    background = DarkBackground,
    surface = DarkBackground,
)

@Composable
fun ThirtyDaysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = ThirtyDaysTypography,
        content = content,
    )
}

