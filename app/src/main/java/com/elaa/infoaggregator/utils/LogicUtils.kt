package com.elaa.infoaggregator.utils

import com.elaa.infoaggregator.utils.BaseUrl.PINCODE_LENGTH

fun String.isPincode() = isNumber() && length == PINCODE_LENGTH

fun String.isNumber(): Boolean = "[0-9]".toRegex().matches(this)