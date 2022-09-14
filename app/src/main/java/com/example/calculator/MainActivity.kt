package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstNumber:EditText = findViewById(R.id.number)
        val secondNumber:EditText = findViewById(R.id.secondNumber)

        val plus:Button  = findViewById(R.id.plus)
        val minus:Button  = findViewById(R.id.minus)
        val multiply:Button  = findViewById(R.id.multiply)
        val divide:Button  = findViewById(R.id.divide)
        val Clear:Button  = findViewById(R.id.clear)
        val result:TextView = findViewById(R.id.result)


        var resultnumber:Double

        plus.setOnClickListener {
            if (firstNumber.toString().isEmpty() || secondNumber.toString().isEmpty()) {
                result.text = "please provide both numbers"
            } else {
                try {
                    val number1 =(firstNumber.text.toString()).toDouble()
                    val number2 =(secondNumber.text.toString()).toDouble()
                    resultnumber = (number1 + number2)
                    result.text = "$resultnumber"
                }
                catch(e:NumberFormatException){
                    Toast.makeText(this, "Not a number", Toast.LENGTH_LONG).show()
                }


            }
        }
        minus.setOnClickListener{
            if(firstNumber.toString().isEmpty()||secondNumber.toString().isEmpty()){
                result.text = "please provide both numbers"
            }
            else
            {
                try {
                    val number1 =(firstNumber.text.toString()).toDouble()
                    val number2 =(secondNumber.text.toString()).toDouble()
                    resultnumber = (number1 - number2)
                    result.text = "$resultnumber"
                }
                catch(e:NumberFormatException){
                    Toast.makeText(this, "Not a number", Toast.LENGTH_LONG).show()
                }
            }
        }
        multiply.setOnClickListener{
            if(firstNumber.toString().isEmpty()||secondNumber.toString().isEmpty()){
                result.setText("please provide both numbers")
            }
            else
            {
                try {
                    val number1 =(firstNumber.text.toString()).toDouble()
                    val number2 =(secondNumber.text.toString()).toDouble()
                    resultnumber = (number1 * number2)
                    result.text = "$resultnumber"
                }
                catch(e:NumberFormatException){
                    Toast.makeText(this, "Not a number", Toast.LENGTH_LONG).show()
                }
            }
        }
        divide.setOnClickListener{
            if(firstNumber.toString().isEmpty()||secondNumber.toString().isEmpty()){
                result.  setText("please provide both numbers")
            }
            else
            {
                try {
                    val number1 =(firstNumber.text.toString()).toDouble()
                    val number2 =(secondNumber.text.toString()).toDouble()
                    var loc:Int = 0;
                    if(number2==loc.toDouble()){
                        result.text = "Error"
                    }
                    else {
                        resultnumber = number1 / number2
                        result.text = "$resultnumber"
                    }
                }
                catch(e:NumberFormatException){
                     Toast.makeText(this, "Not a number", Toast.LENGTH_LONG).show()
                }

            }
        }
        Clear.setOnClickListener{
            firstNumber.text = null
            secondNumber.text = null
            result.text =null
        }


    }
}