package com.awesomeapp.module_3_218

sealed class State218_24 {
    data object Loading : State218_24()
    data class Success(val data: String) : State218_24()
    data class Error(val message: String) : State218_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}