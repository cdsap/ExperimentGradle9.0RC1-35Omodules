package com.awesomeapp.module_4_284

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_260.Api260_6


@Singleton
class Repository284_5 @Inject constructor(
    private val api0: Api212_6,
    private val api1: Api252_6,
    private val api2: Api280_6,
    private val api3: Api264_6,
    private val api4: Api268_6,
    private val api5: Api228_6,
    private val api6: Api260_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}