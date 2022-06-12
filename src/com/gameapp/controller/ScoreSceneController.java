package com.gameapp.controller;

import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.MessageUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * Voy a documentar ScoreScene 
 * Creando un clase pública ensayo conmit
 */

public class ScoreSceneController {

    @FXML
    private Button endGame;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CLOSE_MESSAGE_TITLE,
                ConstantsUtility.CLOSE_MESSAGE_CONTENT);
        System.exit(0);
    }

}
