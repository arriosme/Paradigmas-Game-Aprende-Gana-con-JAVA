/**
 * Creación del paquete, con esta línea indico que la Clase Player
 * esta dentro del paquete com.gameapp.model
 */
package com.gameapp.model;

/**
<<<<<<< HEAD
 * Creación de la clase jugador "public class Player {}" después de la llave abierta 
 * { crearemos sus atributos y métodos y terminaremos al cerrar la llave }
=======
 * Esta clase represnta un jugador con los atributos nombre de usuario, puntaje acumulado y última pregunta contestada correctamente
 * @author arley
 * @version 2.0
>>>>>>> 02-SecondScene-Constants
 */
public class Player {//llave de apertura de la Clase Player

    /**
     * Declaranción de la variable o atributo userName que almacenará el Nombre de usuario jugador
     * String indica que esta variable es de tipo Cadena de caracteres
     * private indica que esta variable o atributo es propio o visible solo para la clase jugador
     */
    private String userName;
    
    /** 
     * Declaranción de la variable o atributo score que almacenará el Puntaje para el usuario jugador 
     * float indica que esta variable almacenará un número entero con decimales
     * private indica que esta variable o atributo es propio o visible solo para la clase jugador
     */
    private float score;
    
    /**
     * Declaranción de la variable o atributo lastIndex que almacenará el último Puntaje para el usuario jugador 
     * int indica que esta variable almacenará un número entero
     * private indica que esta variable o atributo es propio o visible solo para la clase jugador
     */
    private int lastIndex;
    
    /**
     * public Player () Método constructor para crear el objeto jugador, en nuestro juego pueden existir varios jugadores
     * public indica que este método es de acceso para todos los jugadores
     * (String userName, float score, int lastIndex) entre los parentesis del método constructor estamos
     * definiendo los paramétros que tendra cada jugador cuando se llame este método
     */
    public Player(String userName, float score, int lastIndex) {//llave de apertura del método constructor Player
        
        /**
         * En esta parte se esta realizando la Inicialización de los valores que tendría cada atributo userName,
         * score y lastIndex para cada objeto jugador
          */
        this.userName = userName;
        this.score = score;
        this.lastIndex = lastIndex;
<<<<<<< HEAD
        /** 
        * en varias lineas del código para dentro de los metodos get y set se usa la palabra clave this, que en java 
	* sirve para eliminar la ambiguedad y hacer referencia al objeto actual cuyo método esta siendo invocado; 
	* en este código se usa para inicializar las variables de cada jugador que ingrese al juego asi:
        * this.userName = userName; se usa el this para referirse al valor actual que tiene el atributo nombre usuario 
        * this.score = score; se usa el this para referirse al valor actual del puntaje que ira obteniendo cada jugador 
        * this.lastIndex = lastIndex; se usa el this para referirse al valor actual del último puntaje que obtuvo cada jugador
        */
    }//llave de cierre del método constructor Player
    
    /**
     * Método get para el atributo UserName sirve para mostrar el valor que tiene el atributo nombre usuario jugador
     * public es el modificador del método que indica que lo podemos mostrar o modificar desde fuera de la clase
     */ 
    public String getUserName() {//llave de apertura del método getUserName()
=======
    }
/**
 * 
 * @return 
 */
    public String getUserName() {
>>>>>>> 02-SecondScene-Constants
        return userName;
    }//llave de cierre del método getUserName()

    /**
     * Método set para modificar el valor del atributo UserName sirve para modificar el valor que tiene este atributo
     * @param userName 
     */
    public void setUserName(String userName) {//llave de apertura del método setUserName()
        this.userName = userName;
    }//llave de cierre del método setUserName()
    
    /**
     * Método get para el atributo Score sirve para mostrar el valor que tiene el atributo puntaje del jugador
     * public es el modificador del método que indica que lo podemos mostrar o modificar desde fuera de la clase
     */
    public float getScore() {//llave de apertura del método getScore()
        return score;
    }//llave de cierre del método getScore()
    
    /**
     * Método set para modificar el valor del atributo Score sirve para modificar el valor que tiene este atributo
     */
    public void setScore(float score) {//llave de apertura del método setScore()
        this.score = score;
    }//llave de cierre del método setScore()
    
    /**
     * Método get para el atributo LastIndex sirve para mostrar el valor que tiene el atributo ultimo puntaje del jugador
     * public es el modificador del método que indica que lo podemos mostrar o modificar desde fuera de la clase
     */
    public int getLastIndex() {//llave de apertura del método getLastIndex()
        return lastIndex;
    }//llave de cierre del método getLastIndex()

    /**
     * Método set para modificar el valor del atributo LastIndex sirve para modificar el valor que tiene este atributo
     */
    public void setLastIndex(int lastIndex) {//llave de apertura del método setLastIndex()
        this.lastIndex = lastIndex;
    }//llave de cierre del método setLastIndex()

}//llave de cierre de la Clase Player