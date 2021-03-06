package com.gameapp.utility;

import javafx.scene.control.Alert;

public class MessageUtility {

    public static void showMessage(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
