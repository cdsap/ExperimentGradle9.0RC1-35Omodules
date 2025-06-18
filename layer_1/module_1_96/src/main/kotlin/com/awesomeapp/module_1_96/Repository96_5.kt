package com.awesomeapp.module_1_96

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_0_36.Api36_6


@Singleton
class Repository96_5 @Inject constructor(
    private val api0: Api32_6,
    private val api1: Api64_6,
    private val api2: Api68_6,
    private val api3: Api36_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}