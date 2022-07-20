package com.dami.a22720_1menu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class MainActivity : AppCompatActivity() {


    lateinit var img :ImageView
    lateinit var et:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       setContentView(R.layout.activity_main)

        img = findViewById(R.id.img)
        et = findViewById(R.id.et)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->{
                item.isChecked =true
                img.setImageResource(R.drawable.img1)
            }
            R.id.item2 ->{
                item.isChecked =true
                img.setImageResource(R.drawable.img2)
            }
            R.id.item3 ->{
                item.isChecked =true
                img.setImageResource(R.drawable.img3)
            }
            R.id.rotate ->{
                if(et.text.toString()==""){
                    Toast.makeText(this,"각도를 먼저입력하세요",Toast.LENGTH_SHORT).show()
                }else {
                    var value = et.text.toString().toFloat()
                    img.rotation = value
                }
            }


        }
        return false
    }
}