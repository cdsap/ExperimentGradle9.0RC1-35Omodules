package com.awesomeapp.module_1_100.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_100.Viewmodel100_1
import com.awesomeapp.module_1_100.Activity100_2
import com.awesomeapp.module_1_100.Activity100_3
import com.awesomeapp.module_1_100.Fragment100_4
import com.awesomeapp.module_1_100.Repository100_5
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_100.Service100_7
import com.awesomeapp.module_1_100.Worker100_8
import com.awesomeapp.module_1_100.Model100_10
import com.awesomeapp.module_1_100.Model100_11
import com.awesomeapp.module_1_100.Activity100_12
import com.awesomeapp.module_1_100.Model100_14
import com.awesomeapp.module_1_100.Activity100_15

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(
        api0: Api32_6 = Api32_6(),
        api1: Api40_6 = Api40_6()
    ): Repository100_5 {
        return Repository100_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}