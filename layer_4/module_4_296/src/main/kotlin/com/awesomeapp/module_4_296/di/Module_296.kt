package com.awesomeapp.module_4_296.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_296.Viewmodel296_1
import com.awesomeapp.module_4_296.Activity296_2
import com.awesomeapp.module_4_296.Activity296_3
import com.awesomeapp.module_4_296.Fragment296_4
import com.awesomeapp.module_4_296.Repository296_5
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_4_296.Api296_6
import com.awesomeapp.module_4_296.Model296_8
import com.awesomeapp.module_4_296.Model296_9
import com.awesomeapp.module_4_296.Activity296_10
import com.awesomeapp.module_4_296.Model296_12
import com.awesomeapp.module_4_296.Activity296_13
import com.awesomeapp.module_4_296.Model296_15
import com.awesomeapp.module_4_296.Activity296_16

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api244_6 = Api244_6(),
        api1: Api260_6 = Api260_6(),
        api2: Api268_6 = Api268_6(),
        api3: Api276_6 = Api276_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api272_6 = Api272_6(),
        api6: Api216_6 = Api216_6(),
        api7: Api228_6 = Api228_6(),
        api8: Api220_6 = Api220_6(),
        api9: Api236_6 = Api236_6(),
        api10: Api252_6 = Api252_6(),
        api11: Api248_6 = Api248_6(),
        api12: Api232_6 = Api232_6(),
        api13: Api212_6 = Api212_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
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
        api12, 
        api13)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}