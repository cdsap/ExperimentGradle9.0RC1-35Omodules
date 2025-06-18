package com.awesomeapp.module_3_219

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_168.Repository168_5
import com.awesomeapp.module_2_144.Repository144_5
import com.awesomeapp.module_2_156.Repository156_5
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_192.Repository192_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_160.Repository160_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_164.Repository164_5
import com.awesomeapp.module_2_188.Repository188_5
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_2_172.Repository172_5


@HiltViewModel
class Viewmodel219_1 @Inject constructor(
    private val repository0: Repository168_5,
    private val repository1: Repository144_5,
    private val repository2: Repository156_5,
    private val repository3: Repository184_5,
    private val repository4: Repository200_5,
    private val repository5: Repository192_5,
    private val repository6: Repository208_5,
    private val repository7: Repository160_5,
    private val repository8: Repository196_5,
    private val repository9: Repository164_5,
    private val repository10: Repository188_5,
    private val repository11: Repository180_5,
    private val repository12: Repository172_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}