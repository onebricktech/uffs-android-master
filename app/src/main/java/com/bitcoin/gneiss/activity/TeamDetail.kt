package com.bitcoin.gneiss.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.adapter.TeamsDetailsAdapter
import com.bitcoin.gneiss.model.PlayersStartersPOJO
import kotlinx.android.synthetic.main.activity_team_detail.*
import java.util.ArrayList

class TeamDetail : AppCompatActivity() {
    internal var list = ArrayList<PlayersStartersPOJO>()
    var str = "N/A"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_detail)

        list.add(PlayersStartersPOJO("Wayne Gretzky", "Forward (F)", str))
        list.add(PlayersStartersPOJO("Sidney Crosby", "Center (C)", str))
        list.add(PlayersStartersPOJO("Gordie Howe", "Left Wing (LW)", str))
        list.add(PlayersStartersPOJO("Alexander Ovechkin", "Right Wing (RW)", str))
        list.add(PlayersStartersPOJO("Maurice Richard", "Defense (D)", str))
        list.add(PlayersStartersPOJO("jonathan Toews", "Utility (UTIL)", str))
        list.add(PlayersStartersPOJO("Mario Lemieux", "Goalie(G)", str))
        list.add(PlayersStartersPOJO("Hayley Wickenheiser", "Bench(BE)", str))
        list.add(PlayersStartersPOJO("Hayley Wickenheiser", "Injured Reserve (IR)", str))

        val adapter = TeamsDetailsAdapter(this, list)
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = adapter
        rv_list.isNestedScrollingEnabled = false

        iv_exit.setOnClickListener { finish() }
    }
}