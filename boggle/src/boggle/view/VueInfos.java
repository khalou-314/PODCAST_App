package Boggle.view;
import java.util.Observable;
import java.util.Observer;


import boggle.model.Boggle;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfos extends TilePane implements Observer {
    private Label l1;
    private Label l2;
    public VueInfos(Boggle boggle){
        super();
        boggle.addObserver(this);
        this.l1 = new Label("Votre mot est : " + boggle.getMotChoisi());
        this.l2 = new Label("Votre score est : " + boggle.getScore());
        this.l1.setStyle("-fx-font: 22 verdana;");
        this.l2.setStyle("-fx-font: 22 verdana;");
        this.getChildren().addAll(l1,l2);
    }
    @Override
    public void update(Observable o,Object arg) {
        Boggle b = (Boggle) o;
        this.l1.setText("Votre mot est : "+b.getMotChoisi());
        this.l2.setText(" Votre score est : "+b.getScore());
    }
}



