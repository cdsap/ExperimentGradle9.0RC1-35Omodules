package com.awesomeapp.module_4_340

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_240.Api240_6


@Singleton
class Repository340_5 @Inject constructor(
    private val api0: Api224_6,
    private val api1: Api220_6,
    private val api2: Api240_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}