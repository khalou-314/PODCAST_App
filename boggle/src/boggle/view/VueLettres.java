package Boggle.view;

import boggle.model.Boggle;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class VueLettres extends GridPane {

    public VueLettres(Boggle boggle){
        super();
        for (int i = 0; i < boggle.size(); i++) {
            for (int j = 0; j < boggle.size(); j++) {
                Button bouton = new Button();
                bouton.setText(""+boggle.getLettre(i,j));
                bouton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                bouton.setStyle("-fx-font: 18 verdana; -fx-base: #3628e7;");
                this.setRowIndex(bouton,i);
                this.setColumnIndex(bouton, j);
                int finalI = i;
                int finalJ = j;
                bouton.setOnAction(event->boggle.ajouterLettre(finalI,finalJ));
                this.getChildren().add(bouton);
            }
        }
    }

}
