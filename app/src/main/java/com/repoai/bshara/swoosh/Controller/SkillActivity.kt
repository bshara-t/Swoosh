package com.repoai.bshara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.repoai.bshara.swoosh.Utillities.EXTRA_LEAGUE
import com.repoai.bshara.swoosh.R
import com.repoai.bshara.swoosh.Utillities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        if (beginnerSkillBtn.isChecked) {
            skill = "Beginner"
        } else {
            skill = ""
        }
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        if (ballerSkillBtn.isChecked) {
            skill = "Baller"
        } else {
            skill = ""
        }
    }

    fun onFinishClicked(view: View) {
        if (skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select you'r skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
