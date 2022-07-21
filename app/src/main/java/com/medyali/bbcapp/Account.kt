package com.medyali.bbcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Account : AppCompatActivity() {
    // private EditText username,email,password,password1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        //  checkCredentials();


        var username = findViewById<EditText>(R.id.edtUsername)
        var email = findViewById<EditText>(R.id.edtEmail)
        var password = findViewById<EditText>(R.id.editPassword)
        val confirmPassword = findViewById<EditText>(R.id.editPassword1)

        checkCredentials();
        val createAccount = findViewById<Button>(R.id.button1)
        createAccount.setOnClickListener {
            Toast.makeText(this, "Account has been created successfully", Toast.LENGTH_LONG).show()
        }
    }

    private fun checkCredentials() {


    }
}







