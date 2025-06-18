package com.awesomeapp.module_4_304.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_304.Viewmodel304_1
import com.awesomeapp.module_4_304.Activity304_2
import com.awesomeapp.module_4_304.Activity304_3
import com.awesomeapp.module_4_304.Fragment304_4
import com.awesomeapp.module_4_304.Repository304_5
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_4_304.Api304_6
import com.awesomeapp.module_4_304.Model304_7

@Module
@InstallIn(SingletonComponent::class)
object Module_304 {
    @Provides
    @Singleton
    fun provideRepository304_5(
        api0: Api248_6 = Api248_6(),
        api1: Api232_6 = Api232_6(),
        api2: Api216_6 = Api216_6(),
        api3: Api252_6 = Api252_6(),
        api4: Api272_6 = Api272_6(),
        api5: Api280_6 = Api280_6(),
        api6: Api268_6 = Api268_6(),
        api7: Api212_6 = Api212_6()
    ): Repository304_5 {
        return Repository304_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi304_6(): Api304_6 {
        return Api304_6()
    }
}