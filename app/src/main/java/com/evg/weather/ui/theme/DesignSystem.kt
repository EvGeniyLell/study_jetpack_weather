package com.evg.weather.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.evg.weather.ui.theme.WeatherTheme

@Immutable
data class DesignSystemColors(
    val tertiary: Color,
    val onTertiary: Color
)

@Immutable
data class DesignSystemData(
    val spacer: Dp,
    val defaultBorderRadius: Dp,
    val colors: DesignSystemColors
)

val LocalDesignSystemData = staticCompositionLocalOf {
    DesignSystemData(
        spacer = Dp.Unspecified,
        defaultBorderRadius = Dp.Unspecified,
        colors = DesignSystemColors(
            tertiary = Color.Unspecified,
            onTertiary = Color.Unspecified
        ),
    )
}

object DesignSystem {
    val instance: DesignSystemData
        @Composable
        get() = LocalDesignSystemData.current

//    val theme:  Typography
//        @Composable
//        get() = WeatherTheme.typography

    val spacer: Dp
        @Composable
        get() = instance.spacer

    val defaultBorderRadius: Dp
        @Composable
        get() = instance.defaultBorderRadius

    val colors: DesignSystemColors
        @Composable
        get() = instance.colors

}