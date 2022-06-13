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
    private indica que esta variable o atributo es propio o visible solo para la clase jugador*/
    private String userName;
    
    /*Declarando la variable o atributo score que almacenará el Puntaje para el usuario jugador 
      float indica que esta variable almacenará un número entero con decimales
    private indica que esta variable o atributo es propio o visible solo para la clase jugador*/
    private float score;
    
    /*Declarando la variable o atributo lastIndex que almacenará el último Puntaje para el usuario jugador 
      in indica que esta variable almacenará un número entero 
    private indica que esta variable o atributo es propio o visible solo para la clase jugador*/
    private int lastIndex;
    
    /* public Player () Método constructor para crear el objeto jugador, en nuestro juego pueden existir varios jugadores
    public indica que este método es de acceso para todos los jugadores
    (String userName, float score, int lastIndex) entre los parentesis del métod estamos
    definiendo los paramétros que tendra cada jugador cuando se llame este método*/
    public Player(String userName, float score, int lastIndex) {
        /* En esta parte se esta realizando la Inicialización de los valores que tendría cada atributo del objeto jugador
        userName, score y lastIndex*/
                
        this.userName = userName;
        this.score = score;
        this.lastIndex = lastIndex;
        /** en las anteriores líneas se uso la palabra clave this que en java se usa para eliminar la ambiguedad y  hacer referencia al objeto actual 
        *cuyo método esta siendo invocado en este código se usa para inicializar las variables de cada jugador:
            * this.userName = userName; refirirse al valor actual del nombre usuario que me llegue por cada cada jugador
            * this.score = score; refirirse al valor actal del puntaje que ira obteniendo cada jugador 
            * this.lastIndex = lastIndex; refirirse al valor actual del último puntaje que obtuvo cada jugador  */
    }
    //Método get para el atributo UserName sirve para mostrar el valor que tiene este atributo
    //public es el modificador del método que indica que lo podemos mostrar o modificar desde fuera de la clase 
    public String getUserName() {
        return userName;
    }

    //Método set para modificar el valor del atributo UserName sirve para modificar el valor que tiene este atributo
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
