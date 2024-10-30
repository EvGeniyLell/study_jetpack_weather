package com.evg.weather.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.evg.weather.data.ShortWeather
import com.evg.weather.ui.theme.DesignSystem
import com.evg.weather.ui.theme.WeatherTheme

@Composable
fun DashboardCard(
    modifier: Modifier = Modifier,
    shortWeather: ShortWeather,
    onClick: () -> Unit,
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(DesignSystem.defaultBorderRadius),
        //modifier = modifier.padding(DesignSystem.spacer),
    ) {
        CardContent(
            modifier = modifier,
            title = shortWeather.title,
            subtitle = shortWeather.subtitle,
            conditions = shortWeather.conditions,
            currentTemperature = shortWeather.currentTemperature,
            maxTemperature = shortWeather.maxTemperature,
            minTemperature = shortWeather.minTemperature,
            onClick = onClick,
        )
    }
}

@Composable
private fun CardContent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    conditions: String,
    currentTemperature: UInt,
    maxTemperature: UInt,
    minTemperature: UInt,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier.padding(DesignSystem.spacer),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    title,
                    style = MaterialTheme.typography.titleLarge,
                )
                Text(
                    subtitle,
                    style = MaterialTheme.typography.titleMedium,
                )
            }
            Text(
                "${currentTemperature}º",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize.times(2),
                )
            )
        }
        Spacer(modifier = Modifier.height(DesignSystem.spacer * 5))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                conditions,
                style = MaterialTheme.typography.titleSmall,
            )
            Row {
                Text(
                    "H:${maxTemperature}º",
                    style = MaterialTheme.typography.titleSmall
                )
                Spacer(modifier = Modifier.width(DesignSystem.spacer * 2))
                Text(
                    "L:${minTemperature}º",
                    style = MaterialTheme.typography.titleSmall
                )

            }
        }
    }
}


@Preview(showBackground = true, widthDp = 320, heightDp = 140)
@Composable
fun DashboardTilePreview() {
    WeatherTheme {
        DashboardCard(
            modifier = Modifier.fillMaxSize(),
            shortWeather = ShortWeather(
                title = "London",
                subtitle = "Subtitle",
                conditions = "Sunny",
                currentTemperature = 32u,
                maxTemperature = 34u,
                minTemperature = 30u,
            ),
            onClick = {},
        )
    }
}