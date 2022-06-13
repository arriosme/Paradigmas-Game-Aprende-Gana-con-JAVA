package com.gameapp.model;  //agregamos el paquete general de los archivos del juego

public class Question {  //Clase Question para estructurar las preguntas
    //variables solo disponibles dentro de la clase
    
    private int questionIndex;          //Variable para identificar la pregunta              
    private String questionText;        //Variable para almacenar el texto de la pregunta
    private String[] optionsText;       //Variable para almacenar las opciones 
    private int answerIndex;            //Variable para identificar la respuesta
    private float answerScore;          //Variable para almacenar el puntaje 

    public Question(int questionIndex, String questionText, String[] optionsText, int answerIndex, float answerScore) {  //Metodo constructor de objetos tipo pregunta
                                                                                                                         //Recibe los parametros para actualizar los valores de las variables anteriormente declaradas dentro de la clase
        this.questionIndex = questionIndex;
        this.questionText = questionText;
        this.optionsText = optionsText;
        this.answerIndex = answerIndex;
        this.answerScore = answerScore;
    }
    
    //Metodos "getters" para acceder al valor de estas variables desde fuera de la clase Question
    
    public int getQuestionIndex() {     //Retorna un entero
        return questionIndex;
    }
    public String getQuestionText() {   //Retorna una cadena de texto
        return questionText;
    }
    public String[] getOptionsText() {  //Retorna una cadena de texto
        return optionsText;
    }
    public int getAnswerIndex() {       //Retorna un entero
        return answerIndex;
    }
     public float getAnswerScore() {    //Retorna un numero con decimal
        return answerScore;
    }
     
     
    //Metodos "setters" para modificar el valor de estas variables desde fuera de la clase Question
     
    public void setQuestionIndex(int questionIndex) {   //Recibe como parametro un entero
        this.questionIndex = questionIndex;
    }

    public void setQuestionText(String questionText) {  //Recibe como parametro una cadena de texto
        this.questionText = questionText;
    }

    public void setOptionsText(String[] optionsText) {  //Recibe como parametro una cadena de texto
        this.optionsText = optionsText;
    }

    public void setAnswerIndex(int answerIndex) {       //Recibe como parametro un entero
        this.answerIndex = answerIndex;
    }

    public void setAnswerScore(float answerScore) {     //Recibe como parametro un numero con decimal
        this.answerScore = answerScore;
    }

    @Override   //Esta instruccion se usa para confirmar que se esta sobreescribiendo correctamente un metodo de la clase padre, en este caso el metodo toString
    
    public String toString() {   //Metodo que retorna una cadena de texto con toda la informacion del objeto Question que haya sido creado, ejem:  Question{questionIndex=1,questionText=Que es Java?, respuesta1,respuesta2,respuesta3,respuesta4, answerIndex=2, answerScore=150} 
        return "Question{" + "questionIndex=" + questionIndex + ", questionText=" + questionText + ", optionsText="
                + optionsText + ", answerIndex=" + answerIndex + ", answerScore=" + answerScore + '}';
    }

}
