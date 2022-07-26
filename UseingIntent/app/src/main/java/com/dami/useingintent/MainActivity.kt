package com.dami.useingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    lateinit var nameText:TextView
    lateinit var ageNumP:NumberPicker
    lateinit var genderRdoG:RadioGroup
    lateinit var manRdoB:RadioButton
    lateinit var womanRdoB:RadioButton
    lateinit var sendBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameText = findViewById(R.id.etName)
        ageNumP = findViewById(R.id.Age)
        genderRdoG= findViewById(R.id.rdoGroup)
        manRdoB = findViewById(R.id.rdoM)
        womanRdoB = findViewById(R.id.rdoW)
        sendBtn = findViewById(R.id.sendBtn)

        ageNumP.wrapSelectorWheel=false
        ageNumP.maxValue=60
        ageNumP.minValue=10

        var Outintent = Intent(this,SecondActivity::class.java)
        sendBtn.setOnClickListener{
            Outintent.putExtra("name",nameText.text.toString())
            Outintent.putExtra("age",ageNumP.value)
            when (genderRdoG.checkedRadioButtonId){
                R.id.rdoM -> Outintent.putExtra("gender","남자")
                R.id.rdoW -> Outintent.putExtra("gender","여자")
            }
            startActivity(Outintent)


        }
    }
}