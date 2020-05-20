package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Orarendterv;

public class Oc {
    @FXML
    private TextField targy;

    @FXML
    private TextField nap;

    @FXML
    private TextField evfolyam;

    @FXML
    private TextField osztaly;

    @FXML
    private Label eredmeny;

    private Orarendterv orarend;

    @FXML
    public void initialize() {
        orarend = new Orarendterv();
    }

    String targymentes;
    String napmentes;
    String evfolyammentes;
    String osztalymentes;


    public void targyhozzaad(javafx.event.ActionEvent actionEvent) {
        targymentes=orarend.kiirtargy(targy.getText());
    }

    public void naphozzaad(javafx.event.ActionEvent actionEvent) {
        napmentes=orarend.kiirnap(nap.getText());
    }

    public void evfolyamhozzaad(javafx.event.ActionEvent actionEvent) {
        evfolyammentes=orarend.kiirevfolyam(evfolyam.getText());
    }

    public void osztayhozzaad(javafx.event.ActionEvent actionEvent) {
        osztalymentes=orarend.kiirosztaly(osztaly.getText());
    }

    public void vegkiiratas(ActionEvent actionEvent) {
        eredmeny.setText(orarend.kiirveg(targymentes+" "+napmentes+" "+evfolyammentes+" "+osztalymentes));

    }
}
