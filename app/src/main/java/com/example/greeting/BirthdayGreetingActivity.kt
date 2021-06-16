package com.example.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {

        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)

        val textViewBirthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        textViewBirthdayGreeting.setText("Happy Birthaday\n $name !")
//        textViewBirthdayGreeting.text = "funky"

    }
}