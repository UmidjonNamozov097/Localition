package com.example.localition.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.localition.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initViews() {
        var b_open = findViewById<Button>(R.id.b_open)
        b_open.text = getString(R.string.app_name)
        b_open.setOnClickListener {
            callLanguageActivity()
        }
    }

    fun callLanguageActivity() {
        val intent = Intent(this, LanguageActivity::class.java)
        startActivity(intent)
    }
}