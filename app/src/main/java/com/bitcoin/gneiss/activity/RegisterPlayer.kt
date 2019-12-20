package com.bitcoin.gneiss.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.bitcoin.gneiss.R
import kotlinx.android.synthetic.main.activity_register_player.*

class RegisterPlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_player)

        val sex = ArrayAdapter(this, R.layout.spinner_items, resources.getStringArray(R.array.sex))
        sp_sex.adapter = sex

        val league = ArrayAdapter(this, R.layout.spinner_items, resources.getStringArray(R.array.league))
        sp_league.adapter = league

        val team = ArrayAdapter(this, R.layout.spinner_items, resources.getStringArray(R.array.team))
        sp_teams.adapter = team

        val position = ArrayAdapter(this, R.layout.spinner_items, resources.getStringArray(R.array.position))
        sp_position.adapter = position

        iv_exit.setOnClickListener {
            finish()
        }
    }
}