package com.awesomeapp.module_2_144.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_144.Viewmodel144_1
import com.awesomeapp.module_2_144.Activity144_2
import com.awesomeapp.module_2_144.Activity144_3
import com.awesomeapp.module_2_144.Fragment144_4
import com.awesomeapp.module_2_144.Repository144_5
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_144.Usecase144_7
import com.awesomeapp.module_2_144.Model144_9
import com.awesomeapp.module_2_144.Model144_10
import com.awesomeapp.module_2_144.Activity144_11
import com.awesomeapp.module_2_144.Model144_13
import com.awesomeapp.module_2_144.Activity144_14
import com.awesomeapp.module_2_144.Model144_16
import com.awesomeapp.module_2_144.Activity144_17
import com.awesomeapp.module_2_144.Model144_19
import com.awesomeapp.module_2_144.Activity144_20
import com.awesomeapp.module_2_144.Model144_22
import com.awesomeapp.module_2_144.Activity144_23
import com.awesomeapp.module_2_144.Model144_25
import com.awesomeapp.module_2_144.Activity144_26
import com.awesomeapp.module_2_144.Model144_28
import com.awesomeapp.module_2_144.Activity144_29
import com.awesomeapp.module_2_144.Model144_31
import com.awesomeapp.module_2_144.Activity144_32
import com.awesomeapp.module_2_144.Model144_34
import com.awesomeapp.module_2_144.Activity144_35
import com.awesomeapp.module_2_144.Model144_37
import com.awesomeapp.module_2_144.Activity144_38
import com.awesomeapp.module_2_144.Model144_40
import com.awesomeapp.module_2_144.Activity144_41
import com.awesomeapp.module_2_144.Model144_43
import com.awesomeapp.module_2_144.Activity144_44
import com.awesomeapp.module_2_144.Model144_46
import com.awesomeapp.module_2_144.Activity144_47

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api124_6 = Api124_6(),
        api1: Api136_6 = Api136_6(),
        api2: Api76_6 = Api76_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api100_6 = Api100_6(),
        api5: Api132_6 = Api132_6(),
        api6: Api140_6 = Api140_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}