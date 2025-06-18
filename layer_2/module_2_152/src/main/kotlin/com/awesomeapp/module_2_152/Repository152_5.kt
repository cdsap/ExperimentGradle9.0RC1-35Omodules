package com.awesomeapp.module_2_152

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_124.Api124_6


@Singleton
class Repository152_5 @Inject constructor(
    private val api0: Api104_6,
    private val api1: Api112_6,
    private val api2: Api120_6,
    private val api3: Api80_6,
    private val api4: Api140_6,
    private val api5: Api124_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}