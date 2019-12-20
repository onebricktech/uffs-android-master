package com.bitcoin.gneiss.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitcoin.gneiss.R
import com.bitcoin.gneiss.model.PlayersStartersPOJO

class TeamsDetailsAdapter(var context: Context, var list: ArrayList<PlayersStartersPOJO>) : RecyclerView.Adapter<TeamsDetailsAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.detail_adapter, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_name.text = list[position].name
        holder.tv_position.text = list[position].position
        holder.tv_points.text = list[position].points
    }

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var tv_name: TextView = item.findViewById(R.id.tv_name)
        var tv_position: TextView = item.findViewById(R.id.tv_position)
        var tv_points: TextView = item.findViewById(R.id.tv_points)
    }
}