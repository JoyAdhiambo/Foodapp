package com.example.ordermenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class IntroductoryActivity : AppCompatActivity() {
    private lateinit var  logo: ImageView
    private lateinit var  appName: ImageView
    private lateinit var  lottie: ImageView
    private lateinit var image  : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        logo = findViewById(R.id.logo)
        appName = findViewById(R.id.appName)
        lottie = findViewById(R.id.lottie)
      image= findViewById(R.id.image)


       /* logo.alpha = 0f
        image.alpha = 0f
        appName.alpha = 0f
        lottie.alpha = 0f*/

        image.animate().translationY(-1600f).setDuration(2000).setStartDelay(4000)
        logo.animate().translationY(1400f).setDuration(2000).setStartDelay(4000)
        appName.animate().translationY(1400f).setDuration(2000).setStartDelay(4000)
        lottie.animate().translationY(1400f).setDuration(2000).setStartDelay(4000).withEndAction{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}