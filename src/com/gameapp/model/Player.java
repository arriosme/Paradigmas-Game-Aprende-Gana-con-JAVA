/*Creación del paquete, con esta línea indico que la Clase Player
esta dentro del paquete com.gameapp.model*/
package com.gameapp.model;

/**
 *Creación de la clase jugador "public class Player {}"
 * después de la llave abierta { crearemos sus atributos y métodos y terminaremos al cerrar la llave }
 */
public class Player {

    /*Declarando la variable o atributo userName que almacenará el Nombre de usuario jugador 
    String indica que esta variable es de tipo Cadena de caracteres
    private indica que esta variabel o atribuo es propio o visible solo para la clase jugador*/
    private String userName;
    
    /*Declarando la variable o atributo score que almacenará el Puntaje para el usuario jugador 
      float indica que esta variable almacenará un número entero con decimales
    private indica que esta variable o atribuo es propio o visible solo para la clase jugador*/
    private float score;
    
    /*Declarando la variable o atributo lastIndex que almacenará el último Puntaje para el usuario jugador 
      in indica que esta variable almacenará un número entero private indica que esta variable o atributo 
    es propio o visible solo para la clase jugador*/
    private int lastIndex;

    public Player(String userName, float score, int lastIndex) {
        this.userName = userName;
        this.score = score;
        this.lastIndex = lastIndex;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

}
