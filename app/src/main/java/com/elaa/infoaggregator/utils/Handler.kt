package com.elaa.infoaggregator.utils

import timber.log.Timber

fun tryAndCatch(
    task: () -> Any?,
) {
    try {
        task.invoke()
    } catch (exception: Exception) {
        Timber.d("Exception in $task -> $exception")
    }
}