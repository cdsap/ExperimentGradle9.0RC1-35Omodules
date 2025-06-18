package com.awesomeapp.module_4_312.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_312.Viewmodel312_1
import com.awesomeapp.module_4_312.Activity312_2
import com.awesomeapp.module_4_312.Activity312_3
import com.awesomeapp.module_4_312.Fragment312_4
import com.awesomeapp.module_4_312.Repository312_5
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_4_312.Api312_6
import com.awesomeapp.module_4_312.Model312_7

@Module
@InstallIn(SingletonComponent::class)
object Module_312 {
    @Provides
    @Singleton
    fun provideRepository312_5(
        api0: Api276_6 = Api276_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api224_6 = Api224_6(),
        api5: Api220_6 = Api220_6()
    ): Repository312_5 {
        return Repository312_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi312_6(): Api312_6 {
        return Api312_6()
    }
}