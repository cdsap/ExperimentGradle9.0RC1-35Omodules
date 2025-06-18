package com.awesomeapp.module_3_221

sealed class State221_30 {
    data object Loading : State221_30()
    data class Success(val data: String) : State221_30()
    data class Error(val message: String) : State221_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}