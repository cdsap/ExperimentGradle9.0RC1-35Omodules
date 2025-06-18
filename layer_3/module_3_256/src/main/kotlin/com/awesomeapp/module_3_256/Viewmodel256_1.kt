package com.awesomeapp.module_3_256

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_148.Repository148_5
import com.awesomeapp.module_2_172.Repository172_5
import com.awesomeapp.module_2_164.Repository164_5
import com.awesomeapp.module_2_152.Repository152_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_160.Repository160_5


@HiltViewModel
class Viewmodel256_1 @Inject constructor(
    private val repository0: Repository184_5,
    private val repository1: Repository200_5,
    private val repository2: Repository148_5,
    private val repository3: Repository172_5,
    private val repository4: Repository164_5,
    private val repository5: Repository152_5,
    private val repository6: Repository176_5,
    private val repository7: Repository160_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}