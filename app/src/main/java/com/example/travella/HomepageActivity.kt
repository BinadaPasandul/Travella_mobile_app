package com.example.travella

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.homepage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main58)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val addjournal: Button = findViewById(R.id.btnCreate)
        addjournal.setOnClickListener {
            val intent = Intent(this, AddjournalActivity::class.java)
            startActivity(intent)
        }


        val imgDestination1: ImageView = findViewById(R.id.imgDestination1)
        imgDestination1.setOnClickListener {
            val intent = Intent(this, PhiliphinesActivity::class.java)
            startActivity(intent)
        }

        val imgDestination2: ImageView = findViewById(R.id.imgDestination2)
        imgDestination2.setOnClickListener {
            val intent = Intent(this, RuwanwelisayaActivity::class.java)
            startActivity(intent)
        }

        val imgDestination4: ImageView = findViewById(R.id.imgDestination4)
        imgDestination4.setOnClickListener {
            val intent = Intent(this, BalipageActivity::class.java)
            startActivity(intent)
        }



        val profile1: ImageView = findViewById(R.id.homeprof)
        profile1.setOnClickListener {
            val intent = Intent(this, NewprofileActivity::class.java)
            startActivity(intent)
        }


        val navNotifi: ImageView = findViewById(R.id.notifi)
        navNotifi.setOnClickListener {
            val intent = Intent(this, NewhomeActivity::class.java)
            startActivity(intent)
        }
        val navadd: ImageView = findViewById(R.id.account)
        navadd.setOnClickListener {
            val intent = Intent(this, AddjournalActivity::class.java)
            startActivity(intent)
        }

        val navactivity: ImageView = findViewById(R.id.navProfile)
        navactivity.setOnClickListener {
            val intent = Intent(this, NewprofileActivity::class.java)
            startActivity(intent)
        }




    }
}
