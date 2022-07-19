package com.dami.chrono719

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    lateinit var chrono : Chronometer
    lateinit var rdoG : RadioGroup
    lateinit var rdoDate : RadioButton
    lateinit var rdoTime : RadioButton
    lateinit var dPiker : DatePicker
    lateinit var tPicker : TimePicker
    lateinit var tvYear : TextView
    lateinit var tvMonth : TextView
    lateinit var tvDay : TextView
    lateinit var tvHour : TextView
    lateinit var tvMinute : TextView

    var selectYear : Int = 0
    var selectMonth : Int = 0
    var selectDay : Int = 0
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chrono = findViewById<Chronometer>(R.id.chrono)
        rdoG = findViewById<RadioGroup>(R.id.rdoG)
        rdoDate = findViewById<RadioButton>(R.id.rdoDate)
        rdoTime = findViewById<RadioButton>(R.id.rdoTime)
        dPiker = findViewById<DatePicker>(R.id.dPiker)
        tPicker = findViewById<TimePicker>(R.id.tPicker)
        tvYear = findViewById<TextView>(R.id.tvYear)
        tvMonth = findViewById<TextView>(R.id.tvMonth)
        tvDay = findViewById<TextView>(R.id.tvDay)
        tvHour = findViewById<TextView>(R.id.tvHour)
        tvMinute = findViewById<TextView>(R.id.tvMinute)


        // 처음에는 라디오 버튼/데이트 피커/타임피커 둘 다 안 보이게 설정
        rdoG.visibility = View.INVISIBLE
        dPiker.visibility = View.INVISIBLE
        tPicker.visibility = View.INVISIBLE

        //날짜 설정 라디오 버튼 눌렀을 때 데이트 피커 보이게 설정
        rdoDate.setOnClickListener{
            dPiker.visibility = View.VISIBLE
            tPicker.visibility = View.INVISIBLE
        }
        // 시간 설정 라디오 버튼 눌렀을 때 타임피커 보이게 설정
        rdoTime.setOnClickListener{
            tPicker.visibility = View.VISIBLE
            dPiker.visibility = View.INVISIBLE

        }

        // 데이트 피커에서 날짜가 설정 되었을 때
        dPiker.setOnDateChangedListener { datePicker, i, i2, i3 ->  // SDK 26이상부터 사용할 수 있음
            selectYear = i
            selectMonth = i2 + 1
            selectDay = i3
        }

        // 예약 시작 + 라디오 버튼 보이게
        chrono.setOnClickListener {
            rdoG.visibility = View.VISIBLE

            chrono.base = SystemClock.elapsedRealtime()
            chrono.start()
            chrono.setTextColor(Color.RED)
        }
        // 예약 완료 + 예약 날짜와 시간 표시
        tvYear.setOnLongClickListener {
            //예약 완료
            chrono.stop()
            chrono.setTextColor(Color.BLUE)
            // 시간 설정
            tvYear.text = selectYear.toString()
            tvMonth.text = selectMonth.toString()
            tvDay.text = selectDay.toString()

            tvHour.text = tPicker.hour.toString()   // SDK 23이상부터 사용할 수 있음
            tvMinute.text = tPicker.minute.toString()

            // 라디오버튼/데이트피커/타임피커 안 보이게
            rdoG.visibility = View.INVISIBLE
            dPiker.visibility = View.INVISIBLE
            tPicker.visibility = View.INVISIBLE

            false
        }
    }
}


