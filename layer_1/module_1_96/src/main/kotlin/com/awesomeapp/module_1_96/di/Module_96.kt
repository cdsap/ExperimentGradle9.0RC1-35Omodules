package com.awesomeapp.module_1_96.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_96.Viewmodel96_1
import com.awesomeapp.module_1_96.Activity96_2
import com.awesomeapp.module_1_96.Activity96_3
import com.awesomeapp.module_1_96.Fragment96_4
import com.awesomeapp.module_1_96.Repository96_5
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_96.Usecase96_7
import com.awesomeapp.module_1_96.Model96_9
import com.awesomeapp.module_1_96.Model96_10
import com.awesomeapp.module_1_96.Activity96_11
import com.awesomeapp.module_1_96.Model96_13
import com.awesomeapp.module_1_96.Activity96_14
import com.awesomeapp.module_1_96.Model96_16
import com.awesomeapp.module_1_96.Activity96_17
import com.awesomeapp.module_1_96.Model96_19
import com.awesomeapp.module_1_96.Activity96_20
import com.awesomeapp.module_1_96.Model96_22
import com.awesomeapp.module_1_96.Activity96_23
import com.awesomeapp.module_1_96.Model96_25
import com.awesomeapp.module_1_96.Activity96_26
import com.awesomeapp.module_1_96.Model96_28
import com.awesomeapp.module_1_96.Activity96_29

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api32_6 = Api32_6(),
        api1: Api64_6 = Api64_6(),
        api2: Api68_6 = Api68_6(),
        api3: Api36_6 = Api36_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}