package com.awesomeapp.module_3_212

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_160.Repository160_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_144.Repository144_5


@HiltViewModel
class Viewmodel212_1 @Inject constructor(
    private val repository0: Repository160_5,
    private val repository1: Repository196_5,
    private val repository2: Repository184_5,
    private val repository3: Repository176_5,
    private val repository4: Repository200_5,
    private val repository5: Repository144_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}