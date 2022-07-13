package com.medyali.bbcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val createAccount=findViewById<Button>(R.id.button1)
        createAccount.setOnClickListener {
       Toast.makeText(this,"Account has been created successfully",Toast.LENGTH_LONG).show()
        }
    }
}