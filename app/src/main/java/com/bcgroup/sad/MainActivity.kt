package com.bcgroup.sad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bcgroup.sad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i = 10
        var s = "Shakil"
    }
}