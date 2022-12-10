package com.bcgroup.sad.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bcgroup.sad.R
import com.bcgroup.sad.databinding.ActivityAccountCreationBinding

class AccountCreationActivity : AppCompatActivity() {
    lateinit var binding : ActivityAccountCreationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountCreationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginAlreadyLoginTv.setOnClickListener {
            binding.signupLayout.visibility = View.VISIBLE
            binding.loginLayout.visibility = View.GONE
        }
        binding.signupAlreadySignupTv.setOnClickListener {
            binding.signupLayout.visibility = View.GONE
            binding.loginLayout.visibility = View.VISIBLE
        }
    }
}