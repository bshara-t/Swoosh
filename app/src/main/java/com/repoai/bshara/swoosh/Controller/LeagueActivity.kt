package com.repoai.bshara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.repoai.bshara.swoosh.Utillities.EXTRA_LEAGUE
import com.repoai.bshara.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun setPointer(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please chose a league.", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensLeagueClicked(view: View) {
        womensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        if (mensLeagueBtn.isChecked) {
            selectedLeague = "men"
        } else {
            selectedLeague = ""
        }
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        if (womensLeagueBtn.isChecked) {
            selectedLeague = "Women"
        } else {
            selectedLeague = ""
        }

    }

    fun onCoEdClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        if (co_edLeagueBtn.isChecked) {
            selectedLeague = "Co-Ed"
        } else {
            selectedLeague = ""
        }

    }

}
