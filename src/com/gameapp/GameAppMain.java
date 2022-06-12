package com.gameapp;

//Comentario camilo


import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.MessageUtility;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GameAppMain extends Application {

    private Scene main;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        this.primaryStage = primaryStage;
        this.primaryStage.initStyle(StageStyle.UNDECORATED);

        URL url = new File(ConstantsUtility.ROOT_SCENE).toURI().toURL();

        Pane root = FXMLLoader.load(url);
        Button startGameBtn = (Button) root.getChildren().get(0);
        startGameBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    startGame(event);
                } catch (IOException ex) {
                    Logger.getLogger(GameAppMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        main = new Scene(root);
        this.primaryStage.setScene(main);
        this.primaryStage.show();
    }

    public void startGame(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();

        TextField userName = (TextField) getMain().getRoot().getChildrenUnmodifiable().get(1);
        if (!userName.getText().trim().equalsIgnoreCase("") || !userName.getText().trim().isEmpty()) {
            URL url = new File(ConstantsUtility.SECOND_SCENE).toURI().toURL();
            Pane scene2 = loader.load(url);
            Label userNameLabel = (Label) scene2.getChildren().get(0);
            userNameLabel.setText(userName.getText());

            main = new Scene(scene2);
            primaryStage.centerOnScreen();
            primaryStage.setScene(main);
            primaryStage.show();
        } else {
            MessageUtility.showMessage(Alert.AlertType.INFORMATION, "Ingrese un nombre de usuario",
                    "Ingrese un nombre de usuario");
        }

    }

    public Scene getMain() {
        return main;
    }

    public void setMain(Scene main) {
        this.main = main;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
