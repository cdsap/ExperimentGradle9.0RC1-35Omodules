package com.awesomeapp.module_2_184

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_80.Api80_6


@Singleton
class Repository184_5 @Inject constructor(
    private val api0: Api80_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}