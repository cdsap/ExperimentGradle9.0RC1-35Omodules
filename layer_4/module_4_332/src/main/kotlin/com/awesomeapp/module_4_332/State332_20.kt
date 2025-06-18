package com.awesomeapp.module_4_332

sealed class State332_20 {
    data object Loading : State332_20()
    data class Success(val data: String) : State332_20()
    data class Error(val message: String) : State332_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}