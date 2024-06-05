package com.ihsanfrr.utb_students

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var linearLMButton: Button
    private lateinit var gridLMButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        linearLMButton = findViewById(R.id.linearLM)
        gridLMButton = findViewById(R.id.gridLM)

        linearLMButton.setOnClickListener {
            navigateTo(true);
        }

        gridLMButton.setOnClickListener {
            navigateTo(false);
        }
    }

    private fun navigateTo(toLinear: Boolean) {
        if (toLinear) {
            startActivity(Intent(this, LinearLayoutManagerActivity::class.java))
        } else {
            startActivity(Intent(this, GridLayoutManagerActivity::class.java))
        }
    }
}