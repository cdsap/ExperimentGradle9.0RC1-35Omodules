package com.awesomeapp.module_3_224.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_224.Viewmodel224_1
import com.awesomeapp.module_3_224.Activity224_2
import com.awesomeapp.module_3_224.Activity224_3
import com.awesomeapp.module_3_224.Fragment224_4
import com.awesomeapp.module_3_224.Repository224_5
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_224.Model224_8
import com.awesomeapp.module_3_224.Model224_9
import com.awesomeapp.module_3_224.Activity224_10
import com.awesomeapp.module_3_224.Model224_12
import com.awesomeapp.module_3_224.Activity224_13
import com.awesomeapp.module_3_224.Model224_15
import com.awesomeapp.module_3_224.Activity224_16
import com.awesomeapp.module_3_224.Model224_18
import com.awesomeapp.module_3_224.Activity224_19
import com.awesomeapp.module_3_224.Model224_21
import com.awesomeapp.module_3_224.Activity224_22
import com.awesomeapp.module_3_224.Model224_24
import com.awesomeapp.module_3_224.Activity224_25
import com.awesomeapp.module_3_224.Model224_27
import com.awesomeapp.module_3_224.Activity224_28

@Module
@InstallIn(SingletonComponent::class)
object Module_224 {
    @Provides
    @Singleton
    fun provideRepository224_5(): Repository224_5 {
        return Repository224_5()
    }

    @Provides
    @Singleton
    fun provideApi224_6(): Api224_6 {
        return Api224_6()
    }
}