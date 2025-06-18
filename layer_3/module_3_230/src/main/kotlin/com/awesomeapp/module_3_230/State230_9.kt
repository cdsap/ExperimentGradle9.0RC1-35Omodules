package com.awesomeapp.module_3_230

sealed class State230_9 {
    data object Loading : State230_9()
    data class Success(val data: String) : State230_9()
    data class Error(val message: String) : State230_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}