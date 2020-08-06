package com.binar.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()

        val listOfPlayer = arrayListOf(
            PlayerData("Ikhsan Lemon", "RRQ", "22"),
            PlayerData("Tuturu", "RRQ", "22"),
            PlayerData("Ayam Jago", "RRQ", "22"),
            PlayerData("Xinnn", "RRQ", "22"),
            PlayerData("R7 Tatsumaki", "RRQ", "22"),
            PlayerData("LJ", "RRQ", "22"),
            PlayerData("V Y N", "RRQ", "22"),
            PlayerData("Xoxo", "RRQ", "22"),
            PlayerData("Albert", "RRQ", "22"),
            PlayerData("T A K A", "RRQ", "22"),
            PlayerData("Jamess", "RRQ", "22")
        )

        val adapter = PlayerAdapter(listOfPlayer)

        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gridLayout = GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false)

        if (radio_linear.isChecked) {
            recyclerView.layoutManager = linearLayout
        } else if (radio_grid.isChecked) {
            recyclerView.layoutManager = gridLayout
        }

        recyclerView.adapter = adapter
    }
}