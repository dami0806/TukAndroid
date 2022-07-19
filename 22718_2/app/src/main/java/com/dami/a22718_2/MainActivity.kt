package com.dami.a22718_2

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var selectBtn: Switch
    lateinit var text:TextView
    lateinit var radioGroup:RadioGroup
    lateinit var radiobtn1:RadioButton
    lateinit var radiobtn2:RadioButton
    lateinit var radiobtn3:RadioButton
    lateinit var img:ImageView
    lateinit var finishBtn:Button
    lateinit var restartBtn:Button
    lateinit var btngroup:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectBtn = findViewById(R.id.selectBtn)
        text = findViewById(R.id.text)
        radioGroup = findViewById(R.id.radioGroup)
        radiobtn1 = findViewById(R.id.oreo)
        radiobtn2 = findViewById(R.id.pie)
        radiobtn3 = findViewById(R.id.q)

        img = findViewById(R.id.img)
        finishBtn =findViewById(R.id.finishBtn)
        restartBtn = findViewById(R.id.restartBtn)
        btngroup = findViewById(R.id.btngroup)

        selectBtn.setOnCheckedChangeListener{v,b->
        if(selectBtn.isChecked==true) {
            text.visibility = View.VISIBLE
            radioGroup.visibility = View.VISIBLE
            img.visibility = View.VISIBLE
            btngroup.visibility = View.VISIBLE


                radiobtn1.setOnClickListener{
                    img.setImageResource(R.drawable.oreo) }
                radiobtn2.setOnClickListener{
                    img.setImageResource(R.drawable.img_1)}
                radiobtn3.setOnClickListener{
                    img.setImageResource(R.drawable.img_2)}
            }

        else{
            text.visibility = View.INVISIBLE
            radioGroup.visibility = View.INVISIBLE
            img.visibility = View.INVISIBLE
            btngroup.visibility = View.INVISIBLE
           }}





            finishBtn.setOnClickListener{
                finish()
            }
            restartBtn.setOnClickListener{
                selectBtn.isChecked =false
                text.visibility = View.INVISIBLE
                radioGroup.visibility = View.INVISIBLE
                radiobtn1.isChecked=false
                radiobtn2.isChecked=false
                radiobtn3.isChecked=false
                img.setImageResource(0)
                btngroup.visibility = View.INVISIBLE

            }

     false   }}



