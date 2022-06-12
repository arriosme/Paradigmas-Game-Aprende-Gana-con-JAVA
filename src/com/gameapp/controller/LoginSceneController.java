package com.gameapp.controller;
/**
 * Documentación por Adriana
 */
import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.MessageUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginSceneController {

    @FXML
    private Button startGamebtn;

    @FXML
    private TextField userNameInput;

    @FXML
    private void close(ActionEvent event) {
        MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CLOSE_MESSAGE_TITLE,
                ConstantsUtility.CLOSE_MESSAGE_CONTENT);
        System.exit(0);
    }

}
