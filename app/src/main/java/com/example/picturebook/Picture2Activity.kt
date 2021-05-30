package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        var btnPic3=findViewById<Button>(R.id.btnPic3)
        btnPic3.setOnClickListener {
            var intent = Intent(baseContext, Picture3Activity::class.java)
            startActivity(intent)
        }
        var btnPrev1=findViewById<Button>(R.id.btnPrev1)
        btnPrev1.setOnClickListener {
            var intent=Intent(baseContext,Picture1Activity::class.java)
            startActivity(intent)
        }
    }

}