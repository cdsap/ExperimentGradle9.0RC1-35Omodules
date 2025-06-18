package com.awesomeapp.module_3_212

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_144.Api144_6


@Singleton
class Repository212_5 @Inject constructor(
    private val api0: Api160_6,
    private val api1: Api196_6,
    private val api2: Api184_6,
    private val api3: Api176_6,
    private val api4: Api200_6,
    private val api5: Api144_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}