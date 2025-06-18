package com.awesomeapp.module_4_312

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_220.Api220_6


@Singleton
class Repository312_5 @Inject constructor(
    private val api0: Api276_6,
    private val api1: Api228_6,
    private val api2: Api256_6,
    private val api3: Api260_6,
    private val api4: Api224_6,
    private val api5: Api220_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}