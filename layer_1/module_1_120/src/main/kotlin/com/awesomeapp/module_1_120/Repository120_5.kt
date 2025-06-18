package com.awesomeapp.module_1_120

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_68.Api68_6


@Singleton
class Repository120_5 @Inject constructor(
    private val api0: Api64_6,
    private val api1: Api68_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}