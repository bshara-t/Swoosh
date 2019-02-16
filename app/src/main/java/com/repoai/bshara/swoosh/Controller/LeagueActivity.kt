package com.repoai.bshara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.repoai.bshara.swoosh.Model.Player
import com.repoai.bshara.swoosh.R
import com.repoai.bshara.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun setPointer(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please chose a league.", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensLeagueClicked(view: View) {
        womensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        if (mensLeagueBtn.isChecked) {
            player.league = "men"
        } else {
            player.league = ""
        }
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        if (womensLeagueBtn.isChecked) {
            player.league = "Women"
        } else {
            player.league = ""
        }

    }

    fun onCoEdClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        if (co_edLeagueBtn.isChecked) {
            player.league = "Co-Ed"
        } else {
            player.league = ""
        }

    }

}
