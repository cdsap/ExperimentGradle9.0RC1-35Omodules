package com.awesomeapp.module_4_308

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_256.Api256_6


@Singleton
class Repository308_5 @Inject constructor(
    private val api0: Api276_6,
    private val api1: Api216_6,
    private val api2: Api264_6,
    private val api3: Api280_6,
    private val api4: Api232_6,
    private val api5: Api240_6,
    private val api6: Api252_6,
    private val api7: Api244_6,
    private val api8: Api236_6,
    private val api9: Api212_6,
    private val api10: Api224_6,
    private val api11: Api272_6,
    private val api12: Api268_6,
    private val api13: Api256_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData() + api10.fetchData() + api11.fetchData() + api12.fetchData() + api13.fetchData()
    }
}