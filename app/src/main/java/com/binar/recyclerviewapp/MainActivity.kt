package com.binar.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()

        val listOfPlayer = arrayListOf(
            PlayerData("Lemon", "RRQ", "22"),
            PlayerData("Tuturu", "RRQ", "22"),
            PlayerData("AyamJG", "RRQ", "22"),
            PlayerData("Xinnn", "RRQ", "22"),
            PlayerData("R7", "RRQ", "22"),
            PlayerData("LJ", "RRQ", "22"),
            PlayerData("V Y N", "RRQ", "22"),
            PlayerData("Xoxo", "RRQ", "22"),
            PlayerData("Albert", "RRQ", "22"),
            PlayerData("T A K A", "RRQ", "22"),
            PlayerData("Jamess", "RRQ", "22"),
            PlayerData("Lemon", "RRQ", "22"),
            PlayerData("Tuturu", "RRQ", "22"),
            PlayerData("AyamJG", "RRQ", "22"),
            PlayerData("Xinnn", "RRQ", "22"),
            PlayerData("R7", "RRQ", "22"),
            PlayerData("LJ", "RRQ", "22"),
            PlayerData("V Y N", "RRQ", "22"),
            PlayerData("Xoxo", "RRQ", "22"),
            PlayerData("Albert", "RRQ", "22"),
            PlayerData("T A K A", "RRQ", "22"),
            PlayerData("Jamess", "RRQ", "22")
        )

        val adapter = PlayerAdapter(listOfPlayer)

        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gridLayout = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)

        sv_recyclerview.layoutManager = linearLayout

        list_radio.check(radio_linear.id)

        list_radio.setOnCheckedChangeListener { group, i ->
            val radio: RadioButton = findViewById(i)

            if (radio.id == radio_linear.id) sv_recyclerview.layoutManager = linearLayout
            else if (radio.id == radio_grid.id) sv_recyclerview.layoutManager = gridLayout
        }

        sv_recyclerview.adapter = adapter
    }
}