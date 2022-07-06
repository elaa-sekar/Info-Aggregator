package com.elaa.infoaggregator.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import timber.log.Timber

class HeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        chain.request().let {
            it.newBuilder().apply {
                header("Content-Type", "application/json")
                header("Accept", "application/json")
                Timber.d("Requested Url ${chain.request().url.host}")
                /*getAuthToken(it.url.host).let { authToken ->
                    if (authToken.isNotEmpty()) header("Authorization", "Bearer $authToken")
                }*/
            }.also { request ->
                return chain.proceed(request.build())
            }
        }
    }
}