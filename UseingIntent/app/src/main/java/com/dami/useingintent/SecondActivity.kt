package com.dami.useingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var namet:TextView
    lateinit var gender:TextView
    lateinit var age : TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        namet = findViewById(R.id.name)
        gender = findViewById(R.id.gender)
        age = findViewById(R.id.age)
        btn = findViewById(R.id.returnbtn)

        namet.text = intent.getStringExtra("name")
        gender.text = intent.getStringExtra("gender")
        var ageNum= intent.getIntExtra("age",0)
        age.text = ageNum.toString()
       var OutIntent = Intent(this,MainActivity::class.java)
    btn.setOnClickListener{
        startActivity(OutIntent)
    }
    }
}