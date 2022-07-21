package com.dami.a22721_1info

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText

    lateinit var rdoGroup:RadioGroup
    lateinit var Addbtn:RadioButton
    lateinit var Subbtn:RadioButton
    lateinit var Multibtn:RadioButton
    lateinit var Divbtn:RadioButton

    lateinit var Calbtn:Button
    var result:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        rdoGroup=findViewById(R.id.rdoGroup)
        Addbtn = findViewById(R.id.Addbtn)
        Subbtn = findViewById(R.id.Subbtn)
        Multibtn = findViewById(R.id.Multibtn)
        Divbtn = findViewById(R.id.Divbtn)
        Calbtn = findViewById(R.id.Calbtn)



        var btnNewActivity = findViewById<Button>(R.id.Calbtn)
        btnNewActivity.setOnClickListener {
            var edtNum1 = findViewById<EditText>(R.id.num1)
            var edtNum2 = findViewById<EditText>(R.id.num2)

            var intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("Num1", Integer.parseInt(num1.text.toString()))
            intent.putExtra("Num2", Integer.parseInt(num2.text.toString()))
            startActivityForResult(intent,0)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            when (rdoGroup.checkedRadioButtonId){
                R.id.Addbtn ->{
                    var hap = data!!.getIntExtra("Hap",0)
                    Toast.makeText(this,"결과: $hap",Toast.LENGTH_SHORT).show()

                }
                R.id.Subbtn ->{
                    var cha = data!!.getIntExtra("Cha",0)
                    Toast.makeText(this,"결과: $cha",Toast.LENGTH_SHORT).show()

                }
                R.id.Multibtn ->{
                    var gob = data!!.getIntExtra("Gob",0)
                    Toast.makeText(this,"결과: $gob",Toast.LENGTH_SHORT).show()

                }
                R.id.Divbtn ->{
                    var na = data!!.getIntExtra("Na",0)
                    Toast.makeText(this,"결과: $na",Toast.LENGTH_SHORT).show()

                }

    }}}
}

    /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when (rdoGroup.checkedRadioButtonId){
                R.id.Addbtn ->{
                    var hap = data!!.getIntExtra("hap",0)
                    Toast.makeText(this,"결과: $hap",Toast.LENGTH_SHORT).show()

                }
                R.id.Subbtn ->{
                    var hap = data!!.getIntExtra("cha",0)
                    Toast.makeText(this,"결과: $hap",Toast.LENGTH_SHORT).show()

                }
                R.id.Multibtn ->{
                    var hap = data!!.getIntExtra("gob",0)
                    Toast.makeText(this,"결과: $hap",Toast.LENGTH_SHORT).show()

                }
                R.id.Divbtn ->{
                    var hap = data!!.getIntExtra("na",0)
                    Toast.makeText(this,"결과: $hap",Toast.LENGTH_SHORT).show()

                }


          }}}  }*/



