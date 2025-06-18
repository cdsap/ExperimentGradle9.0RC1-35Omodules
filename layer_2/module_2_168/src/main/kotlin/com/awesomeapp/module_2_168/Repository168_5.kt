package com.awesomeapp.module_2_168

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_76.Api76_6


@Singleton
class Repository168_5 @Inject constructor(
    private val api0: Api76_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}