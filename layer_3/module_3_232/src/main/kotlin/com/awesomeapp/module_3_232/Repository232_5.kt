package com.awesomeapp.module_3_232

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_208.Api208_6


@Singleton
class Repository232_5 @Inject constructor(
    private val api0: Api176_6,
    private val api1: Api196_6,
    private val api2: Api168_6,
    private val api3: Api164_6,
    private val api4: Api200_6,
    private val api5: Api152_6,
    private val api6: Api208_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}