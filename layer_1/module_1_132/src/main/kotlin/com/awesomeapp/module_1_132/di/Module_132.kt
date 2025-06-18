package com.awesomeapp.module_1_132.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_132.Viewmodel132_1
import com.awesomeapp.module_1_132.Activity132_2
import com.awesomeapp.module_1_132.Activity132_3
import com.awesomeapp.module_1_132.Fragment132_4
import com.awesomeapp.module_1_132.Repository132_5
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_132.Usecase132_7
import com.awesomeapp.module_1_132.Model132_9
import com.awesomeapp.module_1_132.Model132_10
import com.awesomeapp.module_1_132.Activity132_11
import com.awesomeapp.module_1_132.Model132_13
import com.awesomeapp.module_1_132.Activity132_14
import com.awesomeapp.module_1_132.Model132_16
import com.awesomeapp.module_1_132.Activity132_17
import com.awesomeapp.module_1_132.Model132_19
import com.awesomeapp.module_1_132.Activity132_20
import com.awesomeapp.module_1_132.Model132_22
import com.awesomeapp.module_1_132.Activity132_23
import com.awesomeapp.module_1_132.Model132_25
import com.awesomeapp.module_1_132.Activity132_26
import com.awesomeapp.module_1_132.Model132_28
import com.awesomeapp.module_1_132.Activity132_29
import com.awesomeapp.module_1_132.Model132_31
import com.awesomeapp.module_1_132.Activity132_32
import com.awesomeapp.module_1_132.Model132_34
import com.awesomeapp.module_1_132.Activity132_35
import com.awesomeapp.module_1_132.Model132_37
import com.awesomeapp.module_1_132.Activity132_38
import com.awesomeapp.module_1_132.Model132_40
import com.awesomeapp.module_1_132.Activity132_41
import com.awesomeapp.module_1_132.Model132_43
import com.awesomeapp.module_1_132.Activity132_44
import com.awesomeapp.module_1_132.Model132_46
import com.awesomeapp.module_1_132.Activity132_47
import com.awesomeapp.module_1_132.Model132_49

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api32_6 = Api32_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api8_6 = Api8_6()
    ): Repository132_5 {
        return Repository132_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}