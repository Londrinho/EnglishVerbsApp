package com.jimmy.englishproverbsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.jimmy.englishproverbsapp.databinding.ActivityMainBinding

//This class creates a binding object, inflates a
// layout as well as implementing a back
// button, overflow menu and navigation drawer
class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayouyt: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayouyt = binding.drawerLayout

        val navController = this.findNavController(R.id.myHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayouyt)
        NavigationUI.setupWithNavController(binding.navView, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayouyt, )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.myHostFragment)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }



}