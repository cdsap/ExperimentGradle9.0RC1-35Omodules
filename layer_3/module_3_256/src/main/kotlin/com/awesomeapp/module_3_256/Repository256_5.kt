package com.awesomeapp.module_3_256

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_160.Api160_6


@Singleton
class Repository256_5 @Inject constructor(
    private val api0: Api184_6,
    private val api1: Api200_6,
    private val api2: Api148_6,
    private val api3: Api172_6,
    private val api4: Api164_6,
    private val api5: Api152_6,
    private val api6: Api176_6,
    private val api7: Api160_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}