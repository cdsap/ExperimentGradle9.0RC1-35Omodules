package com.awesomeapp.module_1_92.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_92.Viewmodel92_1
import com.awesomeapp.module_1_92.Activity92_2
import com.awesomeapp.module_1_92.Activity92_3
import com.awesomeapp.module_1_92.Fragment92_4
import com.awesomeapp.module_1_92.Repository92_5
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_92.Model92_8
import com.awesomeapp.module_1_92.Model92_9
import com.awesomeapp.module_1_92.Activity92_10
import com.awesomeapp.module_1_92.Model92_12
import com.awesomeapp.module_1_92.Activity92_13
import com.awesomeapp.module_1_92.Model92_15
import com.awesomeapp.module_1_92.Activity92_16
import com.awesomeapp.module_1_92.Model92_18
import com.awesomeapp.module_1_92.Activity92_19
import com.awesomeapp.module_1_92.Model92_21
import com.awesomeapp.module_1_92.Activity92_22
import com.awesomeapp.module_1_92.Model92_24
import com.awesomeapp.module_1_92.Activity92_25

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(
        api0: Api4_6 = Api4_6(),
        api1: Api36_6 = Api36_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api56_6 = Api56_6(),
        api4: Api64_6 = Api64_6()
    ): Repository92_5 {
        return Repository92_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}