package com.elaa.infoaggregator.ui.post_office.screens

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elaa.infoaggregator.R
import com.elaa.infoaggregator.ui.post_office.PostOfficeViewModel

@Composable
fun PostOfficeScreen(context: Context, postOfficeViewModel: PostOfficeViewModel = viewModel()) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 24.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "\uD83C\uDF3F  Post Office List",
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }
}