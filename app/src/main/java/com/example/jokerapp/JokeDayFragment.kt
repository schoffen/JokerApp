package com.example.jokerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jokerapp.databinding.FragmentJokeDayBinding

class JokeDayFragment : Fragment() {

    private lateinit var binding: FragmentJokeDayBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJokeDayBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}