package com.parinos.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parinos.fooddelivery.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goLoginUserPage.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LoginUserActivity::class.java)
            startActivity(intent)
        }

        binding.createAccountBtn.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LocationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}