package com.awesomeapp.module_4_349

sealed class State349_39 {
    data object Loading : State349_39()
    data class Success(val data: String) : State349_39()
    data class Error(val message: String) : State349_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}