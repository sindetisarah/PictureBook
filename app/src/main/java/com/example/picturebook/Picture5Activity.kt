package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture5)
       var btnPrevious=findViewById<Button>(R.id.btnPreview)
        btnPrevious.setOnClickListener {
            var intent=Intent(baseContext,Picture4Activity::class.java)
            startActivity(intent)
        }
    }
}