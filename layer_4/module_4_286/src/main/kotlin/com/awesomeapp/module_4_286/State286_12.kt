package com.awesomeapp.module_4_286

sealed class State286_12 {
    data object Loading : State286_12()
    data class Success(val data: String) : State286_12()
    data class Error(val message: String) : State286_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}