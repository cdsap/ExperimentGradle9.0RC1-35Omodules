package com.awesomeapp.module_3_272

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_144.Repository144_5
import com.awesomeapp.module_2_156.Repository156_5
import com.awesomeapp.module_2_168.Repository168_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_192.Repository192_5


@HiltViewModel
class Viewmodel272_1 @Inject constructor(
    private val repository0: Repository144_5,
    private val repository1: Repository156_5,
    private val repository2: Repository168_5,
    private val repository3: Repository208_5,
    private val repository4: Repository192_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}