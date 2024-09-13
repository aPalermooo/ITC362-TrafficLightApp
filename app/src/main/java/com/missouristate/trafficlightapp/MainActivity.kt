package com.missouristate.trafficlightapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.missouristate.trafficlightapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //BINDING SET UP
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}