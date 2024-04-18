package com.example.hm_1_month7

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.hm_1_month7.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }
   private lateinit var tabLayout: TabLayout
   private lateinit var viewPager2: ViewPager2
   private lateinit var adapterTab: AdapterViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tabLayout=binding.tabL
        viewPager2=binding.pager
        adapterTab= AdapterViewPager(this)
        viewPager2.adapter=adapterTab

        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when (position) {
                0 -> tab.text = "Камеры"
                1 -> tab.text = "Двери"
            }
        }.attach()
    }
}