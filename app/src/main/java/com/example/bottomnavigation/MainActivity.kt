package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        val navigationFragment = findNavController(R.id.nav_host_fragment_container)
        val appBarConfiguration= AppBarConfiguration(setOf(R.id.homeFragment,R.id.profileFragment,R.id.rankingFragment))
        setupActionBarWithNavController(navigationFragment,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navigationFragment)
    }
}