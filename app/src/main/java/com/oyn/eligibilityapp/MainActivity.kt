package com.oyn.eligibilityapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(name = "Kang Young Hyun", email = "younghyun@example.com", age = 31)

        val userInfo = user.getUserInfo()

        val tvUserInfo = findViewById<TextView>(R.id.tvUserInfo)
        tvUserInfo.text = userInfo
    }
}
