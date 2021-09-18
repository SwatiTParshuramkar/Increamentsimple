package com.example.android.increamentdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var incClick :Button
    lateinit var tvIncreamentResult :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incClick = findViewById(R.id.increament)
        tvIncreamentResult = findViewById(R.id.tvResult)

        var increamentNumber = 0

        incClick.setOnClickListener {

            increamentNumber++

            tvIncreamentResult.text = increamentNumber.toString()

        }


    }
}