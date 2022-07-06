package com.elaa.infoaggregator.ui.post_office

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.elaa.infoaggregator.data.repositories.PostOfficeRepository
import com.elaa.infoaggregator.data.responses.PostOfficeListResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PostOfficeViewModel @Inject constructor(private val postOfficeRepository: PostOfficeRepository) :
    ViewModel() {

    private val _postOfficeListResponseFlow = MutableStateFlow<PostOfficeListResponse?>(null)
    val postOfficeListResponseFlow = _postOfficeListResponseFlow.asStateFlow()
}