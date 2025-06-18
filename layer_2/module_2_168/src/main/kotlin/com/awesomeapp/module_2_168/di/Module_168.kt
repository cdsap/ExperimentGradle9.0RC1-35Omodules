package com.awesomeapp.module_2_168.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_168.Viewmodel168_1
import com.awesomeapp.module_2_168.Activity168_2
import com.awesomeapp.module_2_168.Activity168_3
import com.awesomeapp.module_2_168.Fragment168_4
import com.awesomeapp.module_2_168.Repository168_5
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_168.Usecase168_7
import com.awesomeapp.module_2_168.Model168_9
import com.awesomeapp.module_2_168.Model168_10
import com.awesomeapp.module_2_168.Activity168_11
import com.awesomeapp.module_2_168.Model168_13
import com.awesomeapp.module_2_168.Activity168_14
import com.awesomeapp.module_2_168.Model168_16
import com.awesomeapp.module_2_168.Activity168_17
import com.awesomeapp.module_2_168.Model168_19
import com.awesomeapp.module_2_168.Activity168_20
import com.awesomeapp.module_2_168.Model168_22
import com.awesomeapp.module_2_168.Activity168_23
import com.awesomeapp.module_2_168.Model168_25
import com.awesomeapp.module_2_168.Activity168_26
import com.awesomeapp.module_2_168.Model168_28
import com.awesomeapp.module_2_168.Activity168_29
import com.awesomeapp.module_2_168.Model168_31
import com.awesomeapp.module_2_168.Activity168_32
import com.awesomeapp.module_2_168.Model168_34
import com.awesomeapp.module_2_168.Activity168_35
import com.awesomeapp.module_2_168.Model168_37
import com.awesomeapp.module_2_168.Activity168_38
import com.awesomeapp.module_2_168.Model168_40

@Module
@InstallIn(SingletonComponent::class)
object Module_168 {
    @Provides
    @Singleton
    fun provideRepository168_5(
        api0: Api76_6 = Api76_6()
    ): Repository168_5 {
        return Repository168_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi168_6(): Api168_6 {
        return Api168_6()
    }
}