/*Creación del paquete, con esta línea indico que la Clase ScoreSceneController
esta dentro del paquete com.gameapp.controller*/
package com.gameapp.controller;

// Importación de las librerias
import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.MessageUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/** 
 * Public Pública, 
 * class clase, 
 * ScoreSceneController nombre que le estamos dando a la clase que contrendra 
 * la pantalla al finalizar el juego de nuestro juego donde se podra loguear el jugador
 *   
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
