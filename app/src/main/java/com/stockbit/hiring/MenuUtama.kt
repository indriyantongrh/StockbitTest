package com.stockbit.hiring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.stockbit.hiring.baseurl.NetworkConfig
import com.stockbit.hiring.menu.stream
import com.stockbit.hiring.menu.watchlist

class MenuUtama : AppCompatActivity() {

    private val watchlistFragment = watchlist()
    private val streamFragment = stream()

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        replaceFragment(watchlistFragment)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navView = findViewById<NavigationView>(R.id.navView)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        val actionBar = supportActionBar
        actionBar!!.title = "Menu Utama"
        actionBar!!.setLogo(R.drawable.logo)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setLogo(R.drawable.logo)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                 R.id.stream -> Toast.makeText(applicationContext, "Kliddddk", Toast.LENGTH_LONG).show()
            }
            true
        }


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.watchlist -> replaceFragment(watchlistFragment)
                R.id.stream -> replaceFragment(streamFragment)
            }
            true
        }




    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment) {
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}