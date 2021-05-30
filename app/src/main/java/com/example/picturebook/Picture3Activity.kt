package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        var btnPic4=findViewById<Button>(R.id.btnPic4)
        btnPic4.setOnClickListener {
            var intent = Intent(baseContext, Picture4Activity::class.java)
            startActivity(intent)
        }
        var btnPrev2=findViewById<Button>(R.id.btnPrev2)
        btnPrev2.setOnClickListener {
            var intent=Intent(baseContext,Picture2Activity::class.java)
            startActivity(intent)
        }



    }
}
