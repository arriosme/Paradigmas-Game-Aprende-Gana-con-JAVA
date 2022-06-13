/*Creación del paquete, con esta línea indico que la Clase Player
esta dentro del paquete com.gameapp.model*/
package com.gameapp.model;

/**
 *Creación de la clase jugador "public class Player {}"
 * después de la llave abierta { crearemos sus atributos y métodos y terminaremos al cerrar la llave }
 */
public class Player {

    /*Declarando la variable o atributo userName Nombre de usuario para la clase jugador 
    String indica que esta variable es de tipo Cadena de caracteres
    private indica que esta variabel o atribuo es propio o visible solo para la clase jugador*/
    private String userName;
    
    private float score;
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
