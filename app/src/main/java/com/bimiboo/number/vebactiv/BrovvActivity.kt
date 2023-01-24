package com.bimiboo.number.vebactiv

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.bimiboo.number.applicati.BatmanClaas
import com.bimiboo.number.applicati.BatmanClaas.Companion.aps_idddddd
import com.bimiboo.number.databinding.ActivityBrovvBinding
import com.bimiboo.number.viremod.BeamModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class BrovvActivity : AppCompatActivity() {


    inner class ChromeClient : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            arrayValueCallback?.onReceiveValue(null)
            arrayValueCallback = filePath
            var gtgtgttggt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gtgtgttggt!!.resolveActivity(packageManager) != null) {
                var jujuj5uj: File? = null
                try {
                    jujuj5uj = hnh1nh5hnj4j4()
                    gtgtgttggt.putExtra("PhotoPath", ggtgtgtgtgttg)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (jujuj5uj != null) {
                    ggtgtgtgtgttg = "file:" + jujuj5uj.absolutePath
                    gtgtgttggt.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(jujuj5uj)
                    )
                } else {
                    gtgtgttggt = null
                }
            }
            val hyyh5hy5hy5hy5yhhy = Intent(Intent.ACTION_GET_CONTENT)
            hyyh5hy5hy5hy5yhhy.addCategory(Intent.CATEGORY_OPENABLE)
            hyyh5hy5hy5hy5yhhy.type = "image/*"
            val nh1j5uju1ki1ikikik: Array<Intent?> = gtgtgttggt?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val vfv22vfvf5vf = Intent(Intent.ACTION_CHOOSER)
            vfv22vfvf5vf.putExtra(Intent.EXTRA_INTENT, hyyh5hy5hy5hy5yhhy)
            vfv22vfvf5vf.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            vfv22vfvf5vf.putExtra(Intent.EXTRA_INITIAL_INTENTS, nh1j5uju1ki1ikikik)
            startActivityForResult(vfv22vfvf5vf, gtjiogtjoiggtjjgt)
            return true
        }

        fun hnh1nh5hnj4j4(): File? {
            val bgnhnhnhhnnhnh3 = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val bgnhnhnhn3h = "JPEG_" + bgnhnhnhhnnhnh3 + "_"
            val bgbn2hnyj1u1jui5 = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                bgnhnhnhn3h,
                ".jpg",
                bgbn2hnyj1u1jui5
            )
        }
    }

    val tttt = "gtgtgtgt"

    private lateinit var activityBrovvvvsaaaaBinding: ActivityBrovvBinding
    lateinit var webViewfrrfrfrf: WebView

    private val frokrfko by viewModel<BeamModel>(
        named("BeamModel")
    )

    private var arrayValueCallback: ValueCallback<Array<Uri>>? = null
    private var ggtgtgtgtgttg: String? = null
    private val gtjiogtjoiggtjjgt = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != gtjiogtjoiggtjjgt || arrayValueCallback == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hyjuujujujuj2uj2uj: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (ggtgtgtgtgttg != null) {
                    hyjuujujujuj2uj2uj = arrayOf(Uri.parse(ggtgtgtgtgttg))
                }
            } else {
                val bgb25yy5y5y5 = data.dataString
                if (bgb25yy5y5y5 != null) {
                    hyjuujujujuj2uj2uj = arrayOf(Uri.parse(bgb25yy5y5y5))
                }
            }
        }
        arrayValueCallback!!.onReceiveValue(hyjuujujujuj2uj2uj)
        arrayValueCallback = null
        return
    }


    inner class CustomView: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (frokrfko.hyhyjyjhijyhihyjhy(url)) {

                    val bghyhyyhyhhyyh5hy5 = Intent(Intent.ACTION_VIEW)
                    bghyhyyhyhhyyh5hy5.data = Uri.parse(url)
                    startActivity(bghyhyyhyhhyyh5hy5)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            bhy2hy2hyhyhy(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@BrovvActivity, description, Toast.LENGTH_SHORT).show()
        }
    }

    fun bhy2hy2hyhyhy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val hy2hy5hy5yh5yh = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val gttggttgtg = hy2hy5hy5yh5yh.edit()
                gttggttgtg.putString("SAVED_URL", lurlurlurlurlur)
                gttggttgtg.apply()
            }
        }
    }

    override fun onBackPressed() {

        if (webViewfrrfrfrf.canGoBack()) {
            if (exitexitexitexit) {
                webViewfrrfrfrf.stopLoading()
                webViewfrrfrfrf.loadUrl(urlfififif)
            }
            this.exitexitexitexit = true
            webViewfrrfrfrf.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                exitexitexitexit = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBrovvvvsaaaaBinding = ActivityBrovvBinding.inflate(layoutInflater)
        webViewfrrfrfrf = WebView(this)
        setContentView(webViewfrrfrfrf)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewfrrfrfrf, true)
        frokrfko.webSetfrrffrrfrfrf(webViewfrrfrfrf)

        webViewfrrfrfrf.webViewClient = CustomView()
        webViewfrrfrfrf.webChromeClient = ChromeClient()
        webViewfrrfrfrf.loadUrl(nvfbfdedfedfsddrsdrsdds())
    }

    private fun nvfbfdedfedfsddrsdrsdds(): String {

        val gt5gt5gtgttg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val gtgt5gt5gt5 = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val linkaaaaa = gtgt5gt5gt5.getString("link", null)
        val myTrIdaaaaaa = gtgt5gt5gt5.getString(BatmanClaas.instIdfrfrf, null)
        val afIdaaaaaaa = gtgt5gt5gt5.getString(aps_idddddd, null)

        val interdaaaaaaaa = gtgt5gt5gt5.getString("WebInt", null)


        when (interdaaaaaaaa) {
            "campaign" -> {
                Log.d("lolo", "campaign , ${afIdaaaaaaa.toString()}")
                frokrfko.gtgtigtjijgtjgtgtigti(afIdaaaaaaa.toString())
            }
            "deepLink" -> {
                Log.d("lolo", "deepLink , ${afIdaaaaaaa.toString()}")

                frokrfko.gtgtigtjijgtjgtgtigti(afIdaaaaaaa.toString())
            }
            "deepLinkNOApps" -> {
                Log.d("lolo", "deepLinkNOApps , ${myTrIdaaaaaa.toString()}")

                frokrfko.gtgtigtjijgtjgtgtigti(myTrIdaaaaaa.toString())
            }
            "geo" -> {
                Log.d("lolo", "geo , ${myTrIdaaaaaa.toString()}")

                frokrfko.gtgtigtjijgtjgtgtigti(myTrIdaaaaaa.toString())
            }

        }
        Log.d("lolo", "link is ${linkaaaaa}")
        return gt5gt5gtgttg.getString("SAVED_URL", linkaaaaa).toString()
    }

    var urlfififif = ""

    private var exitexitexitexit = false

}

