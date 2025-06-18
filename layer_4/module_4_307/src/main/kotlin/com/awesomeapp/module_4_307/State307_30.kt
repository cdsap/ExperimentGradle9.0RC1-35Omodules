package com.awesomeapp.module_4_307

sealed class State307_30 {
    data object Loading : State307_30()
    data class Success(val data: String) : State307_30()
    data class Error(val message: String) : State307_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}