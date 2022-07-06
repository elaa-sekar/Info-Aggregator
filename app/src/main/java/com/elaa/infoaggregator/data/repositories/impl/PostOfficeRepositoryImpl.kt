package com.elaa.infoaggregator.data.repositories.impl

import com.elaa.infoaggregator.data.repositories.PostOfficeRepository
import com.elaa.infoaggregator.data.responses.PostOfficeListResponse
import com.elaa.infoaggregator.network.ApiService
import javax.inject.Inject

class PostOfficeRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : PostOfficeRepository {

    override fun searchPincode(pincode: String): PostOfficeListResponse {

    }

    override fun searchPostOffice(postOffice: String): PostOfficeListResponse {

    }

}