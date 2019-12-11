package com.bitcoin.gneiss.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.activity.TeamDetail
import com.bitcoin.gneiss.model.PlayersPOJO

class TeamsPlayersAdapter(var context: Context, var list: ArrayList<PlayersPOJO>) : RecyclerView.Adapter<TeamsPlayersAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.teams_player_adapter, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_team.text = list[position].name
        holder.tv_rank.text = "Rank: " + list[position].rank
        holder.tv_league.text = "League: " + list[position].league
        holder.tv_address.text = "Address: " + list[position].address
    }

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var tv_team: TextView = item.findViewById(R.id.tv_team)
        var tv_rank: TextView = item.findViewById(R.id.tv_rank)
        var tv_league: TextView = item.findViewById(R.id.tv_league)
        var tv_address: TextView = item.findViewById(R.id.tv_address)

        init {
            item.setOnClickListener {
                context.startActivity(Intent(context,TeamDetail::class.java))
            }
        }
    }
}