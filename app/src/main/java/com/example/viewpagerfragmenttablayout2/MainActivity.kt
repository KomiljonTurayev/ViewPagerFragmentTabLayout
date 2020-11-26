package com.example.viewpagerfragmenttablayout2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.viewpagerfragmenttablayout2.fragments.FavouritesFragment
import com.example.viewpagerfragmenttablayout2.fragments.HomeFragment
import com.example.viewpagerfragmenttablayout2.fragments.SettingsFragment
import com.example.viewpagerfragmenttablayout2.fragments.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()

    }

    private fun setUpTabs() {

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavouritesFragment(), "Favourites")
        adapter.addFragment(SettingsFragment(), "Settings")

        val viewPager:ViewPager = findViewById(R.id.viewPager)
        var tabLayout:TabLayout = findViewById(R.id.tabLayout)

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)




    }
}