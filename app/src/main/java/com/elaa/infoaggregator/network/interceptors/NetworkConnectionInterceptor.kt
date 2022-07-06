package com.elaa.infoaggregator.network.interceptors

import android.content.Context
import com.elaa.infoaggregator.R
import com.elaa.infoaggregator.utils.ApiException
import com.elaa.infoaggregator.utils.NetworkUtils.isInternetAvailable
import com.elaa.infoaggregator.utils.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor(private val context: Context) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        with(context) {
            if (!isInternetAvailable(this)) {
                throw NoInternetException(getString(R.string.message_no_internet))
            } else {
                try {
                    return chain.proceed(chain.request())
                } catch (exception: Exception) {
                    throw ApiException(exception.message ?: exception.toString())
                }
            }
        }
    }
}