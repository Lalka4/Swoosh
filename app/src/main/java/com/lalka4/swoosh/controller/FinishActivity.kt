package com.lalka4.swoosh.controller

import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.lalka4.swoosh.R
import com.lalka4.swoosh.model.Player
import com.lalka4.swoosh.utils.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchingLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
