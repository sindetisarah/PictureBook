package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture1)
        var btnPic2=findViewById<Button>(R.id.btnPic2)
        btnPic2.setOnClickListener {
            var intent=Intent(baseContext,Picture2Activity::class.java)
            startActivity(intent)

        }
        var btnPrevHome=findViewById<Button>(R.id.btnPrevHome)
        btnPrevHome.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}