package com.bitcoin.gneiss.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.adapter.TeamsAdapter
import com.bitcoin.gneiss.adapter.TeamsPlayersAdapter
import com.bitcoin.gneiss.model.PlayersPOJO
import com.bitcoin.gneiss.model.TeamsPOJO
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.util.ArrayList

class Dashboard : AppCompatActivity() {
    internal var list = ArrayList<TeamsPOJO>()
    internal var playerslist = ArrayList<PlayersPOJO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        list.add(TeamsPOJO("Team 1", "5", "2", "7", "Brantford, \nCanada"))
        list.add(TeamsPOJO("Team 2", "4", "7", "1", "Cole Harbour, \nCanada"))
        list.add(TeamsPOJO("Team 3", "2", "4", "8", "Moscow, \nRussia"))
        list.add(TeamsPOJO("Team 4", "9", "0", "8", "Montreal, \nCanada"))

        val adapter = TeamsAdapter(this, list)
        rv_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_list.adapter = adapter

        playerslist.add(PlayersPOJO("Wayne Gretzky","9","1","Brantford, \nCanada"))
        playerslist.add(PlayersPOJO("Sidney Crosby","90","2","Montreal, \nCanada"))
        playerslist.add(PlayersPOJO("Gordie Howe","85","3","Moscow, \nRussia"))
        playerslist.add(PlayersPOJO("Alexander Ovechkin","1","1","Brantford, \nCanada"))

        val adapterPlayers = TeamsPlayersAdapter(this, playerslist)
        rv_players_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_players_list.adapter = adapterPlayers

        rl_register_player.setOnClickListener {
            startActivity(Intent(this, RegisterPlayer::class.java))
        }
    }
}