package com.awesomeapp.module_2_156.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_156.Viewmodel156_1
import com.awesomeapp.module_2_156.Activity156_2
import com.awesomeapp.module_2_156.Activity156_3
import com.awesomeapp.module_2_156.Fragment156_4
import com.awesomeapp.module_2_156.Repository156_5
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_156.Usecase156_7
import com.awesomeapp.module_2_156.Model156_9
import com.awesomeapp.module_2_156.Model156_10
import com.awesomeapp.module_2_156.Activity156_11
import com.awesomeapp.module_2_156.Model156_13
import com.awesomeapp.module_2_156.Activity156_14
import com.awesomeapp.module_2_156.Model156_16
import com.awesomeapp.module_2_156.Activity156_17
import com.awesomeapp.module_2_156.Model156_19
import com.awesomeapp.module_2_156.Activity156_20
import com.awesomeapp.module_2_156.Model156_22
import com.awesomeapp.module_2_156.Activity156_23
import com.awesomeapp.module_2_156.Model156_25
import com.awesomeapp.module_2_156.Activity156_26
import com.awesomeapp.module_2_156.Model156_28
import com.awesomeapp.module_2_156.Activity156_29

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api140_6 = Api140_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api72_6 = Api72_6(),
        api3: Api100_6 = Api100_6(),
        api4: Api116_6 = Api116_6(),
        api5: Api88_6 = Api88_6(),
        api6: Api136_6 = Api136_6(),
        api7: Api112_6 = Api112_6(),
        api8: Api80_6 = Api80_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}