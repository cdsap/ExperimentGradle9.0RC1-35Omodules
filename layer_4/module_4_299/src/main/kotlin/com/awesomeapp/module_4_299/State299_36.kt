package com.awesomeapp.module_4_299

sealed class State299_36 {
    data object Loading : State299_36()
    data class Success(val data: String) : State299_36()
    data class Error(val message: String) : State299_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}