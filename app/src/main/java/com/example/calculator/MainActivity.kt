package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var display = findViewById(R.id.display1) as TextView
        val B15 = findViewById(R.id.B15) as Button
        val B14 = findViewById(R.id.B14) as Button
        val B13 = findViewById(R.id.B13) as Button
        val B12 = findViewById(R.id.B12) as Button
        val B11 = findViewById(R.id.B11) as Button
        val B10 = findViewById(R.id.B10) as Button
        val B9 = findViewById(R.id.B9) as Button
        val B8 = findViewById(R.id.B8) as Button
        val B7 = findViewById(R.id.B7) as Button
        val B6 = findViewById(R.id.B6) as Button
        val B5 = findViewById(R.id.B5) as Button
        val B4 = findViewById(R.id.B4) as Button
        val B3 = findViewById(R.id.B3) as Button
        val B2 = findViewById(R.id.B2) as Button
        val B1 = findViewById(R.id.B1) as Button

        B15.setOnClickListener {
            display.text = "/"
        }

        B14.setOnClickListener {
            display.text = "*"
        }

        B13.setOnClickListener {
            display.text = "-"
        }

        B12.setOnClickListener {
            display.text = "+"
        }

        B11.setOnClickListener {
            display.text = "="
        }

        B10.setOnClickListener {
            display.text = "0"
        }

        B9.setOnClickListener {
            display.text = "1"
        }
        B8.setOnClickListener {
            display.text = "2"
        }

        B7.setOnClickListener {
            display.text = "3"
        }
        B6.setOnClickListener {
            display.text = "4"
        }
        B5.setOnClickListener {
            display.text = "5"
        }
        B4.setOnClickListener {
            display.text = "6"
        }
        B3.setOnClickListener {
            display.text = "7"
        }
        B2.setOnClickListener {
            display.text = "8"
        }
        B1.setOnClickListener {
            display.text = "9"
        }
    }
}