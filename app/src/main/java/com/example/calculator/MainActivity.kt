package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textveiw:TextView=findViewById(R.id.textView1)
        val textview2:TextView=findViewById(R.id.textView2)
        val delete1:Button=findViewById(R.id.delete)
        val Bt1:Button=findViewById(R.id.bt1)
        val Bt2:Button=findViewById(R.id.bt2)
        val Bt4:Button=findViewById(R.id.bt4)
        val Bt5:Button=findViewById(R.id.bt5)
        val Bt6:Button=findViewById(R.id.bt6)
        val Bt7:Button=findViewById(R.id.bt7)
        val Bt8:Button=findViewById(R.id.bt8)
        val Bt9:Button=findViewById(R.id.bt9)
        val Bt10:Button=findViewById(R.id.bt10)
        val Bt11:Button=findViewById(R.id.bt11)
        val Bt12:Button=findViewById(R.id.bt12)
        val Bt13:Button=findViewById(R.id.bt13)
        val Bt14:Button=findViewById(R.id.bt14)
        val Bt15:Button=findViewById(R.id.bt15)
        val Bt16:Button=findViewById(R.id.bt16)

        Bt1.setOnClickListener{
            input.text
        }



    }
}