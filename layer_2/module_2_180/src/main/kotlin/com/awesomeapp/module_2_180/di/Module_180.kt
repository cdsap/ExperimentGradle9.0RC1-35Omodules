package com.awesomeapp.module_2_180.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_180.Viewmodel180_1
import com.awesomeapp.module_2_180.Activity180_2
import com.awesomeapp.module_2_180.Activity180_3
import com.awesomeapp.module_2_180.Fragment180_4
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_180.Service180_7
import com.awesomeapp.module_2_180.Worker180_8
import com.awesomeapp.module_2_180.Usecase180_9
import com.awesomeapp.module_2_180.Model180_11

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(
        api0: Api124_6 = Api124_6(),
        api1: Api104_6 = Api104_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api76_6 = Api76_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api88_6 = Api88_6(),
        api6: Api108_6 = Api108_6(),
        api7: Api132_6 = Api132_6(),
        api8: Api72_6 = Api72_6()
    ): Repository180_5 {
        return Repository180_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}