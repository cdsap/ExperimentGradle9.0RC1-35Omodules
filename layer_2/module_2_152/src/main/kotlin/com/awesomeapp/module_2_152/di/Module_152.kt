package com.awesomeapp.module_2_152.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_152.Viewmodel152_1
import com.awesomeapp.module_2_152.Activity152_2
import com.awesomeapp.module_2_152.Activity152_3
import com.awesomeapp.module_2_152.Fragment152_4
import com.awesomeapp.module_2_152.Repository152_5
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_152.Model152_8
import com.awesomeapp.module_2_152.Model152_9
import com.awesomeapp.module_2_152.Activity152_10
import com.awesomeapp.module_2_152.Model152_12
import com.awesomeapp.module_2_152.Activity152_13
import com.awesomeapp.module_2_152.Model152_15
import com.awesomeapp.module_2_152.Activity152_16
import com.awesomeapp.module_2_152.Model152_18
import com.awesomeapp.module_2_152.Activity152_19
import com.awesomeapp.module_2_152.Model152_21
import com.awesomeapp.module_2_152.Activity152_22
import com.awesomeapp.module_2_152.Model152_24
import com.awesomeapp.module_2_152.Activity152_25
import com.awesomeapp.module_2_152.Model152_27
import com.awesomeapp.module_2_152.Activity152_28
import com.awesomeapp.module_2_152.Model152_30
import com.awesomeapp.module_2_152.Activity152_31
import com.awesomeapp.module_2_152.Model152_33
import com.awesomeapp.module_2_152.Activity152_34
import com.awesomeapp.module_2_152.Model152_36
import com.awesomeapp.module_2_152.Activity152_37
import com.awesomeapp.module_2_152.Model152_39
import com.awesomeapp.module_2_152.Activity152_40
import com.awesomeapp.module_2_152.Model152_42
import com.awesomeapp.module_2_152.Activity152_43

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api104_6 = Api104_6(),
        api1: Api112_6 = Api112_6(),
        api2: Api120_6 = Api120_6(),
        api3: Api80_6 = Api80_6(),
        api4: Api140_6 = Api140_6(),
        api5: Api124_6 = Api124_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}