package com.binar.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.data_item.view.*

class PlayerAdapter(val listPlayer: ArrayList<PlayerData>): RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    // to prepare the layout item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_item, parent, false)
        return ViewHolder(view)
    }

    // to prepare how long the item
    override fun getItemCount(): Int {
        return listPlayer.size
    }

    // to fill the item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_name.setText(listPlayer[position].name)
        holder.itemView.tv_age.setText(listPlayer[position].age)
        holder.itemView.tv_team.setText(listPlayer[position].team)
    }


}