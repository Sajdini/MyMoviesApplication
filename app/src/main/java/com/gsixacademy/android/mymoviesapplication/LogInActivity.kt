package com.gsixacademy.android.mymoviesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_login.setOnClickListener {
            startActivity(Intent(applicationContext,ExploreActivity::class.java))
        }
    }
}
