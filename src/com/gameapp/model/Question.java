package com.gameapp.model;  //agregamos el paquete general de los archivos del juego

/**
 * Esta clase es para crear objetos de tipo pregunta
 * @author Jhonny Zambrano Saavedra
 * @version 1.0
*/

public class Question {  //Clase Question para estructurar las preguntas
    //variables solo disponibles dentro de la clase
    
    private int questionIndex;          //Variable para identificar la pregunta              
    private String questionText;        //Variable para almacenar el texto de la pregunta
    private String[] optionsText;       //Variable para almacenar las opciones 
    private int answerIndex;            //Variable para identificar la respuesta
    private float answerScore;          //Variable para almacenar el puntaje 
    
    /**
    * Metodo constructor de la clase Question que recibe varios parametros
    * @param questionIndex Variable int para identificar la pregunta
    * @param questionText Variable String para almacenar el texto de la pregunta
    * @param optionsText Variable array String para almacenar las opciones 
    * @param answerIndex Variable int para identificar la respuesta
    * @param answerScore Variable float para almacenar el puntaje
    */

    public Question(int questionIndex, String questionText, String[] optionsText, int answerIndex, float answerScore) {  //Metodo constructor de objetos tipo pregunta
                                                                                                                         //Recibe los parametros para actualizar los valores de las variables anteriormente declaradas dentro de la clase
        this.questionIndex = questionIndex;
        this.questionText = questionText;
        this.optionsText = optionsText;
        this.answerIndex = answerIndex;
        this.answerScore = answerScore;
    }
    
    
    /**
     * Metodo getter para consultar la variable 
     * @return questionIndex tipo int
     */
    public int getQuestionIndex() {     //Retorna un entero
        return questionIndex;
    }
    /**
     * Metodo getter para consultar la variable 
     * @return questionText tipo String
     */
    public String getQuestionText() {   //Retorna una cadena de texto
        return questionText;
    }
    /**
     * Metodo getter para consultar la variable 
     * @return optionsText tipo array String
     */
    public String[] getOptionsText() {  //Retorna una cadena de texto
        return optionsText;
    }
    /**
     * Metodo getter para consultar la variable 
     * @return answerIndex tipo entero
     */
    public int getAnswerIndex() {       //Retorna un entero
        return answerIndex;
    }
    /**
     * Metodo getter para consultar la variable 
     * @return answerScore tipo float
     */
     public float getAnswerScore() {    //Retorna un numero con decimal
        return answerScore;
    }
     
     
     
     
    //Metodos "setters" para modificar el valor de estas variables desde fuera de la clase Question
     
     
    /**
     * Metodo setter para modificar la variable 
     * @param questionIndex recibe tipo int
     */
    public void setQuestionIndex(int questionIndex) {   //Recibe como parametro un entero
        this.questionIndex = questionIndex;
    }
    
    /**
     * Metodo setter para modificar la variable 
     * @param questionText recibe tipo String
     */
    public void setQuestionText(String questionText) {  //Recibe como parametro una cadena de texto
        this.questionText = questionText;
    }
    
    /**
     * Metodo setter para modificar la variable 
     * @param optionsText recibe tipo array String
     */
    public void setOptionsText(String[] optionsText) {  //Recibe como parametro una cadena de texto
        this.optionsText = optionsText;
    }
    
    /**
     * Metodo setter para modificar la variable 
     * @param answerIndex recibe tipo int
     */
    public void setAnswerIndex(int answerIndex) {       //Recibe como parametro un entero
        this.answerIndex = answerIndex;
    }
    
    /**
     * Metodo setter para modificar la variable 
     * @param answerScore recibe tipo float
     */
    public void setAnswerScore(float answerScore) {     //Recibe como parametro un numero con decimal
        this.answerScore = answerScore;
    }

    @Override   //Esta instruccion se usa para confirmar que se esta sobreescribiendo correctamente un metodo de la clase padre, en este caso el metodo toString
    
    
    /**
    * Esta metodo que retorna una cadena de texto con toda la informacion del objeto Question que haya sido creado
    * ejem:  Question{questionIndex=1,questionText=Que es Java?, respuesta1,respuesta2,respuesta3,respuesta4, answerIndex=2, answerScore=150}
    * @return String el tipo de dato que retorna es una cadena de texto
    */
    public String toString() {    
        return "Question{" + "questionIndex=" + questionIndex + ", questionText=" + questionText + ", optionsText="
                + optionsText + ", answerIndex=" + answerIndex + ", answerScore=" + answerScore + '}';
    }

}
