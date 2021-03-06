package com.example.kotlin1_41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1_41.adapters.PagerAdapter
import com.example.kotlin1_41.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainPager.adapter = PagerAdapter(this)
    }
}