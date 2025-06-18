package com.awesomeapp.module_1_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_52.Api52_6


@Singleton
class Repository104_5 @Inject constructor(
    private val api0: Api12_6,
    private val api1: Api20_6,
    private val api2: Api64_6,
    private val api3: Api60_6,
    private val api4: Api52_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}