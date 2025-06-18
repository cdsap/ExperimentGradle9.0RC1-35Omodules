package com.awesomeapp.module_4_332

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_240.Api240_6


@Singleton
class Repository332_5 @Inject constructor(
    private val api0: Api244_6,
    private val api1: Api220_6,
    private val api2: Api272_6,
    private val api3: Api280_6,
    private val api4: Api212_6,
    private val api5: Api264_6,
    private val api6: Api232_6,
    private val api7: Api224_6,
    private val api8: Api240_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}