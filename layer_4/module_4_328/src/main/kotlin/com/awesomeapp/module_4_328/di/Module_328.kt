package com.awesomeapp.module_4_328.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_328.Viewmodel328_1
import com.awesomeapp.module_4_328.Activity328_2
import com.awesomeapp.module_4_328.Activity328_3
import com.awesomeapp.module_4_328.Fragment328_4
import com.awesomeapp.module_4_328.Repository328_5
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_4_328.Api328_6
import com.awesomeapp.module_4_328.Model328_8
import com.awesomeapp.module_4_328.Model328_9
import com.awesomeapp.module_4_328.Activity328_10
import com.awesomeapp.module_4_328.Model328_12
import com.awesomeapp.module_4_328.Activity328_13
import com.awesomeapp.module_4_328.Model328_15
import com.awesomeapp.module_4_328.Activity328_16
import com.awesomeapp.module_4_328.Model328_18
import com.awesomeapp.module_4_328.Activity328_19
import com.awesomeapp.module_4_328.Model328_21
import com.awesomeapp.module_4_328.Activity328_22
import com.awesomeapp.module_4_328.Model328_24
import com.awesomeapp.module_4_328.Activity328_25
import com.awesomeapp.module_4_328.Model328_27
import com.awesomeapp.module_4_328.Activity328_28
import com.awesomeapp.module_4_328.Model328_30
import com.awesomeapp.module_4_328.Activity328_31
import com.awesomeapp.module_4_328.Model328_33
import com.awesomeapp.module_4_328.Activity328_34
import com.awesomeapp.module_4_328.Model328_36

@Module
@InstallIn(SingletonComponent::class)
object Module_328 {
    @Provides
    @Singleton
    fun provideRepository328_5(
        api0: Api216_6 = Api216_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api244_6 = Api244_6(),
        api3: Api232_6 = Api232_6(),
        api4: Api268_6 = Api268_6(),
        api5: Api264_6 = Api264_6(),
        api6: Api240_6 = Api240_6(),
        api7: Api280_6 = Api280_6()
    ): Repository328_5 {
        return Repository328_5(api0, 
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
    fun provideApi328_6(): Api328_6 {
        return Api328_6()
    }
}