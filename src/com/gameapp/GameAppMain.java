package com.gameapp;   //agregamos el paquete general de los archivos del juego

import com.gameapp.utility.ConstantsUtility;        //Agregamos paquete donde se almacenan el texto de los mensajes 
import com.gameapp.utility.MessageUtility;          //Agregamos paquete donde se reproducen los mensajes
import java.io.File;                                //Libreria para acceder a archivos con su respectiva ruta
import java.io.IOException;                         //Libreria para capturar errores al abrir archivos inexistentes
import java.net.URL;                                //Libreria para acceder a recursos desde una URL                  
import java.util.logging.Level;                     //Libreria con metodos para registrar datos
import java.util.logging.Logger;                    //Libreria para rastrear errores generados por objetos especificos

import javafx.application.Application;              //Librerias del JavaFx, plataforma para desarrollar interfaces en aplicaciones para cualquier plataforma
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

public class GameAppMain extends Application {    //La clase GameAppMain hereda atributos y metodos de la clase Application

    private Scene main;                           //variable main de tipo Scene, para contener toda la parte grafica
    private Stage primaryStage;                   //variable primaryStage de tipo Stage para almacenar los estilos, fondo, texto etc, de la primer escena

    @Override
    public void start(Stage primaryStage) throws Exception {     //Metodo start para ejecutar la primer pantalla del juego, captura errores en su ejecucion
        FXMLLoader loader = new FXMLLoader();                    //FXMLLoader carga un objeto de tipo XML, datos almacenados
        this.primaryStage = primaryStage;                        //Cargamos el parametro recibido a nuestra variable primaryStage
        this.primaryStage.initStyle(StageStyle.UNDECORATED);     //Define fondo blanco solido, sin decoraciones

        URL url = new File(ConstantsUtility.ROOT_SCENE).toURI().toURL();  //Cargamos el arhivo de la primer escena, la ruta de este archivo esta en la variable ROOT_SCENE, contenida en ConstantsUtility.java

        Pane root = FXMLLoader.load(url);                           //Pasamos la url al FXMLLoader
        Button startGameBtn = (Button) root.getChildren().get(0);   //Creamos un objeto tipo Boton para "empezar juego"
        
        startGameBtn.setOnAction(new EventHandler<ActionEvent>() {  //Agregamos la funcionalidad al boton
            @Override
            public void handle(ActionEvent event) {                 //Si se pulsa el boton, llamamos al metodo startGame
                try {
                    startGame(event);
                } catch (IOException ex) {                          //Capturamos posibles errores por buenas practicas
                    Logger.getLogger(GameAppMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        main = new Scene(root);               //cargamos la escena principal con el FXMLLoader que contiene la ruta del archivo a visualizar
        this.primaryStage.setScene(main);     //pasamos el main al escenario principal
        this.primaryStage.show();             //se visualiza
    }

    public void startGame(ActionEvent event) throws IOException {     //Metodo para empezar la ronda de preguntas

        FXMLLoader loader = new FXMLLoader();                         //De nuevo creamos un objeto para cargar XML

        TextField userName = (TextField) getMain().getRoot().getChildrenUnmodifiable().get(1);      //Cargamos el valor del campo de texto llamado "userName" donde el usuario debio ingresar su nombre
        if (!userName.getText().trim().equalsIgnoreCase("") || !userName.getText().trim().isEmpty()) { //Comprobamos que la casilla tenga un nombre, que no este vacia
            URL url = new File(ConstantsUtility.SECOND_SCENE).toURI().toURL();                         //Si no esta vacia entonces cargamos la URL de la segunda pantalla o segunda escena         
            Pane scene2 = loader.load(url);
            Label userNameLabel = (Label) scene2.getChildren().get(0);                                 //Pasamos el nombre del usuario para que se visualice quien esta jugando en todo momento
            userNameLabel.setText(userName.getText());

            main = new Scene(scene2);                                                                  //Ahora la escena 2 para a ser la escena principal
            primaryStage.centerOnScreen();                                                             //Se centra en pantalla
            primaryStage.setScene(main);                                                               //Se carga
            primaryStage.show();                                                                       //Se visualiza en pantalla         
        } 
            else {                                                                                     //Si no se ha ingresado nombre de usuario, entonces se muestra un error en pantalla y no carga la escena 2   
            MessageUtility.showMessage(Alert.AlertType.INFORMATION, "Ingrese un nombre de usuario",
                    "Ingrese un nombre de usuario");
        }

    }

    public Scene getMain() {                        //Metodo getter para obtener el valor de main desde fuera de la clase
        return main;
    }

    public void setMain(Scene main) {              //Metodo setter para modificar el valor de main desde fuera de la clase y controlar lo que se muestra en pantalla
        this.main = main;
    }

    public static void main(String[] args) {       //Metodo main principal
        launch(args);
    }
}
