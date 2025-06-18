package com.awesomeapp.module_3_217

sealed class State217_36 {
    data object Loading : State217_36()
    data class Success(val data: String) : State217_36()
    data class Error(val message: String) : State217_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}