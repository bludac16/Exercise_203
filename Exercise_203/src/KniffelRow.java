/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class KniffelRow {
    private int auswahl;
    private int punkte;

    public KniffelRow(int auswahl, int punkte) {
        this.auswahl = auswahl;
        this.punkte = punkte;
    }

    public int getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(int auswahl) {
        this.auswahl = auswahl;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }
    
    
}
