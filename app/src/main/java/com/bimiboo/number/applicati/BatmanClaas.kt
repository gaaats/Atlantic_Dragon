package com.bimiboo.number.applicati

import android.app.Application
import android.content.Context
import com.bimiboo.number.modela.appModulefrrffrrf
import com.bimiboo.number.modela.hyjuujujujuj2
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class BatmanClaas:Application() {

    companion object {
        const val apppppppps = "UQEFikkSvk6huTC7izprTm"
        const val traaaaacker = "46929900317133451072"
        var aps_idddddd: String? = "main_id"
        var instIdfrfrf: String? = "instID"
        const val ONESIGNAL_APP_IDrrffrrf = "71bd7159-e38b-4869-b296-bdbae01894a6"
        const val paaaaaaackhyhyhyhy = "com.bimiboo.number"



    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDrrffrrf)

        val frrfrfrffrrf = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingssssssss = getSharedPreferences("PREFS_NAME", 0)

        val trackerConfigfrfrfrffr = MyTracker.getTrackerConfig()

        val instIDsdddd = MyTracker.getInstanceId(this)
        trackerConfigfrfrfrffr.isTrackingLaunchEnabled = true


        if (settingssssssss.getBoolean("my_first_time", true)) {

            frrfrfrffrrf.edit().putString(instIdfrfrf, instIDsdddd).apply()
            settingssssssss.edit().putBoolean("my_first_time", false).apply()
        } else {

        }
        MyTracker.initTracker(traaaaacker, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@BatmanClaas)
            modules(
                listOf(
                    hyjuujujujuj2, appModulefrrffrrf
                )
            )
        }
    }
}