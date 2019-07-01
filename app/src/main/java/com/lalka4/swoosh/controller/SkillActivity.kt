package com.lalka4.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.lalka4.swoosh.utils.*
import com.lalka4.swoosh.R
import com.lalka4.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player=savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onBallerClicked(view: View){
        begginerSkill.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClicked(view: View){
        ballerSkill.isChecked = false
        player.skill = "beginner"
    }

    fun onFinishClicked(view: View){
        if (player.skill != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else{
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
