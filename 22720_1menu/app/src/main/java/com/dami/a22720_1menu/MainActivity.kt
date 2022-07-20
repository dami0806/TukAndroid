package com.dami.a22720_1menu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.internal.BaselineLayout

class MainActivity : AppCompatActivity() {
    lateinit var baseLayout: LinearLayout
    lateinit var button1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    baseLayout = findViewById<LinearLayout>(R.id.baseLayout)
    button1 = findViewById<Button>(R.id.btn)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemRed ->{
                baseLayout.setBackgroundColor(Color.RED)
            }
            R.id.itemBlue ->{
                baseLayout.setBackgroundColor(Color.BLUE)
            }
            R.id.itemGreen ->{
                baseLayout.setBackgroundColor(Color.GREEN)
            }
            R.id.subRotate ->{
                button1.rotation+= 45f
            }
            R.id.subSize ->{
                button1.scaleX *=2f// 크기 지정할때 scale
            }

        }
        return false
    }
}