package com.bimiboo.number


import androidx.navigation.fragment.findNavController
import com.bimiboo.number.viremod.ViMod
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class BeeffooFillFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beeffoo_fill, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        h2ju5uj5juj = context
    }

    val hyjujuujuj by activityViewModel<ViMod>(named("MainModel"))
    val hyhhyhyhyhy: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var hy2juu5ju5uj: String
    private lateinit var h2ju5uj5juj: Context


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gtgt2gt2g = hyhhyhyhyhy.getString("apps", null)
        val hy2hyhy2hy5hy5hy = hyhhyhyhyhy.getString("appCamp", null)

        if (gtgt2gt2g=="1" &&hy2hyhy2hy5hy5hy == null) {
            hyjujuujuj.converssssssss(h2ju5uj5juj)
            hyjujuujuj.appsDatagtgt65tggt.observe(viewLifecycleOwner) {

                if (it != null) {

                    hy2juu5ju5uj = it.toString()
                    hyhhyhyhyhy.edit().putString("appCamp", hy2juu5ju5uj).apply()
                    gtjigtjigtijgtjitgjjgt()
                }
            }
        } else {
            gtjigtjigtijgtjitgjjgt()
        }
    }

    private fun gtjigtjigtijgtjitgjjgt() {
        tjggtjgtjjtgjtgigtjitgji()
    }

    private fun tjggtjgtjjtgjtgigtjitgji() {
        gtigtjtgjjgtjgtj()
    }

    private fun gtigtjtgjjgtjgtj() {
        tgjtgjgtjgtjgtji()
    }

    private fun tgjtgjgtjgtjgtji() {
        findNavController().navigate(R.id.action_beeffooFillFragment_to_filllyFragment)
    }

}