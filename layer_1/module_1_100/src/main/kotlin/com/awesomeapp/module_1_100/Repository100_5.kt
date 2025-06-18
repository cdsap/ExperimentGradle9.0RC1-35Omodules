package com.awesomeapp.module_1_100

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_40.Api40_6


@Singleton
class Repository100_5 @Inject constructor(
    private val api0: Api32_6,
    private val api1: Api40_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}