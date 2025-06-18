package com.awesomeapp.module_4_313

sealed class State313_18 {
    data object Loading : State313_18()
    data class Success(val data: String) : State313_18()
    data class Error(val message: String) : State313_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}