package com.awesomeapp.module_1_111

sealed class State111_25 {
    data object Loading : State111_25()
    data class Success(val data: String) : State111_25()
    data class Error(val message: String) : State111_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}