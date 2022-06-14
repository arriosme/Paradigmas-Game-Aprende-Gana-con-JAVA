package com.gameapp.utility;

/**
 * Repositorio de variables globales estáticas.Conjunto de textos requeridos para la ejecución del programa.
 */
public class ConstantsUtility {
    public static final String QUESTIONS_FILE_PATH = "data/questions.csv";
    public static final String ROOT_SCENE = "src/com/gameapp/view/LoginScene.fxml";
    public static final String SECOND_SCENE = "src/com/gameapp/view/SecondScene.fxml";
    public static final String SCORE_SCENE = "src/com/gameapp/view/ScoreScene.fxml";

    public static final String INCORRECT_MESSAGE_TITLE = "La respuesta no es correcta";
    public static final String INCORRECT_MESSAGE_CONTENT = "Lo lamento la respuesta es incorrecta, acumulo solo ";

    public static final String CORRECT_MESSAGE_TITLE = "Felicitaciones";
    public static final String CORRECT_MESSAGE_CONTENT = "Felicitaciones ha ganado ";

    public static final String CLOSE_MESSAGE_TITLE = "Se cerrará la ventana";
    public static final String CLOSE_MESSAGE_CONTENT = "Gracias por jugar hasta una proxima ocación";

    public static final int UMBRAL_HARD_QUESTIONS = 13;
}
