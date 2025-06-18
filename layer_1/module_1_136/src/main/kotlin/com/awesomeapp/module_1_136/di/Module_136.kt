package com.awesomeapp.module_1_136.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_136.Viewmodel136_1
import com.awesomeapp.module_1_136.Activity136_2
import com.awesomeapp.module_1_136.Activity136_3
import com.awesomeapp.module_1_136.Fragment136_4
import com.awesomeapp.module_1_136.Repository136_5
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_136.Model136_8
import com.awesomeapp.module_1_136.Model136_9
import com.awesomeapp.module_1_136.Activity136_10
import com.awesomeapp.module_1_136.Model136_12
import com.awesomeapp.module_1_136.Activity136_13
import com.awesomeapp.module_1_136.Model136_15
import com.awesomeapp.module_1_136.Activity136_16
import com.awesomeapp.module_1_136.Model136_18
import com.awesomeapp.module_1_136.Activity136_19
import com.awesomeapp.module_1_136.Model136_21
import com.awesomeapp.module_1_136.Activity136_22
import com.awesomeapp.module_1_136.Model136_24
import com.awesomeapp.module_1_136.Activity136_25
import com.awesomeapp.module_1_136.Model136_27
import com.awesomeapp.module_1_136.Activity136_28
import com.awesomeapp.module_1_136.Model136_30
import com.awesomeapp.module_1_136.Activity136_31
import com.awesomeapp.module_1_136.Model136_33
import com.awesomeapp.module_1_136.Activity136_34
import com.awesomeapp.module_1_136.Model136_36
import com.awesomeapp.module_1_136.Activity136_37
import com.awesomeapp.module_1_136.Model136_39
import com.awesomeapp.module_1_136.Activity136_40
import com.awesomeapp.module_1_136.Model136_42
import com.awesomeapp.module_1_136.Activity136_43
import com.awesomeapp.module_1_136.Model136_45
import com.awesomeapp.module_1_136.Activity136_46

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api60_6 = Api60_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api24_6 = Api24_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api36_6 = Api36_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}