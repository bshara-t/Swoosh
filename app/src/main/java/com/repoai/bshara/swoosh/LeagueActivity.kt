package com.repoai.bshara.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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

        selectedLeague = "men"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        selectedLeague = "Women"
    }

    fun onCoEdClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "Co-Ed"
    }

}
