package com.dami.a22718_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var edit1:EditText
    lateinit var edit2:EditText

    lateinit var plusBtn: Button
    lateinit var subBtn:Button
    lateinit var multiBtn:Button
    lateinit var divBtn :Button
    lateinit var remainBtn:Button

    lateinit var result:TextView
    lateinit var num1:String
    lateinit var num2:String

    var answer:Double?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1=findViewById(R.id.edit1)
        edit2=findViewById(R.id.edit2)

        plusBtn=findViewById(R.id.plusBtn)
        subBtn=findViewById(R.id.subBtn)
        multiBtn=findViewById(R.id.multiBtn)
        divBtn=findViewById(R.id.divBtn)
        remainBtn=findViewById(R.id.remainBtn)

        result = findViewById(R.id.result)

        num1=edit1.text.toString()
        num2 =edit2.text.toString()
        //버튼 클릭
        //더하기
        plusBtn.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1==""||num2==""){
                Toast.makeText(this,"숫자를 먼저입력하세요",Toast.LENGTH_SHORT).show()
            }
            else{
                answer = num1.toDouble() + num2.toDouble()
                result.text = "계산 결과: " + answer.toString()}
        }
        //빼기
        subBtn.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1==""||num2==""){
                Toast.makeText(this,"숫자를 먼저입력하세요",Toast.LENGTH_SHORT).show()
            }
            else{
                answer = num1.toDouble() - num2.toDouble()
                result.text = "계산 결과: " + answer.toString()}
        }

        //곱하기
        multiBtn.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1==""||num2==""){
                Toast.makeText(this,"숫자를 먼저입력하세요",Toast.LENGTH_SHORT).show()
            }
            else{
                answer = num1.toDouble() * num2.toDouble()
                result.text = "계산 결과: " + answer.toString()}
        }
        //나누기
        divBtn.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1==""||num2==""){
                Toast.makeText(this,"숫자를 먼저입력하세요",Toast.LENGTH_SHORT).show()
            }
            else{
                if(num2=="0"){
                    Toast.makeText(this,"0으로 나눌수 없습니다.",Toast.LENGTH_SHORT).show()
                }
                else{
                answer = num1.toDouble() / num2.toDouble()
                result.text = "계산 결과: " + answer.toString()}
        }}
        //나머지
        remainBtn.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1==""||num2==""){
                Toast.makeText(this,"숫자를 먼저입력하세요",Toast.LENGTH_SHORT).show()
            }
            else{
                if(num2=="0"){
                    Toast.makeText(this,"0으로 나눌수 없습니다.",Toast.LENGTH_SHORT).show()
                }
                else{
                    answer = num1.toDouble() % num2.toDouble()
                    result.text = "계산 결과: " + answer.toString()}
            }}


        }

    }
