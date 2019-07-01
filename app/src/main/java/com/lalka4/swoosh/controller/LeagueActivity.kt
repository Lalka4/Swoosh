package com.lalka4.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.lalka4.swoosh.utils.*
import com.lalka4.swoosh.R
import com.lalka4.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onMenClicked(view: View){
        womenLeague.isChecked = false
        co_edLeague.isChecked = false
        player.league = "men"
    }

    fun onWomenClicked(view: View){
        menLeague.isChecked = false
        co_edLeague.isChecked = false
        player.league = "women"
    }

    fun onCoedClicked(view: View){
        menLeague.isChecked = false
        womenLeague.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (player.league != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}
