/**
*Creación del paquete, con esta línea indico que la Clase ScoreSceneController
*esta dentro del paquete com.gameapp.controller
*/
package com.gameapp.controller;
/**
 * Importación de la clase ConstantsUtility del paquete com.gameapp.utility
 */
import com.gameapp.utility.ConstantsUtility;
/**
 * Importación de la clase MessageUtility del paquete com.gameapp.utility
 */
import com.gameapp.utility.MessageUtility;
/**
 * Importación de las librerias de javafx
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/** 
 * Public Pública, 
 * class clase, 
 * ScoreSceneController nombre que le estamos dando a la clase que contrendra 
 * la pantalla de inicio el juego donde se podra loguear cada jugador
  */
public class ScoreSceneController {
    /** 
     * @FXML esta anotación indica que el elemento que aparecerá a continuación en el código está
     * asociado a algún elemento del archivo FXML
     */
    @FXML 
    
    /**
     * Creación del Botón para finalizar el juego
     */
    private Button endGame;
    
    @FXML 
    
    /**
     * Método que ejecutara el botón finalizar el juego, en este se definen las acciones que se realizarán 
     * al presionar dicho botón 
    */
    private void handleButtonAction(ActionEvent event) {
        
        /**MessageUtility.showMessage(Alert.AlertType.INFORMATION indica que se presentara un mensaje de tipo alerta
            * ConstantsUtility.CLOSE_MESSAGE_TITLE  llamando el mensaje 
            * "Se cerrará la ventana" que se presentará como titulo en el mensaje de Alerta este mensaje se encuentra definido
            * en el paquete  com.gameapp.utility en la clase ConstantsUtility.java
            * ConstantsUtility.CLOSE_MESSAGE_CONTENT llamando el mensaje "Gracias por jugar hasta una proxima ocación" 
            * que se presentara en cuerpo del mensaje de alerta, este mensaje se encuentra definido en el paquete
            * com.gameapp.utility en la clase ConstantsUtility.java
            */
        MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CLOSE_MESSAGE_TITLE,
                ConstantsUtility.CLOSE_MESSAGE_CONTENT);
        
        /**
         * Ejecuta el método salir del sistema
         */
        System.exit(0);
    }

}
