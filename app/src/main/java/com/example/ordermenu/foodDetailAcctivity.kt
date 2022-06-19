package com.example.ordermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class foodDetailAcctivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail_acctivity)

        val food = intent.getParcelableExtra<popularFood>("food")
        if (food != null) {
            val textView: TextView = findViewById(R.id.detailText)
            val imageView: ImageView = findViewById(R.id.detailImage)

            textView.text = food.foodName
            imageView.setImageResource(food.foodImage)




            }
        }

}