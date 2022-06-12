package com.gameapp.controller;
/**
 * Documentar por Antony
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

public class SecondSceneController implements Initializable {

    @FXML
    private Label userNameLabel;

    @FXML
    private Label score;

    @FXML
    private Label questionTxt;

    @FXML
    private Label index;

    @FXML
    private Button option1;

    @FXML
    private Button option2;

    @FXML
    private Button option3;

    @FXML
    private Button option4;

    private Player player;
    private int indexQuestion;
    private List<Question> questions;
    private FileReaderUtility util;

    /**
     * 
     * @param event 
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        util = new FileReaderUtility();
        setIndexQuestion(1);
        loadQuestions();
        score.setText("0");
        player = new Player(userNameLabel.getText(), 0, 0);
    }

    public void checkOption(int optionIndex) {
        boolean isCorrect = false;

        if (getQuestions().get(getIndexQuestion() - 1).getAnswerIndex() == optionIndex) {
            isCorrect = true;
        }

        if (isCorrect) {
            MessageUtility.showMessage(Alert.AlertType.INFORMATION, ConstantsUtility.CORRECT_MESSAGE_TITLE,
                    ConstantsUtility.CORRECT_MESSAGE_CONTENT +
                            getQuestions().get(getIndexQuestion() - 1).getAnswerScore() + " puntos");
            changePlayerScore();
            if (getIndexQuestion() == getQuestions().size()) {
                clear();
                endGame();
            } else {
                setIndexQuestion(getIndexQuestion() + 1);
                changeQuestion();
            }
        } else {
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

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getIndexQuestion() {
        return indexQuestion;
    }

    public void setIndexQuestion(int indexQuestion) {
        this.indexQuestion = indexQuestion;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    private void clear() {
        option1.setOnAction(null);
        option2.setOnAction(null);
        option3.setOnAction(null);
        option4.setOnAction(null);
    }

    private void endGame() {
        clear();
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
