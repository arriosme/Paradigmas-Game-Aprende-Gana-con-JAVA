package com.gameapp.utility;

/**
 *Comienzo con la importacion del paquete gameapp.utility
 */

//inicio construccion del codigo
import javafx.scene.control.Alert; // Importación del paquete javafx a la clase

public class MessageUtility {

    public static void showMessage(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type); //se crea una nueva variable alert
        alert.setTitle(title); // se usa la variable alert y se le agrega el metodo .setTittle para asignar un titulo
        alert.setContentText(content);
        alert.showAndWait();
    }

}
