package com.example.navigationcomponenthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sayfa_b.view.*


class SayfaBFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sayfa_b, container, false)

        view.btnNextYFragmentB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaBFragment_to_sayfaYFragment)
        }

        return view
    }

}