package com.medyali.bbcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
    val handler= Handler().postDelayed({
    val i= Intent(this, Login::class.java)
     startActivity(i)
     finish()
    },2000

    )
}


