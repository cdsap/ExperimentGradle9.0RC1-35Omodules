package com.awesomeapp.module_2_188.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_188.Viewmodel188_1
import com.awesomeapp.module_2_188.Activity188_2
import com.awesomeapp.module_2_188.Activity188_3
import com.awesomeapp.module_2_188.Fragment188_4
import com.awesomeapp.module_2_188.Repository188_5
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_188.Model188_8
import com.awesomeapp.module_2_188.Model188_9
import com.awesomeapp.module_2_188.Activity188_10
import com.awesomeapp.module_2_188.Model188_12
import com.awesomeapp.module_2_188.Activity188_13
import com.awesomeapp.module_2_188.Model188_15
import com.awesomeapp.module_2_188.Activity188_16
import com.awesomeapp.module_2_188.Model188_18
import com.awesomeapp.module_2_188.Activity188_19
import com.awesomeapp.module_2_188.Model188_21
import com.awesomeapp.module_2_188.Activity188_22
import com.awesomeapp.module_2_188.Model188_24
import com.awesomeapp.module_2_188.Activity188_25
import com.awesomeapp.module_2_188.Model188_27

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(
        api0: Api124_6 = Api124_6(),
        api1: Api120_6 = Api120_6(),
        api2: Api72_6 = Api72_6(),
        api3: Api136_6 = Api136_6(),
        api4: Api108_6 = Api108_6(),
        api5: Api128_6 = Api128_6(),
        api6: Api92_6 = Api92_6()
    ): Repository188_5 {
        return Repository188_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}