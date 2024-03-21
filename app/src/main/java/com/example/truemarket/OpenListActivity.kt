package com.example.truemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OpenListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_list)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}