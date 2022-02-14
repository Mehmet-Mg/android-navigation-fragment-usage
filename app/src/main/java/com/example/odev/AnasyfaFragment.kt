package com.example.odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev.databinding.FragmentAnasyfaBinding


class AnasyfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasyfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasyfaBinding.inflate(inflater, container, false)

        tasarim.buttonA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }

        tasarim.buttonX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }

        return tasarim.root
    }
}