package com.example.ordermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AsianFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asian_food)

        val food = intent.getParcelableExtra<Asia>("food")
        if(food != null){

            val textView: TextView = findViewById(R.id.detailTextAsia)
            val imageView: ImageView = findViewById(R.id.detailAsiaImage)

            textView.text = food.foodName
            imageView.setImageResource(food.foodImage)

        }
    }
}