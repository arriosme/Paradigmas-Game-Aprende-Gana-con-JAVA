package com.gameapp.controller;
/**
 * Importación de clases requeridas
 */
import com.gameapp.model.Player;
import com.gameapp.model.Question;
import com.gameapp.utility.ConstantsUtility;
import com.gameapp.utility.FileReaderUtility;
import com.gameapp.utility.MessageUtility;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Creación de la clase para los controles visuales
 */
public class SecondSceneController implements Initializable {

    @FXML
    private Label userNameLabel; // Interfaz gráfica: Etiqueta de nombre de usuario

    @FXML
    private Label score; // Interfaz gráfica: Etiqueta de puntaje

    @FXML
    private Label questionTxt; // Interfaz gráfica: Etiqueta de pregunta

    @FXML
    private Label index; // Interfaz gráfica: Etiqueta de índice

    @FXML
    private Button option1; // Interfaz gráfica: Botón de respuesta 1

    @FXML
    private Button option2; // Interfaz gráfica: Botón de respuesta 2

    @FXML
    private Button option3; // Interfaz gráfica: Botón de respuesta 3

    @FXML
    private Button option4; // Interfaz gráfica: Botón de respuesta 4

    private Player player; // Propiedad de jugador
    private int indexQuestion; // Índice de pregunta
    private List<Question> questions; // Arreglo de preguntas
    private FileReaderUtility util; // lector

    /**
     * 
     * @param event 
     */
    /**
     * Cerrar ventana
     */
    @FXML
    private void close(ActionEvent event) {
        MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CLOSE_MESSAGE_TITLE,
                ConstantsUtility.CLOSE_MESSAGE_CONTENT);
        System.exit(0);
    }
    /**
     * 
     * @param url
     * @param rb 
     */
    /**
     * Inicializar: 
     * -Índice 
     * -Carga de preguntas
     * -Iniciar puntaje en 0
     * -Inicia el jugador
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        util = new FileReaderUtility();
        setIndexQuestion(1);
        loadQuestions();
        score.setText("0");
        player = new Player(userNameLabel.getText(), 0, 0);
    }

    public void checkOption(int optionIndex) {
        boolean isCorrect = false; // Variable de verifición de pregunta correcta seleccionada

        if (getQuestions().get(getIndexQuestion() - 1).getAnswerIndex() == optionIndex) {
            isCorrect = true;   // Se cambia variable de verificación a verdadero si se
                                // selecciona la opción completa
        }

        if (isCorrect) {
            /**
             * Secuencia de acciones que se ejecutan en caso de que la respuesta seleccionada sea correcta
             */
            MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CORRECT_MESSAGE_TITLE,
                    ConstantsUtility.CORRECT_MESSAGE_CONTENT +
                            getQuestions().get(getIndexQuestion() - 1).getAnswerScore() + " puntos");
                                // En caso de que la respuesta sea correcta, muestra el puntaje parcial

            changePlayerScore();
            /**
             * Se evalúa si el juego llegó al máximo de preguntas
             */
            if (getIndexQuestion() == getQuestions().size()) {
                /**
                 * Secuencia de acciones para dar por terminado el juego
                 */
                clear(); // Limpia las opciones en las preguntas
                endGame(); // Termina el juego
            } else {
                /**
                 * Secuencia de acciones para continuar con la siguiente pregunta
                 */
                setIndexQuestion(getIndexQuestion() + 1); // Aumenta el índice en 1, pasa a siguiente pregunta
                changeQuestion(); // Cambia de pregunta
            }
        } else {
            /**
             * Secuencia de acciones que se ejecutan en caso de que la respuesta seleccionada sea incorrecta
             */
            MessageUtility.showMessage(Alert.AlertType.ERROR,
                    ConstantsUtility.INCORRECT_MESSAGE_TITLE,
                    ConstantsUtility.INCORRECT_MESSAGE_CONTENT + player.getScore() + " puntos");
            System.exit(0);// finaliza el programa
        }

    }

    private void loadQuestions() {
        if (getQuestions() == null) {
            setQuestions(util.loadQuestions(ConstantsUtility.QUESTIONS_FILE_PATH));
        } else {
            setIndexQuestion(getIndexQuestion() + 1);
        }
        changeQuestion();
    }

    private void changeQuestion() {
        Question tmp = getQuestions().get(getIndexQuestion() - 1);

        questionTxt.setText(tmp.getQuestionText());
        questionTxt.wrapTextProperty().set(true);
        option1.wrapTextProperty().set(true);
        option2.wrapTextProperty().set(true);
        option3.wrapTextProperty().set(true);
        option4.wrapTextProperty().set(true);
        
        option1.setText(tmp.getOptionsText()[0]);
        option1.setOnAction((event) -> {
            checkOption(1);
        });
        option2.setText(tmp.getOptionsText()[1]);
        option2.setOnAction((event) -> {
            checkOption(2);
        });
        option3.setText(tmp.getOptionsText()[2]);
        option3.setOnAction((event) -> {
            checkOption(3);
        });
        option4.setText(tmp.getOptionsText()[3]);
        option4.setOnAction((event) -> {
            checkOption(4);
        });
        index.setText(getIndexQuestion() + "");

        
    }

    private void changePlayerScore() {
        player.setScore(player.getScore() + getQuestions().get(getIndexQuestion() - 1).getAnswerScore());
        player.setUserName(userNameLabel.getText());
        score.setText(player.getScore() + "");
    }

    public Player getPlayer() {
        return player;
    }

    /**
     * Función para configurar el jugador
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Función que retorna el índice de la pregunta
     */
    public int getIndexQuestion() {
        return indexQuestion;
    }

    /**
     * Función para configurar el índice de las preguntas
     */
    public void setIndexQuestion(int indexQuestion) {
        this.indexQuestion = indexQuestion;
    }

    /**
     * Función que retorna la lista de preguntas
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * Función para configurar preguntas
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * Función limpiadora de opciones de pregunta: Setea todo en 'null'
     */
    private void clear() {
        option1.setOnAction(null);
        option2.setOnAction(null);
        option3.setOnAction(null);
        option4.setOnAction(null);
    }

    /**
     * Función para declarar por terminada la partida
     */
    private void endGame() {
        clear(); // Limpia las opciones en las preguntas
        URL url;
        try {
            url = new File(ConstantsUtility.SCORE_SCENE).toURI().toURL();
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ex) {
            Logger.getLogger(SecondSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
