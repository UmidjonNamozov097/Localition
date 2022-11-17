package com.example.localition.activity

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.localition.R
import java.util.Locale

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initView()
    }

    fun initView() {
        var b_english = findViewById<Button>(R.id.b_english)
        var b_russian = findViewById<Button>(R.id.b_russian)
        var b_uzbek = findViewById<Button>(R.id.b_uzb)
        b_english.setOnClickListener() {
            setLocale("en")
        }
        b_russian.setOnClickListener() {
            setLocale("ru")
        }
        b_uzbek.setOnClickListener() {
            setLocale("uz")
        }
    }

    fun setLocale(lan: String) {
        val locale = Locale(lan)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        finish()
    }
}