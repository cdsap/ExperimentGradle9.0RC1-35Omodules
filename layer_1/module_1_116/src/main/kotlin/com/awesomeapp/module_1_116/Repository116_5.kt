package com.awesomeapp.module_1_116

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_44.Api44_6


@Singleton
class Repository116_5 @Inject constructor(
    private val api0: Api40_6,
    private val api1: Api16_6,
    private val api2: Api8_6,
    private val api3: Api4_6,
    private val api4: Api48_6,
    private val api5: Api32_6,
    private val api6: Api44_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}