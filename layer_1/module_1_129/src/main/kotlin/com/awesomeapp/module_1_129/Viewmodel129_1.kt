package com.awesomeapp.module_1_129

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_0_40.Repository40_5
import com.awesomeapp.module_0_16.Repository16_5
import com.awesomeapp.module_0_12.Repository12_5
import com.awesomeapp.module_0_64.Repository64_5
import com.awesomeapp.module_0_28.Repository28_5
import com.awesomeapp.module_0_48.Repository48_5
import com.awesomeapp.module_0_20.Repository20_5
import com.awesomeapp.module_0_60.Repository60_5
import com.awesomeapp.module_0_68.Repository68_5
import com.awesomeapp.module_0_44.Repository44_5
import com.awesomeapp.module_0_8.Repository8_5


@HiltViewModel
class Viewmodel129_1 @Inject constructor(
    private val repository0: Repository40_5,
    private val repository1: Repository16_5,
    private val repository2: Repository12_5,
    private val repository3: Repository64_5,
    private val repository4: Repository28_5,
    private val repository5: Repository48_5,
    private val repository6: Repository20_5,
    private val repository7: Repository60_5,
    private val repository8: Repository68_5,
    private val repository9: Repository44_5,
    private val repository10: Repository8_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}