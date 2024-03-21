package com.example.truemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            println("BUTTON CLICKED!!!!")
            finish()
        }
    }
}