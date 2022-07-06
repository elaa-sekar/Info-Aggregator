package com.elaa.infoaggregator.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import java.net.HttpURLConnection

object NetworkUtils {

    private const val HTTP_TOO_MANY_REQUESTS = 429

    // Method to check internet availability
    fun isInternetAvailable(context: Context): Boolean {
        return isWifiTurnedOn(context) || isMobileDataTurnedOn(context)
    }

    // Method to check wifi availability
    @Suppress("DEPRECATION")
    private fun isWifiTurnedOn(context: Context): Boolean {

        getConnectivityManager(context)?.apply {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                getNetworkCapabilities(activeNetwork)?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true
            } else activeNetworkInfo?.type == ConnectivityManager.TYPE_WIFI
        }
        return false
    }

    // Method to check Mobile Data availability
    @Suppress("DEPRECATION")
    private fun isMobileDataTurnedOn(context: Context): Boolean {

        getConnectivityManager(context)?.apply {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                getNetworkCapabilities(activeNetwork)
                    ?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) == true
            else activeNetworkInfo?.type == ConnectivityManager.TYPE_MOBILE
        }
        return false
    }

    private fun getConnectivityManager(context: Context): ConnectivityManager? {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    }

    // Common method to get message for the specific network response code
    fun getHttpStatusResponseMessage(httpStatus: Int): String {
        return "$httpStatus - ${
            when (httpStatus) {
                HttpURLConnection.HTTP_UNAUTHORIZED -> "Unauthorized"
                HttpURLConnection.HTTP_FORBIDDEN -> "Forbidden"
                HttpURLConnection.HTTP_NOT_FOUND -> "Not Found"
                HttpURLConnection.HTTP_BAD_METHOD -> "Method Not Allowed"
                HttpURLConnection.HTTP_NOT_ACCEPTABLE -> "Not Acceptable"
                HttpURLConnection.HTTP_CLIENT_TIMEOUT -> "Request Time-Out"
                HTTP_TOO_MANY_REQUESTS -> "Too Many Requests"
                HttpURLConnection.HTTP_INTERNAL_ERROR -> "Internal Server Error"
                HttpURLConnection.HTTP_UNAVAILABLE -> "Service Unavailable"
                HttpURLConnection.HTTP_BAD_GATEWAY -> "Bad Gateway"
                HttpURLConnection.HTTP_NOT_IMPLEMENTED -> "Not Implemented"
                HttpURLConnection.HTTP_GATEWAY_TIMEOUT -> "Gateway Timeout"
                else -> "Unknown API Error/Exception"
            }
        }"
    }
}