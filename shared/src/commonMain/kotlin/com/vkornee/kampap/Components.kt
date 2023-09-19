package com.vkornee.kampap

import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HelloFromMultiplatform() {
    Surface(
        modifier = Modifier
            .requiredSize(300.dp),
        elevation = 3.dp
    ) {
        Text(
            text = "Hello ${getPlatform().name}",
            color = Color.Red
        )
    }
}
