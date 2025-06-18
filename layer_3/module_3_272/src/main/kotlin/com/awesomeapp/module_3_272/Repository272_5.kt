package com.awesomeapp.module_3_272

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_192.Api192_6


@Singleton
class Repository272_5 @Inject constructor(
    private val api0: Api144_6,
    private val api1: Api156_6,
    private val api2: Api168_6,
    private val api3: Api208_6,
    private val api4: Api192_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}