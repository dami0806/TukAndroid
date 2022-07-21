package com.dami.a22721_1info

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var inIntent = intent
        var hapValue = inIntent.getIntExtra("Num1",0)+ inIntent.getIntExtra("Num2",0)
        var chaValue = inIntent.getIntExtra("Num1",0)- inIntent.getIntExtra("Num2",0)
        var gobValue = inIntent.getIntExtra("Num1",0)* inIntent.getIntExtra("Num2",0)
        var naValue = inIntent.getIntExtra("Num1",0)/ inIntent.getIntExtra("Num2",0)




        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            var outIntent = Intent(applicationContext, MainActivity::class.java)


            outIntent.putExtra("Hap", hapValue)
            outIntent.putExtra("Cha", chaValue)
            outIntent.putExtra("Gob", gobValue)
            outIntent.putExtra("Na",naValue)
            setResult(Activity.RESULT_OK, outIntent)
            finish()
        }
    }
}