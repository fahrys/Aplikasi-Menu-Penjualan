package com.example.latihanku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    private lateinit var actionBar : ActionBarDrawerToggle
    private lateinit var navDrawerView : NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this , "Welcome", Toast.LENGTH_SHORT).show()

        drawerLayout = findViewById(R.id.activitymain)
        actionBar = ActionBarDrawerToggle(this, drawerLayout, 0, 0)
        drawerLayout.addDrawerListener(actionBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar.syncState()
        navDrawerView = findViewById(R.id.navDrawer)

        navDrawerView.setNavigationItemSelectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.profile -> {
                    Toast.makeText(
                        this, "Go To My Profile",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }
                R.id.menu -> {
                    val intent = Intent(applicationContext, Makanan::class.java)
                    startActivity(intent)
                    true
                }
                else -> {
                    false
                }
            }
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START) // Close drawable
        } else {
            this.drawerLayout.openDrawer(GravityCompat.START) // Open drawer
        }
        return true
    }
}