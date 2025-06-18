package com.awesomeapp.module_4_316

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_240.Api240_6


@Singleton
class Repository316_5 @Inject constructor(
    private val api0: Api236_6,
    private val api1: Api256_6,
    private val api2: Api232_6,
    private val api3: Api248_6,
    private val api4: Api240_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}