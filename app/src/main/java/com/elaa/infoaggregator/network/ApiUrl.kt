package com.elaa.infoaggregator.network


object PathParam {
    const val POST_OFFICE_NAME = "post_office"
    const val PINCODE = "pincode"
}


object ApiUrl {

    const val SEARCH_PINCODE = "pincode/{${PathParam.PINCODE}}"
    const val SEARCH_POST_OFFICE = "postoffice/{${PathParam.POST_OFFICE_NAME}}"

}