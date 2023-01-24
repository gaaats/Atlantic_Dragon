package com.bimiboo.number.modela

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.bimiboo.number.apii.ApiInterfaceeeee
import com.bimiboo.number.apii.CountryRepogtgtgtgtgt
import com.bimiboo.number.apii.DevRepogtgtgtgt5
import com.bimiboo.number.apii.HostInterfaceeee
import com.bimiboo.number.viremod.BeamModel
import com.bimiboo.number.viremod.ViMod
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModulefrrffrrf = module {

    single  <HostInterfaceeee> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfaceeee::class.java)
    }

    single <ApiInterfaceeeee> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceeeee::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://atlanticdragon.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepogtgtgtgtgt(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepogtgtgtgt5(get(named("HostInter")))
    }
    single{
        provideGsonfrrfrffrrfrfrfrf()
    }
    single (named("SharedPreferences")) {
        juujjuujuj2uj2(androidApplication())
    }
}

fun juujjuujuj2uj2(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


val hyjuujujujuj2 = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModel(get())
    }
}


fun provideGsonfrrfrffrrfrfrfrf(): Gson {
    return GsonBuilder().create()
}
