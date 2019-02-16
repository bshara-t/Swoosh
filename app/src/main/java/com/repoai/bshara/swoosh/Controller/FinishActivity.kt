package com.repoai.bshara.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.repoai.bshara.swoosh.Model.Player
import com.repoai.bshara.swoosh.R
import com.repoai.bshara.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeageTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
