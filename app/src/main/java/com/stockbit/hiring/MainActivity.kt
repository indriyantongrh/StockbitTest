package com.stockbit.hiring

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration


class MainActivity : AppCompatActivity() {


    private lateinit var callcenter: ImageView
    private lateinit var btnback: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnback = findViewById(R.id.btnback)
        btnback.setOnClickListener({
            Toast.makeText(this, "Klik", Toast.LENGTH_LONG).show()
        })
        callcenter = findViewById(R.id.callcenter)
        callcenter.setOnClickListener({
            Toast.makeText(this, "Klik Button Call Center", Toast.LENGTH_LONG).show()
        })

        val btnLogin = findViewById<CardView>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()

        if (id == R.id.action_one) {
            Toast.makeText(this, "Item One Clicked", Toast.LENGTH_LONG).show()
            return true
        }

        return super.onOptionsItemSelected(item)

    }



}
