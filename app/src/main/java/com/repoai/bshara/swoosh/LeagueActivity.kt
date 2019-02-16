package com.repoai.bshara.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun setPointer(view: View) {
        nextBtn.setOnClickListener {
            val skillIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillIntent)
        }
    }

}
