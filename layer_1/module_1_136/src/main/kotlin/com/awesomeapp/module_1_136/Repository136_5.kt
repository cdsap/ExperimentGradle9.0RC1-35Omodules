package com.awesomeapp.module_1_136

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_36.Api36_6


@Singleton
class Repository136_5 @Inject constructor(
    private val api0: Api60_6,
    private val api1: Api28_6,
    private val api2: Api24_6,
    private val api3: Api4_6,
    private val api4: Api36_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}