package ru.netology.netologyvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.netologyvoiceassistant.R

class MainActivity : AppCompatActivity() {
    private val tag: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstName = "Ivan"
        val lastName = "Ivanov"
        val age = 37
        val height = 172.2

        val outputText = "name: $firstName surname: $lastName age: $age height: $height"

        val textView = findViewById<TextView>(R.id.output)
        textView.text = outputText

        Log.d(tag, "end of onCreate function")
    }
}