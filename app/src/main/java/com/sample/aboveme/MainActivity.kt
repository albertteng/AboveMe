package com.sample.aboveme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone : Button = findViewById(R.id.done_button)
        val teName : TextView = findViewById(R.id.nickname_edit)
        val tvName : TextView = findViewById(R.id.nickname_text)
        btnDone.setOnClickListener(){
            tvName.text = teName.text.toString()
            tvName.visibility = View.VISIBLE
            tvName.visibility = View.GONE
            btnDone.visibility = View.GONE
        }

    }
}