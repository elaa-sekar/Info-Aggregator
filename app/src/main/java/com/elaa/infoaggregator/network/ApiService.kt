package com.elaa.infoaggregator.network

import com.elaa.infoaggregator.data.responses.PostOfficeListResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET(ApiUrl.SEARCH_PINCODE)
    fun searchPincode(@Path(PathParam.PINCODE) pincode: String): Response<PostOfficeListResponse>

    @GET(ApiUrl.SEARCH_POST_OFFICE)
    fun searchPostOffice(@Path(PathParam.POST_OFFICE_NAME) postOffice: String): Response<PostOfficeListResponse>
}