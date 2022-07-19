package com.dami.a22718_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var edit:EditText
    lateinit var textId:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit = findViewById(R.id.edit)
        edit.setOnKeyListener{view, i ,keyevent->
            textId = edit.text.toString()
            Toast.makeText(this,textId,Toast.LENGTH_SHORT).show()
            false
        }


    }
}