package com.example.test01;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private int milanScore = 0, madridScore = 0;

    @FXML
    private Label label_result;
    @FXML
    private Label label_lastScorer;
    @FXML
    private Label label_winner;

    @FXML
    protected void onMilan() {
        milanScore++;
        label_result.setText("Result: " + milanScore + " X " + madridScore);
        label_lastScorer.setText("Last Scorer: AC Milan");
        whoIsWinner();
    }

    @FXML
    protected void onMadrid() {
        madridScore++;
        label_result.setText("Result: " + milanScore + " X " + madridScore);
        label_lastScorer.setText("Last Scorer: Real Madrid");
        whoIsWinner();
    }

    protected void whoIsWinner(){
        if (madridScore > milanScore) label_winner.setText("Winner: Real Madrid");
        else if (madridScore < milanScore) label_winner.setText("Winner: AC Mialn");
        else label_winner.setText("Winner: DRAW");
    }

}