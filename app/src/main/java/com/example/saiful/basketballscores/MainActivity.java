package com.example.saiful.basketballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int scoresTeamA = 0;
    int scoresTeamB = 0;

    TextView scoresViewForTeamA, scoresViewForTeamB;
    Button add1PointForTeamA, add2PointForTeamA, add3PointForTeamA, add1PointForTeamB, add2PointForTeamB, add3PointForTeamB, resetScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoresViewForTeamA = (TextView) findViewById(R.id.score_for_team_a);
        scoresViewForTeamB = (TextView) findViewById(R.id.score_for_team_b);

        add1PointForTeamA = (Button) findViewById(R.id.add_1_for_team_a);
        add1PointForTeamA.setOnClickListener(this);
        add2PointForTeamA = (Button) findViewById(R.id.add_2_for_team_a);
        add2PointForTeamA.setOnClickListener(this);
        add3PointForTeamA = (Button) findViewById(R.id.add_3_for_team_a);
        add3PointForTeamA.setOnClickListener(this);

        add1PointForTeamB = (Button) findViewById(R.id.add_1_for_team_b);
        add1PointForTeamB.setOnClickListener(this);
        add2PointForTeamB = (Button) findViewById(R.id.add_2_for_team_b);
        add2PointForTeamB.setOnClickListener(this);
        add3PointForTeamB = (Button) findViewById(R.id.add_3_for_team_b);
        add3PointForTeamB.setOnClickListener(this);

        resetScores = (Button) findViewById(R.id.reset_button);
        resetScores.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_1_for_team_a:
                scoresTeamA = scoresTeamA + 1;
                displayForTeamA(scoresTeamA);

                break;
            case R.id.add_2_for_team_a:
                scoresTeamA = scoresTeamA + 2;
                displayForTeamA(scoresTeamA);

                break;
            case R.id.add_3_for_team_a:
                scoresTeamA = scoresTeamA + 3;
                displayForTeamA(scoresTeamA);

                break;
            case R.id.add_1_for_team_b:
                scoresTeamB = scoresTeamB + 1;
                displayForTeamB(scoresTeamB);

                break;
            case R.id.add_2_for_team_b:
                scoresTeamB = scoresTeamB + 2;
                displayForTeamB(scoresTeamB);

                break;
            case R.id.add_3_for_team_b:
                scoresTeamB = scoresTeamB + 3;
                displayForTeamB(scoresTeamB);

                break;
            case R.id.reset_button:
                scoresTeamA = 0;
                scoresTeamB = 0;
                displayForTeamA(scoresTeamA);
                displayForTeamB(scoresTeamB);

                break;
        }
    }

    public void displayForTeamA(int score) {
        scoresViewForTeamA.setText("" + score);
    }

    public void displayForTeamB(int score) {
        scoresViewForTeamB.setText("" + score);
    }
}
