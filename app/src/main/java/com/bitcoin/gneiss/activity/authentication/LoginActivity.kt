package com.bitcoin.gneiss.activity.authentication

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.LinearLayout
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.activity.Dashboard

class LoginActivity : Activity(), View.OnClickListener {

    lateinit var loginLL: LinearLayout
    lateinit var registerNow: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
        //ShowDialog()
    }


    fun initViews() {

        loginLL = findViewById<View>(R.id.loginLL) as LinearLayout
        registerNow = findViewById<View>(R.id.registerNow) as LinearLayout

        loginLL.setOnClickListener(this)
        registerNow.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {

        if (p0 != null) {
            when (p0.id) {

                R.id.registerNow ->
                    GotoRegisterNow()

                R.id.loginLL ->
                    GotoDashboard()
            }
        }
    }


    fun GotoRegisterNow() {

        val mainIntent = Intent(this, SignUpActivity::class.java)
        startActivity(mainIntent)
        finish()
    }

    fun GotoDashboard() {

        val mainIntent = Intent(this, Dashboard::class.java)
        startActivity(mainIntent)
        finish()
    }

}