package com.awesomeapp.module_3_252

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_204.Api204_6


@Singleton
class Repository252_5 @Inject constructor(
    private val api0: Api180_6,
    private val api1: Api208_6,
    private val api2: Api188_6,
    private val api3: Api204_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}