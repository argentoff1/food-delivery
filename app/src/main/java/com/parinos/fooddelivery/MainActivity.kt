package com.parinos.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.parinos.fooddelivery.databinding.ActivityMainBinding
import com.parinos.fooddelivery.fragments.CartFragment
import com.parinos.fooddelivery.fragments.HomeFragment
import com.parinos.fooddelivery.fragments.ListFragment
import com.parinos.fooddelivery.fragments.ProfileFragment

/**
 * В этом коммите поломалось мэйн активити - урок 7
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navigationView = findNavController(R.id.navigation_fragment)

        bottomNavView.setupWithNavController(navigationView)
    }
}