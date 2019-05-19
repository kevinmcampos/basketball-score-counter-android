package me.kevincampos.basketballscorecounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var teamAScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one_point_button.setOnClickListener {
            teamAScore += 1
            updateTeamScore()
        }
        two_point_button.setOnClickListener {
            teamAScore += 2
            updateTeamScore()
        }
        three_point_button.setOnClickListener {
            teamAScore += 3
            updateTeamScore()
        }
        reset_button.setOnClickListener {
            teamAScore = 0
            updateTeamScore()
        }
    }

    fun updateTeamScore() {
        team_a_score_text_view.text = teamAScore.toString()
    }
}
