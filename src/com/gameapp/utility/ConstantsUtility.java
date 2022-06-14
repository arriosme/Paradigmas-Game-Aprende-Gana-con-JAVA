package com.gameapp.utility;

/**
 * Repositorio de variables globales estáticas.Conjunto de textos requeridos para la ejecución del programa.
 */
public class ConstantsUtility {
    public static final String QUESTIONS_FILE_PATH = "data/questions.csv"; // Dirección de preguntas
    public static final String ROOT_SCENE = "src/com/gameapp/view/LoginScene.fxml"; // Vista de la pantalla principal
    public static final String SECOND_SCENE = "src/com/gameapp/view/SecondScene.fxml"; // Vista de la pantalla secundaria
    public static final String SCORE_SCENE = "src/com/gameapp/view/ScoreScene.fxml"; // Vista del puntaje

    public static final String INCORRECT_MESSAGE_TITLE = "La respuesta no es correcta"; // Título de ventana con mensaje de respuesta incorrecta
    public static final String INCORRECT_MESSAGE_CONTENT = "Lo lamento la respuesta es incorrecta, acumulo solo "; // Mensaje de Game-Over

    public static final String CORRECT_MESSAGE_TITLE = "Felicitaciones"; // Título de ventana con mensaje de respuesta correcta 
    public static final String CORRECT_MESSAGE_CONTENT = "Felicitaciones ha ganado "; // Mensaje de respuesta correcta 

    public static final String CLOSE_MESSAGE_TITLE = "Se cerrará la ventana"; // Título de ventana con mensaje de cierre
    public static final String CLOSE_MESSAGE_CONTENT = "Gracias por jugar hasta una proxima ocación"; // Mensaje de cierre

    public static final int UMBRAL_HARD_QUESTIONS = 13;
}
