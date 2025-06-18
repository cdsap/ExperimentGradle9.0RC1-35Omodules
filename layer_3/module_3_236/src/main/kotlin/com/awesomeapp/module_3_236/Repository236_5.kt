package com.awesomeapp.module_3_236

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_192.Api192_6


@Singleton
class Repository236_5 @Inject constructor(
    private val api0: Api148_6,
    private val api1: Api188_6,
    private val api2: Api164_6,
    private val api3: Api156_6,
    private val api4: Api172_6,
    private val api5: Api204_6,
    private val api6: Api180_6,
    private val api7: Api208_6,
    private val api8: Api192_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}