package com.awesomeapp.module_2_156

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_80.Api80_6


@Singleton
class Repository156_5 @Inject constructor(
    private val api0: Api140_6,
    private val api1: Api132_6,
    private val api2: Api72_6,
    private val api3: Api100_6,
    private val api4: Api116_6,
    private val api5: Api88_6,
    private val api6: Api136_6,
    private val api7: Api112_6,
    private val api8: Api80_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}