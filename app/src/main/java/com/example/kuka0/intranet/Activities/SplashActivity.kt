package com.example.kuka0.intranet.Activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(2000)
        startActivity(Intent(this@SplashActivity,LoginActivity::class.java))
        finish()
    }
}
