package com.awesomeapp.module_3_236.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_236.Viewmodel236_1
import com.awesomeapp.module_3_236.Activity236_2
import com.awesomeapp.module_3_236.Activity236_3
import com.awesomeapp.module_3_236.Fragment236_4
import com.awesomeapp.module_3_236.Repository236_5
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_236.Model236_8
import com.awesomeapp.module_3_236.Model236_9
import com.awesomeapp.module_3_236.Activity236_10
import com.awesomeapp.module_3_236.Model236_12
import com.awesomeapp.module_3_236.Activity236_13
import com.awesomeapp.module_3_236.Model236_15
import com.awesomeapp.module_3_236.Activity236_16
import com.awesomeapp.module_3_236.Model236_18
import com.awesomeapp.module_3_236.Activity236_19
import com.awesomeapp.module_3_236.Model236_21
import com.awesomeapp.module_3_236.Activity236_22
import com.awesomeapp.module_3_236.Model236_24
import com.awesomeapp.module_3_236.Activity236_25
import com.awesomeapp.module_3_236.Model236_27
import com.awesomeapp.module_3_236.Activity236_28

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api148_6 = Api148_6(),
        api1: Api188_6 = Api188_6(),
        api2: Api164_6 = Api164_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api172_6 = Api172_6(),
        api5: Api204_6 = Api204_6(),
        api6: Api180_6 = Api180_6(),
        api7: Api208_6 = Api208_6(),
        api8: Api192_6 = Api192_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
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
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}