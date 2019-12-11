package com.bitcoin.gneiss.activity.authentication

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.LinearLayout
import com.bitcoin.gneiss.R
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.*

class SignUpActivity: Activity(),View.OnClickListener{


    lateinit var gotoLogin: LinearLayout
    lateinit var proceedTiertwo:LinearLayout
    var cal = Calendar.getInstance()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        initViews()
    }


    fun initViews(){

        gotoLogin=findViewById<View>(R.id.gotoLogin)as LinearLayout
        proceedTiertwo=findViewById<View>(R.id.proceedTiertwo)as LinearLayout

        gotoLogin.setOnClickListener(this)
        proceedTiertwo.setOnClickListener(this)

        // create an OnDateSetListener
        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            }
        }

        selectdob.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(this@SignUpActivity,
                        dateSetListener,
                        // set DatePickerDialog to point to today's date when it loads up
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH),
                        cal.get(Calendar.DAY_OF_MONTH)).show()
            }

        })

    }


    override fun onClick(p0: View?) {

        if (p0 != null) {
            when(p0.id){

                R.id.gotoLogin ->
                    GotoLogin()

                R.id.proceedTiertwo->
                    GotoTierTwo()

            }
        }
    }



    fun GotoLogin(){
        val mainIntent = Intent(this, LoginActivity::class.java)
        startActivity(mainIntent)
        finish()
    }

    fun GotoTierTwo(){
        val mainIntent = Intent(this, BarCodeSignInActivity::class.java)
        startActivity(mainIntent)


    }
}