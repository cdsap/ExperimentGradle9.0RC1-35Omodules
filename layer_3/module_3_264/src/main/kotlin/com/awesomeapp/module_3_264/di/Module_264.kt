package com.awesomeapp.module_3_264.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_264.Viewmodel264_1
import com.awesomeapp.module_3_264.Activity264_2
import com.awesomeapp.module_3_264.Activity264_3
import com.awesomeapp.module_3_264.Fragment264_4
import com.awesomeapp.module_3_264.Repository264_5
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_264.Usecase264_7
import com.awesomeapp.module_3_264.Model264_9
import com.awesomeapp.module_3_264.Model264_10
import com.awesomeapp.module_3_264.Activity264_11
import com.awesomeapp.module_3_264.Model264_13
import com.awesomeapp.module_3_264.Activity264_14
import com.awesomeapp.module_3_264.Model264_16
import com.awesomeapp.module_3_264.Activity264_17
import com.awesomeapp.module_3_264.Model264_19
import com.awesomeapp.module_3_264.Activity264_20
import com.awesomeapp.module_3_264.Model264_22
import com.awesomeapp.module_3_264.Activity264_23

@Module
@InstallIn(SingletonComponent::class)
object Module_264 {
    @Provides
    @Singleton
    fun provideRepository264_5(
        api0: Api152_6 = Api152_6(),
        api1: Api172_6 = Api172_6()
    ): Repository264_5 {
        return Repository264_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi264_6(): Api264_6 {
        return Api264_6()
    }
}