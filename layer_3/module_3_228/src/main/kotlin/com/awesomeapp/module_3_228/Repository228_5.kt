package com.awesomeapp.module_3_228

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_152.Api152_6


@Singleton
class Repository228_5 @Inject constructor(
    private val api0: Api156_6,
    private val api1: Api208_6,
    private val api2: Api144_6,
    private val api3: Api192_6,
    private val api4: Api200_6,
    private val api5: Api204_6,
    private val api6: Api180_6,
    private val api7: Api160_6,
    private val api8: Api152_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}