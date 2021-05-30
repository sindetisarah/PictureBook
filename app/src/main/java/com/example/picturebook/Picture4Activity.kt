package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        var pic5=findViewById<Button>(R.id.btnPic5)
        pic5.setOnClickListener {
            var intent=Intent(baseContext,Picture5Activity::class.java)
            startActivity(intent)
        }
        var btnPrev3=findViewById<Button>(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            var intent=Intent(baseContext,Picture3Activity::class.java)
            startActivity(intent)
        }
    }
}