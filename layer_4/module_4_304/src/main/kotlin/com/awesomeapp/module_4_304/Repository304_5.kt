package com.awesomeapp.module_4_304

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_212.Api212_6


@Singleton
class Repository304_5 @Inject constructor(
    private val api0: Api248_6,
    private val api1: Api232_6,
    private val api2: Api216_6,
    private val api3: Api252_6,
    private val api4: Api272_6,
    private val api5: Api280_6,
    private val api6: Api268_6,
    private val api7: Api212_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}