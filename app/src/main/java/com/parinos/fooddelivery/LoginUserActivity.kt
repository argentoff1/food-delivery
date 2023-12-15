package com.parinos.fooddelivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.parinos.fooddelivery.databinding.ActivityLoginBinding

class LoginUserActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goSignUpUser.setOnClickListener {
            val intent = Intent(this@LoginUserActivity,
                SignUpUserActivity :: class.java)

            startActivity(intent)
        }

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@LoginUserActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}