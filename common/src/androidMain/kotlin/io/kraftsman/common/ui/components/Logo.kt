package io.kraftsman.common.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.kraftsman.common.R

@Composable
actual fun Logo() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = "Android Logo",
        modifier = Modifier.size(160.dp),
    )
}