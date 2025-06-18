package com.awesomeapp.module_4_336.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_336.Viewmodel336_1
import com.awesomeapp.module_4_336.Activity336_2
import com.awesomeapp.module_4_336.Activity336_3
import com.awesomeapp.module_4_336.Fragment336_4
import com.awesomeapp.module_4_336.Repository336_5
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_4_336.Api336_6
import com.awesomeapp.module_4_336.Usecase336_7
import com.awesomeapp.module_4_336.Model336_9
import com.awesomeapp.module_4_336.Model336_10
import com.awesomeapp.module_4_336.Activity336_11
import com.awesomeapp.module_4_336.Model336_13
import com.awesomeapp.module_4_336.Activity336_14
import com.awesomeapp.module_4_336.Model336_16
import com.awesomeapp.module_4_336.Activity336_17
import com.awesomeapp.module_4_336.Model336_19
import com.awesomeapp.module_4_336.Activity336_20

@Module
@InstallIn(SingletonComponent::class)
object Module_336 {
    @Provides
    @Singleton
    fun provideRepository336_5(
        api0: Api276_6 = Api276_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api252_6 = Api252_6(),
        api4: Api232_6 = Api232_6(),
        api5: Api228_6 = Api228_6(),
        api6: Api260_6 = Api260_6(),
        api7: Api220_6 = Api220_6(),
        api8: Api224_6 = Api224_6(),
        api9: Api216_6 = Api216_6(),
        api10: Api272_6 = Api272_6(),
        api11: Api268_6 = Api268_6(),
        api12: Api236_6 = Api236_6()
    ): Repository336_5 {
        return Repository336_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12)
    }

    @Provides
    @Singleton
    fun provideApi336_6(): Api336_6 {
        return Api336_6()
    }
}