package com.elaa.infoaggregator.data.repositories

import com.elaa.infoaggregator.data.responses.PostOfficeListResponse

interface PostOfficeRepository {

    fun searchPincode(pincode: String): PostOfficeListResponse
    fun searchPostOffice(postOffice: String): PostOfficeListResponse

}