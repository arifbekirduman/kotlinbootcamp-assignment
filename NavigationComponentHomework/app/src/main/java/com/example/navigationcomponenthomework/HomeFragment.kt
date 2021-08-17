package com.example.navigationcomponenthomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.btnNextA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAFragment)
        }

        view.btnNextX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXFragment)
        }

        return view
    }
}