package com.awesomeapp.module_2_180

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_72.Api72_6


@Singleton
class Repository180_5 @Inject constructor(
    private val api0: Api124_6,
    private val api1: Api104_6,
    private val api2: Api92_6,
    private val api3: Api76_6,
    private val api4: Api112_6,
    private val api5: Api88_6,
    private val api6: Api108_6,
    private val api7: Api132_6,
    private val api8: Api72_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}