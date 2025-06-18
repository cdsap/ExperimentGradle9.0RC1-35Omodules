package com.awesomeapp.module_4_292.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_292.Viewmodel292_1
import com.awesomeapp.module_4_292.Activity292_2
import com.awesomeapp.module_4_292.Activity292_3
import com.awesomeapp.module_4_292.Fragment292_4
import com.awesomeapp.module_4_292.Repository292_5
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_4_292.Api292_6
import com.awesomeapp.module_4_292.Model292_8
import com.awesomeapp.module_4_292.Model292_9
import com.awesomeapp.module_4_292.Activity292_10
import com.awesomeapp.module_4_292.Model292_12
import com.awesomeapp.module_4_292.Activity292_13
import com.awesomeapp.module_4_292.Model292_15
import com.awesomeapp.module_4_292.Activity292_16
import com.awesomeapp.module_4_292.Model292_18
import com.awesomeapp.module_4_292.Activity292_19
import com.awesomeapp.module_4_292.Model292_21
import com.awesomeapp.module_4_292.Activity292_22
import com.awesomeapp.module_4_292.Model292_24
import com.awesomeapp.module_4_292.Activity292_25
import com.awesomeapp.module_4_292.Model292_27
import com.awesomeapp.module_4_292.Activity292_28
import com.awesomeapp.module_4_292.Model292_30
import com.awesomeapp.module_4_292.Activity292_31
import com.awesomeapp.module_4_292.Model292_33

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api260_6 = Api260_6()
    ): Repository292_5 {
        return Repository292_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}