package com.awesomeapp.module_3_211

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_2_144.Repository144_5
import com.awesomeapp.module_2_172.Repository172_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_148.Repository148_5


@HiltViewModel
class Viewmodel211_1 @Inject constructor(
    private val repository0: Repository180_5,
    private val repository1: Repository144_5,
    private val repository2: Repository172_5,
    private val repository3: Repository196_5,
    private val repository4: Repository148_5
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