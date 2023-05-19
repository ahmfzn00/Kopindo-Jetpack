package com.codenesia.kopindo.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
) {
    Box( modifier = modifier) {
        Profile()
    }
}

@Composable
fun Profile() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage(
                model = "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:8c2eebb89315d91f5e7db115a16646c220220927150153.png",
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(18.dp)
                    .size(180.dp)
                    .clip(CircleShape)
            )
            Text(
                text = ("Ahmad Fauzan"),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )

            Text(
                text = ("achmdfzann@gmail.com"),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
        }
    }
}