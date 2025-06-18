package com.awesomeapp.module_1_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_40.Api40_6


@Singleton
class Repository84_5 @Inject constructor(
    private val api0: Api56_6,
    private val api1: Api48_6,
    private val api2: Api52_6,
    private val api3: Api8_6,
    private val api4: Api4_6,
    private val api5: Api16_6,
    private val api6: Api36_6,
    private val api7: Api40_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}