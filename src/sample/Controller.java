/*
Erstellt von Georg Müllecker am 11.11.2020
Das Programm rechnet einen Euro Wert in einen Dollar Wert um
 */
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private double kursDollarUndEuro= 1.18;

    @FXML private TextField txt_Eu;
    @FXML private TextField txt_Do;
    public void berechneWert(){
        double geldeinheit= Double.parseDouble(txt_Eu.getText());
        geldeinheit=geldeinheit*kursDollarUndEuro;
        txt_Do.setText(String.valueOf(geldeinheit));

    }
}
