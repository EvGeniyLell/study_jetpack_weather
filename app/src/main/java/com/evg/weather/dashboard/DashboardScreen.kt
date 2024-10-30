package com.evg.weather.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.evg.weather.data.ShortWeather
import com.evg.weather.ui.theme.DesignSystem
import com.evg.weather.ui.theme.WeatherTheme


@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier,
    shortWeathers: List<ShortWeather>,
    onContinueClicked: () -> Unit,
) {
    Column(

    ) {
        Text("Weather", style = MaterialTheme.typography.titleLarge)
        Roster(
            modifier = modifier,
            shortWeathers = shortWeathers,
        )
    }

}

@Composable
private fun Roster(
    modifier: Modifier = Modifier,
    shortWeathers: List<ShortWeather>,
) {
    LazyColumn(
        modifier = modifier.padding(horizontal = DesignSystem.spacer),
        verticalArrangement = Arrangement.spacedBy(DesignSystem.instance.spacer)
    ) {
        items(items = shortWeathers) { location ->
            DashboardCard(
                modifier = modifier,
                shortWeather = location,
                onClick = {},
            )
        }
    }
}


@Preview(showBackground = true, widthDp = 320, heightDp = 600)
@Composable
fun DashboardScreenPreview() {
    WeatherTheme {
        DashboardScreen(
            modifier = Modifier.fillMaxSize(),
            shortWeathers = arrayListOf(
                ShortWeather(
                    title = "Dnipro",
                    subtitle = "Slobozhan'ske",
                    conditions = "Cloudy",
                    currentTemperature = 18u,
                    maxTemperature = 26u,
                    minTemperature = 16u,
                ),
                ShortWeather(
                    title = "London",
                    subtitle = "Subtitle",
                    conditions = "Sunny",
                    currentTemperature = 32u,
                    maxTemperature = 34u,
                    minTemperature = 30u,
                ),
            ),
            onContinueClicked = {},
        )
    }
}
