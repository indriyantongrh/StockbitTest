package com.stockbit.hiring

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val actionBar = supportActionBar
//        actionBar!!.title = "Masuk"
//        supportActionBar?.setHomeAsUpIndicator(R.drawable.backicon)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        val btnLogin = findViewById<CardView>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }


        //setContentView(R.layout.activity_main2)
        ///pie-chart.png()
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

//    private fun centerTitle() {
//        val textViews: ArrayList<View> = ArrayList()
//        window.decorView.findViewsWithText(textViews, title, View.FIND_VIEWS_WITH_TEXT)
//        if (textViews.size > 0) {
//            var appCompatTextView: AppCompatTextView? = null
//            if (textViews.size === 1) {
//                appCompatTextView = textViews[0] as AppCompatTextView
//            } else {
//                for (v in textViews) {
//                    if (v.getParent() is Toolbar) {
//                        appCompatTextView = v as AppCompatTextView
//                        break
//                    }
//                }
//            }
//            if (appCompatTextView != null) {
//                val params: ViewGroup.LayoutParams = appCompatTextView.getLayoutParams()
//                params.width = ViewGroup.LayoutParams.MATCH_PARENT
//                appCompatTextView.setLayoutParams(params)
//                appCompatTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER)
//            }
//        }
//    }


}
