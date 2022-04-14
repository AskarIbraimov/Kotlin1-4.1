package com.example.kotlin1_41.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_41.BaseFragment
import com.example.kotlin1_41.MainViewModel
import com.example.kotlin1_41.adapters.MyAdapter
import com.example.kotlin1_41.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        liveData.observer.observe(requireActivity()) {
            binding.rvHistory.adapter = MyAdapter(liveData.getHistory())
        }
    }
    override fun bind(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }


}