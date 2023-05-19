package com.codenesia.kopindo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.codenesia.kopindo.data.KopiRepository

@Composable
fun DetailScreen(
    kopiId: String,
    viewModel: DetailViewModel = viewModel(factory = ViewModelFactory(KopiRepository())),
    navigateBack: () -> Unit
) {
    viewModel.getDetailKopi(kopiId)
    viewModel.detailKopi.collectAsState().value.let {
        Details(nama = it.name, desc = it.desc!!, photoUrl = it.photoUrl)

    }
}

@Composable
fun Details(nama: String, desc: String, photoUrl: String) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage(
                model = photoUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(18.dp)
                    .size(180.dp)
                    .clip(CircleShape)
            )
            Text(
                text = nama,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )

            Text(
                text = desc,
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}