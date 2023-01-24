package com.bimiboo.number.viremod

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.bimiboo.number.apii.CountryCodeJSgt2gtgtgtgt
import com.bimiboo.number.apii.CountryRepogtgtgtgtgt
import com.bimiboo.number.apii.DevRepogtgtgtgt5
import com.bimiboo.number.apii.GeoDevgtgtt6ggt
import com.bimiboo.number.applicati.BatmanClaas.Companion.apppppppps
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val mainRepository: CountryRepogtgtgtgtgt,
    private val devRepo: DevRepogtgtgtgt5,
    private val shP: SharedPreferences,
    val application: Application
) : ViewModel() {


    private val gtgtggt = MutableLiveData<GeoDevgtgtt6ggt>()
    val ggtgtgtgtthyhy: LiveData<GeoDevgtgtt6ggt>
        get() = gtgtggt


    private val _appsDataaaaaaa56d56 = MutableLiveData<String>()
    val appsDatagtgt65tggt: LiveData<String>
        get() = _appsDataaaaaaa56d56

    private val _deepSfrrf56fr5fr5 = MutableLiveData<String>()
    val deepS: LiveData<String>
        get() = _deepSfrrf56fr5fr5

    suspend fun getDataaaaaaaa() {
        val ressss = mainRepository.gtgt2gtgt5tg().body()!!
        fr5rf5rf5.postValue(ressss)
        getDevDataaaaaaaaaa()
    }

    suspend fun getDevDataaaaaaaaaa() {
        val ressss = devRepo.g2gt5tg5tg5().body()
        gtgtggt.postValue(ressss!!)
    }



    private val gttggt5gt5tg = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val data: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = gttggt5gt5tg


    private val fr5rf5rf5 = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val countryCodefrfrrfrffr6: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = fr5rf5rf5


    private val _mainIddededdeeded = MutableLiveData<String?>()
    val frrfrffrfrrf: LiveData<String?>
        get() = _mainIddededdeeded


    fun converssssssss(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apppppppps, gtjtgigtjgtjgtjijgtijgtjig, application)
        AppsFlyerLib.getInstance().start(cont)
    }


    fun gtjjgtgtjjgtijgtjigt() {
        val vbghgthgthhgt = AdvertisingIdClient(application)
        vbghgthgthhgt.start()
        val gjjgtijigtjjgtjgt = vbghgthgthhgt.info.id.toString()
        _mainIddededdeeded.postValue(gjjgtijigtjjgtjgt)
    }

    fun fbDeeeeeeeee(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepDataaaaaaaaa = data.targetUri?.host.toString()
                shP.edit().putString("deepSt", deepDataaaaaaaaa).apply()
            }
        }
    }

    private val gtjtgigtjgtjgtjijgtijgtjig = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val ggtgtgtgtgt = data?.get("campaign").toString()
            _appsDataaaaaaa56d56.postValue(ggtgtgtgtgt)

            val hyhjuujjujuju = Bundle()

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }



    init {
        viewModelScope.launch(Dispatchers.IO) {
            gtjjgtgtjjgtijgtjigt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getDataaaaaaaa()
        }
    }

}

