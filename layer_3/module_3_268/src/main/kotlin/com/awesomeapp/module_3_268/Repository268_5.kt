package com.awesomeapp.module_3_268

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_144.Api144_6


@Singleton
class Repository268_5 @Inject constructor(
    private val api0: Api160_6,
    private val api1: Api200_6,
    private val api2: Api196_6,
    private val api3: Api156_6,
    private val api4: Api188_6,
    private val api5: Api176_6,
    private val api6: Api152_6,
    private val api7: Api164_6,
    private val api8: Api168_6,
    private val api9: Api184_6,
    private val api10: Api172_6,
    private val api11: Api180_6,
    private val api12: Api144_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData() + api10.fetchData() + api11.fetchData() + api12.fetchData()
    }
}