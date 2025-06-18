package com.awesomeapp.module_4_316.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_316.Viewmodel316_1
import com.awesomeapp.module_4_316.Activity316_2
import com.awesomeapp.module_4_316.Activity316_3
import com.awesomeapp.module_4_316.Fragment316_4
import com.awesomeapp.module_4_316.Repository316_5
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_4_316.Api316_6
import com.awesomeapp.module_4_316.Model316_8
import com.awesomeapp.module_4_316.Model316_9
import com.awesomeapp.module_4_316.Activity316_10
import com.awesomeapp.module_4_316.Model316_12
import com.awesomeapp.module_4_316.Activity316_13
import com.awesomeapp.module_4_316.Model316_15
import com.awesomeapp.module_4_316.Activity316_16
import com.awesomeapp.module_4_316.Model316_18
import com.awesomeapp.module_4_316.Activity316_19
import com.awesomeapp.module_4_316.Model316_21
import com.awesomeapp.module_4_316.Activity316_22
import com.awesomeapp.module_4_316.Model316_24
import com.awesomeapp.module_4_316.Activity316_25

@Module
@InstallIn(SingletonComponent::class)
object Module_316 {
    @Provides
    @Singleton
    fun provideRepository316_5(
        api0: Api236_6 = Api236_6(),
        api1: Api256_6 = Api256_6(),
        api2: Api232_6 = Api232_6(),
        api3: Api248_6 = Api248_6(),
        api4: Api240_6 = Api240_6()
    ): Repository316_5 {
        return Repository316_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi316_6(): Api316_6 {
        return Api316_6()
    }
}