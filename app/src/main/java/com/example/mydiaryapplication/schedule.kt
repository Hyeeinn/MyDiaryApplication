package com.example.mydiaryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import com.example.mydiaryapplication.databinding.ActivityMainBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class schedule : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //객체 생성
        val textdate: TextView = findViewById(R.id.text_date)
        val calendarView: CalendarView = findViewById(R.id.cal)

        //날짜 형태
        val dateFormat: DateFormat = SimpleDateFormat("yyyy년 mm월 dd일")

        //date 타입(오늘 날짜)
        val date: Date = Date(calendarView.date)
        //날짜 텍스트뷰에 담기
        textdate.text = dateFormat.format(date)
        //calendarview 날짜 변환 이벤트
        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            //날짜 변수에 담기
            var day: String = "${year}년 ${month + 1}월 ${day}일"
            //변수 텍스트뷰에 담기
            textdate.text = day
        }
    }
}