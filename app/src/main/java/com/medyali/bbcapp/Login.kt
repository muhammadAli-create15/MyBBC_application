package com.medyali.bbcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login =findViewById<Button>(R.id.btnLogin)
        login.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

         val  text=findViewById<TextView>(R.id.textView)
        text.setOnClickListener {
            val i =Intent(this,Account::class.java)
            startActivity(i)
            finish()
        }
    }
}