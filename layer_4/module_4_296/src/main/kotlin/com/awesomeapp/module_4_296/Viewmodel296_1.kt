package com.awesomeapp.module_4_296

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_244.Repository244_5
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_3_268.Repository268_5
import com.awesomeapp.module_3_276.Repository276_5
import com.awesomeapp.module_3_280.Repository280_5
import com.awesomeapp.module_3_272.Repository272_5
import com.awesomeapp.module_3_216.Repository216_5
import com.awesomeapp.module_3_228.Repository228_5
import com.awesomeapp.module_3_220.Repository220_5
import com.awesomeapp.module_3_236.Repository236_5
import com.awesomeapp.module_3_252.Repository252_5
import com.awesomeapp.module_3_248.Repository248_5
import com.awesomeapp.module_3_232.Repository232_5
import com.awesomeapp.module_3_212.Repository212_5


@HiltViewModel
class Viewmodel296_1 @Inject constructor(
    private val repository0: Repository244_5,
    private val repository1: Repository260_5,
    private val repository2: Repository268_5,
    private val repository3: Repository276_5,
    private val repository4: Repository280_5,
    private val repository5: Repository272_5,
    private val repository6: Repository216_5,
    private val repository7: Repository228_5,
    private val repository8: Repository220_5,
    private val repository9: Repository236_5,
    private val repository10: Repository252_5,
    private val repository11: Repository248_5,
    private val repository12: Repository232_5,
    private val repository13: Repository212_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}