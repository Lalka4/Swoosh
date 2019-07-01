package com.lalka4.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.lalka4.swoosh.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getStartedBtn(view: View) {
        val leagueIntent = Intent(this, LeagueActivity::class.java)
        startActivity(leagueIntent)
    }
}


