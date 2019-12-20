package com.bitcoin.gneiss.activity.authentication

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.bitcoin.gneiss.R
import kotlinx.android.synthetic.main.activity_login_barcode.*

class BarCodeSignInActivity: Activity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_barcode)

        loginBasis.setOnClickListener(View.OnClickListener {

        })
    }



}