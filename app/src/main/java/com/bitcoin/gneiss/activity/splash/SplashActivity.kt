package com.bitcoin.gneiss.activity.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.activity.authentication.LoginActivity

class SplashActivity: Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GoInsideApp()
    }

    fun GoInsideApp(){

        Handler().postDelayed({
            /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this, LoginActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)
    }
}