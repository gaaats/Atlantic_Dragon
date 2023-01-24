package com.bimiboo.number

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bimiboo.number.viremod.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CoontrryyrFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hkyhokyhyhkhy.countryCodefrfrrfrffr6.observe(viewLifecycleOwner) {
            if (it!=null) {
                hjhyyhjjyhhyji = it.cougtgtgtgt
                gtgtgtgtgttggtgt.edit().putString("country", hjhyyhjjyhhyji).apply()
                gtkgtoijtgijtgjgtjgtgtijgt()
            }
        }
    }

    private fun gtkgtoijtgijtgjgtjgtgtijgt() {
        hyijyjhjhyhyjhyji()
    }

    private fun hyijyjhjhyhyjhyji() {
        gtgthtgtgtitghgth()
    }

    private fun gtgthtgtgtitghgth() {
        tgjtgjgtjtgjgtjjgti()
    }

    private fun tgjtgjgtjtgjgtjjgti() {
        findNavController().navigate(R.id.action_coontrryyrFragment_to_seeecMainnnFragment)
    }

    private lateinit var mContextfrfrrfrfrf: Context


    val gtgtgtgtgttggtgt: SharedPreferences by inject(named("SharedPreferences"))
    val hkyhokyhyhkhy by activityViewModel<ViMod>(named("MainModel"))

    lateinit var hjhyyhjjyhhyji: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_coontrryyr, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextfrfrrfrfrf = context
    }
}