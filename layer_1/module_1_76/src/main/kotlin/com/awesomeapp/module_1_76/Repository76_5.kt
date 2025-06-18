package com.awesomeapp.module_1_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_40.Api40_6


@Singleton
class Repository76_5 @Inject constructor(
    private val api0: Api40_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}