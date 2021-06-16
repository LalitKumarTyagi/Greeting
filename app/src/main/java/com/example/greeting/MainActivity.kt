package com.example.greeting

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()


//        Toast.makeText(this, "name os $name", Toast.LENGTH_LONG).show()


        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)

        startActivity(intent)
    }
}