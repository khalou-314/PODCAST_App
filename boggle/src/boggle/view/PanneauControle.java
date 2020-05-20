package Boggle.view;

import boggle.model.Boggle;
import javafx.application.Platform;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;


public class PanneauControle extends VBox {
    private Button valider;
    private Button effacer;
    private Button quitter;

    public PanneauControle(Boggle b){
        super();
        this.valider = new Button("Valider");
        this.effacer = new Button("Effacer");
        this.quitter = new Button("Quitter");
        valider.setStyle("-fx-font: 22 Arial; -fx-base: #008000;");
        effacer.setStyle("-fx-font: 22 Arial; -fx-base: #FFA500;");
        quitter.setStyle("-fx-font: 22 Arial; -fx-base: #FF0000;");
        this.valider.setOnAction(click-> {b.valider();});
        this.effacer.setOnAction(click-> {b.effacer();});
        this.quitter.setOnAction(click-> {Platform.exit();});
        this.getChildren().addAll(this.valider,this.effacer, this.quitter);
    }

}
