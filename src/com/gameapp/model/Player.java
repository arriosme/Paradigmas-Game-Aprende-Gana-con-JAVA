package com.gameapp.model;

/**
 * Esta clase represnta un jugador con los atributos nombre de usuario, puntaje acumulado y última pregunta contestada correctamente
 * @author arley
 * @version 2.0
 */
public class Player {

    /**
     * 
     */
    private String userName;
    private float score;
    private int lastIndex;

    public Player(String userName, float score, int lastIndex) {
        this.userName = userName;
        this.score = score;
        this.lastIndex = lastIndex;
    }
/**
 * 
 * @return 
 */
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
