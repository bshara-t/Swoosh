package com.repoai.bshara.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.repoai.bshara.swoosh.R
import com.repoai.bshara.swoosh.Utillities.EXTRA_LEAGUE
import com.repoai.bshara.swoosh.Utillities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeageTxt.text = "Looking for $league $skill league near you..."
    }
}
