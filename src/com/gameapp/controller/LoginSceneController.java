/*Creación del paquete, con esta línea indico que la Clase LoginSceneController
esta dentro del paquete com.gameapp.controller*/
package com.gameapp.controller;

// Importación de las librerias
import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.MessageUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/** 
 * Public Pública, 
 * class clase, 
 * LoginSceneController nombre que le estamos dando a la clase que contrendra 
 * la primera pantalla de nuestro juego donde se podra loguear el jugador
 *   
 */
public class LoginSceneController {

    @FXML /*@FXML esta anotación indica que el elemento que aparece a continuación está
    asociado a algún elmento del archivo FXML*/
    private Button startGamebtn; //Creación del Botón para iniciar el juego

    @FXML /*@FXML esta anotación indica que el elemento que aparece a continuación está
    asociado a algún elmento del archivo FXML*/
    private TextField userNameInput;//Creación del la caja de texto donde el jugador ingresará su nombre

    @FXML /*@FXML esta anotación indica que el elemento que aparece a continuación está
    asociado a algún elmento del archivo FXML*/
    /*Método cerrar en este se definen las acciones que se realizarán al presionar el 
    botón cerrar que estará en la pantalla de inicio del juego*/ 
    private void close(ActionEvent event) {
        
        /**MessageUtility.showMessage(Alert.AlertType.INFORMATION indica que se presentara un mensaje de tipo alerta
        *ConstantsUtility.CLOSE_MESSAGE_TITLE  llamando el mensaje 
        * "Se cerrará la ventana" que se presentará como titulo en el mensaje de Alerta este mensaje se encuentra definido
        * en el paquete  com.gameapp.utility en la clase ConstantsUtility.java
        *ConstantsUtility.CLOSE_MESSAGE_CONTENT llamando el mensaje "Gracias por jugar hasta una proxima ocación" 
        que se presentara en cuerpo del mensaje de alerta, este mensaje se encuentra definido en el paquete
        * com.gameapp.utility en la clase ConstantsUtility.java
        */
        MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CLOSE_MESSAGE_TITLE,
                ConstantsUtility.CLOSE_MESSAGE_CONTENT);
        //Ejecuta el método salir del sistema
        System.exit(0);
    }

}
