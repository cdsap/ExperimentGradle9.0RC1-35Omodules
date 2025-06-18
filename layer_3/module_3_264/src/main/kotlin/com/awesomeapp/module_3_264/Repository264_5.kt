package com.awesomeapp.module_3_264

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_172.Api172_6


@Singleton
class Repository264_5 @Inject constructor(
    private val api0: Api152_6,
    private val api1: Api172_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}