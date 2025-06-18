package com.awesomeapp.module_2_208

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_108.Api108_6


@Singleton
class Repository208_5 @Inject constructor(
    private val api0: Api100_6,
    private val api1: Api84_6,
    private val api2: Api140_6,
    private val api3: Api124_6,
    private val api4: Api96_6,
    private val api5: Api76_6,
    private val api6: Api108_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}