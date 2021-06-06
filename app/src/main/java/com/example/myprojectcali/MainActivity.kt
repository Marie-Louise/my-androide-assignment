package com.example.myprojectcali

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<TextView>(R.id.idnum1)
        var num2 = findViewById<TextView>(R.id.idnum2)
        var addition = findViewById<Button>(R.id.button)
        var subtract = findViewById<Button>(R.id.button3)
        var multiply = findViewById<Button>(R.id.button4)
        var divide = findViewById<Button>(R.id.button5)
        var etresult = findViewById<TextView>(R.id.editTextNumber6)
        addition.setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            var result = number1 + number2

            etresult.text = "result:$result"
        }
        subtract.setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            var result = number1 - number2

            etresult.text = "result:$result"
        }
        multiply.setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            var result = number1 * number2

            etresult.text = "result:$result"
        }
            divide.setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            var result = number1 / number2

            etresult.text = "result:$result"
        }
    }
}