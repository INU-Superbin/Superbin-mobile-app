package com.example.WorldBestBin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginActivity : AppCompatActivity() {

    private val id = "admin"
    private val password = "01234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var id_text = findViewById<EditText>(R.id.id_text)
        var pwd_text = findViewById<EditText>(R.id.pwd_text)

        val btn = findViewById<Button>(R.id.btn1) as Button

        btn.setOnClickListener(View.OnClickListener {

            var check_id: String = id_text.text.toString()
            var check_pwd: String = pwd_text.text.toString()

            if (check_id == id && check_pwd == password){
                Toast.makeText(this, "로그인완료", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "아이디 또는 비밀번호를 다시 확인해주세요", Toast.LENGTH_LONG).show()
            }

        })

    }

}