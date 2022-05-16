package com.example.soccerquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.TaskStackBuilder
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.soccerquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var draverLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        //Navigation drawer
        draverLayout = binding.drawerLayout

        //setup Navigation with Back arrow and drawerlLayout
        val navController = this.findNavController(R.id.appNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController, draverLayout)

        NavigationUI.setupWithNavController(binding.navigationView, navController)


    }

    //setup Navigation with Back arrow
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.appNavHostFragment)
        return NavigationUI.navigateUp(navController, draverLayout)
        // return navController.navigateUp() - without drawer
    }
}