package com.example.WorldBestBin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_location = findViewById<Button>(R.id.btn_location) as Button
        val btn_amount = findViewById<Button>(R.id.btn_amount) as Button

        btn_location.setOnClickListener(View.OnClickListener {
            val intent1 = Intent(this, MainMenw::class.java)
            startActivity(intent1);
        })

        btn_amount.setOnClickListener(View.OnClickListener {
            val intent2 = Intent(this, AmountActivity::class.java)
            startActivity(intent2);
        })
    }
}