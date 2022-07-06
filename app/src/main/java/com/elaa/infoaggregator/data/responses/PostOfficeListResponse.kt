package com.elaa.infoaggregator.data.responses

import com.elaa.infoaggregator.data.models.remote.PostOffice
import com.google.gson.annotations.SerializedName

data class PostOfficeListResponse(
    @SerializedName("PostOffice") val postOfficeList: List<PostOffice>?
) : CommonResponse()
