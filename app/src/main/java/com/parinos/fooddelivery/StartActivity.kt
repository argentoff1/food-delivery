package com.parinos.fooddelivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.parinos.fooddelivery.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goUserLoginBtn.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginUserActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}