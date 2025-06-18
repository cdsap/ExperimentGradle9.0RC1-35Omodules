package com.awesomeapp.module_2_199

sealed class State199_27 {
    data object Loading : State199_27()
    data class Success(val data: String) : State199_27()
    data class Error(val message: String) : State199_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}