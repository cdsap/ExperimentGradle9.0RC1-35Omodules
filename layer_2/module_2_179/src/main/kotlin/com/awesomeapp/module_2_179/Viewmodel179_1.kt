package com.awesomeapp.module_2_179

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_1_88.Repository88_5
import com.awesomeapp.module_1_72.Repository72_5
import com.awesomeapp.module_1_112.Repository112_5
import com.awesomeapp.module_1_92.Repository92_5
import com.awesomeapp.module_1_76.Repository76_5
import com.awesomeapp.module_1_116.Repository116_5
import com.awesomeapp.module_1_80.Repository80_5
import com.awesomeapp.module_1_136.Repository136_5
import com.awesomeapp.module_1_104.Repository104_5
import com.awesomeapp.module_1_96.Repository96_5
import com.awesomeapp.module_1_100.Repository100_5
import com.awesomeapp.module_1_84.Repository84_5


@HiltViewModel
class Viewmodel179_1 @Inject constructor(
    private val repository0: Repository88_5,
    private val repository1: Repository72_5,
    private val repository2: Repository112_5,
    private val repository3: Repository92_5,
    private val repository4: Repository76_5,
    private val repository5: Repository116_5,
    private val repository6: Repository80_5,
    private val repository7: Repository136_5,
    private val repository8: Repository104_5,
    private val repository9: Repository96_5,
    private val repository10: Repository100_5,
    private val repository11: Repository84_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}