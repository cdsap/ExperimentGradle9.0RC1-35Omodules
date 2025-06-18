package com.awesomeapp.module_4_328

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_280.Api280_6


@Singleton
class Repository328_5 @Inject constructor(
    private val api0: Api216_6,
    private val api1: Api228_6,
    private val api2: Api244_6,
    private val api3: Api232_6,
    private val api4: Api268_6,
    private val api5: Api264_6,
    private val api6: Api240_6,
    private val api7: Api280_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}