package com.awesomeapp.module_1_82

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_0_16.Repository16_5
import com.awesomeapp.module_0_12.Repository12_5
import com.awesomeapp.module_0_24.Repository24_5
import com.awesomeapp.module_0_36.Repository36_5


@HiltViewModel
class Viewmodel82_1 @Inject constructor(
    private val repository0: Repository16_5,
    private val repository1: Repository12_5,
    private val repository2: Repository24_5,
    private val repository3: Repository36_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}