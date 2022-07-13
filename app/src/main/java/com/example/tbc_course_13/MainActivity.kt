package com.example.tbc_course_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tbc_course_13.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.bottomNavigation.selectedItemId = R.id.fragmentFifth
    }
}


