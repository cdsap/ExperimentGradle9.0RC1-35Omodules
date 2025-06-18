package com.awesomeapp.module_2_201

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_1_92.Repository92_5
import com.awesomeapp.module_1_128.Repository128_5
import com.awesomeapp.module_1_100.Repository100_5
import com.awesomeapp.module_1_124.Repository124_5
import com.awesomeapp.module_1_72.Repository72_5
import com.awesomeapp.module_1_116.Repository116_5
import com.awesomeapp.module_1_108.Repository108_5
import com.awesomeapp.module_1_84.Repository84_5
import com.awesomeapp.module_1_132.Repository132_5


@HiltViewModel
class Viewmodel201_1 @Inject constructor(
    private val repository0: Repository92_5,
    private val repository1: Repository128_5,
    private val repository2: Repository100_5,
    private val repository3: Repository124_5,
    private val repository4: Repository72_5,
    private val repository5: Repository116_5,
    private val repository6: Repository108_5,
    private val repository7: Repository84_5,
    private val repository8: Repository132_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}