package com.repoai.bshara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.repoai.bshara.swoosh.Model.Player
import com.repoai.bshara.swoosh.R
import com.repoai.bshara.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        if (beginnerSkillBtn.isChecked) {
            player.skill = "Beginner"
        } else {
            player.skill = ""
        }
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        if (ballerSkillBtn.isChecked) {
            player.skill = "Baller"
        } else {
            player.skill = ""
        }
    }

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select you'r skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
