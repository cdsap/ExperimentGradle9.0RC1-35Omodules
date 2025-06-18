package com.awesomeapp.module_4_320

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_268.Repository268_5
import com.awesomeapp.module_3_220.Repository220_5
import com.awesomeapp.module_3_224.Repository224_5
import com.awesomeapp.module_3_228.Repository228_5
import com.awesomeapp.module_3_280.Repository280_5
import com.awesomeapp.module_3_232.Repository232_5
import com.awesomeapp.module_3_240.Repository240_5
import com.awesomeapp.module_3_244.Repository244_5
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_3_276.Repository276_5
import com.awesomeapp.module_3_212.Repository212_5
import com.awesomeapp.module_3_264.Repository264_5
import com.awesomeapp.module_3_256.Repository256_5
import com.awesomeapp.module_3_236.Repository236_5
import com.awesomeapp.module_3_272.Repository272_5
import com.awesomeapp.module_3_248.Repository248_5


@HiltViewModel
class Viewmodel320_1 @Inject constructor(
    private val repository0: Repository268_5,
    private val repository1: Repository220_5,
    private val repository2: Repository224_5,
    private val repository3: Repository228_5,
    private val repository4: Repository280_5,
    private val repository5: Repository232_5,
    private val repository6: Repository240_5,
    private val repository7: Repository244_5,
    private val repository8: Repository260_5,
    private val repository9: Repository276_5,
    private val repository10: Repository212_5,
    private val repository11: Repository264_5,
    private val repository12: Repository256_5,
    private val repository13: Repository236_5,
    private val repository14: Repository272_5,
    private val repository15: Repository248_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}