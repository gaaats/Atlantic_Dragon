package com.bimiboo.number

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bimiboo.number.viremod.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaaaaaiinnaFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyjoijhyjhyji = context
    }

    private lateinit var hyhyjoijhyjhyji: Context
    lateinit var gtgtgtgtgtgt: String

    val gtgthyhyhyyhhyhyhy by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaaaaaiinna, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtgthyhyhyyhhyhyhy.fbDeeeeeeeee(hyhyjoijhyjhyji)

        gigtjojgtjgtjgtjgt()

    }

    private fun gigtjojgtjgtjgtjgt() {
        gttggtuhugthgthgt()
    }

    private fun gttggtuhugthgthgt() {
        ogigtojgtjgtjgtji()
    }

    private fun ogigtojgtjgtjgtji() {
        findNavController().navigate(R.id.action_maaaaaaiinnaFragment_to_coontrryyrFragment)
    }
}