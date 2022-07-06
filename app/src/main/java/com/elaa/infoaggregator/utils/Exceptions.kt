package com.elaa.infoaggregator.utils

import java.io.IOException

// To maintain all the custom exception classes
class NoInternetException(message: String) : IOException(message)
class ApiException(message: String) : IOException(message)
class BadRequestException(message: String) : IOException(message)
class AuthenticationFailureException(message: String) : IOException(message)
class TooManyRequestsException(message: String) : IOException(message)
class UrlNotFoundException(message: String) : IOException(message)
class ApiServerException(message: String) : IOException(message)
class BadGateWayException(message: String) : IOException(message)
class UnknownApiException(message: String) : IOException(message)
class ForbiddenResourceException(message: String) : IOException(message)
class NotSupportedOrNotAllowedException(message: String) : IOException(message)
class ServiceUnavailableException(message: String) : IOException(message)

class NetworkResponseException(var code: Int, message: String) : IOException(message)