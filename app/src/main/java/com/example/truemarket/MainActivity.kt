package com.example.truemarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cards = loadCards()
        for (card in cards) {
            openCard(card)
        }

        val buyButtons = loadBuyButtons()
        for (button in buyButtons) {
            buyButton(button)
        }

        val productsList = findViewById<ImageView>(R.id.productsList)
        productsList.setOnClickListener {
            val intent = Intent(this, ProductsListActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openCard(card: LinearLayout) {
        card.setOnClickListener {
            val intent = Intent(this, CardViewActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buyButton(button: Button) {
        button.setOnClickListener {
            Toast.makeText(this, "Товар добавлен в список покупок", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadCards(): ArrayList<LinearLayout> {
        val cards = ArrayList<LinearLayout>()
        cards.add(findViewById(R.id.card1))
        cards.add(findViewById(R.id.card2))
        cards.add(findViewById(R.id.card3))
        cards.add(findViewById(R.id.card4))
        return cards
    }

    private fun loadBuyButtons(): ArrayList<Button> {
        val cards = ArrayList<Button>()
        cards.add(findViewById(R.id.buy1))
        cards.add(findViewById(R.id.buy2))
        cards.add(findViewById(R.id.buy3))
        cards.add(findViewById(R.id.buy4))
        return cards
    }
}