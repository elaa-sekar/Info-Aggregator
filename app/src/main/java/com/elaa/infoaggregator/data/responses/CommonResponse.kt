package com.elaa.infoaggregator.data.responses

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


@Serializable
open class CommonResponse(
    @SerialName("Message")  val message: String = "",
    @SerialName("Status") val status: String = ""
)