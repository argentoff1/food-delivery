package com.parinos.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.parinos.fooddelivery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    changeFragment(HomeFragment())
                }
                R.id.cart -> {
                    changeFragment(CartFragment())
                }
                R.id.search -> {
                    changeFragment(SearchFragment())
                }
                R.id.list -> {
                    changeFragment(ListFragment())
                }
                R.id.profile -> {
                    changeFragment(ProfileFragment())
                }
            }
            return@setOnItemSelectedListener true
        }

    }

    fun changeFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}