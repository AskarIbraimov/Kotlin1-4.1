package com.example.kotlin1_41.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_41.BaseFragment
import com.example.kotlin1_41.MainViewModel
import com.example.kotlin1_41.R
import com.example.kotlin1_41.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonActions()
    }

    private fun buttonActions() {
        binding.btnPlus.setOnClickListener {
            liveData.plusCounter()
        }
        binding.btnMinus.setOnClickListener {
            liveData.minusCounter()
        }
    }

    override fun bind(): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
}