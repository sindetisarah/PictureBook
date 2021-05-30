package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pic1=findViewById<Button>(R.id.btnPic1)
        pic1.setOnClickListener {
            var intent=Intent(baseContext,Picture1Activity::class.java)
            startActivity(intent)
        }
    }

}