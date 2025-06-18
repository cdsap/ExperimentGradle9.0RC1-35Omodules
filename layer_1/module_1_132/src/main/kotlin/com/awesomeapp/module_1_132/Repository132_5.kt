package com.awesomeapp.module_1_132

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_8.Api8_6


@Singleton
class Repository132_5 @Inject constructor(
    private val api0: Api32_6,
    private val api1: Api56_6,
    private val api2: Api8_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}