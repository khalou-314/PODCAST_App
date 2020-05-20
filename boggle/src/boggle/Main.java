package Boggle;


import Boggle.view.PanneauControle;
import Boggle.view.VueInfos;
import Boggle.view.VueLettres;
import boggle.model.Boggle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Boggle boggle = new Boggle(4);
        BorderPane root = new BorderPane();

        VueLettres vue = new VueLettres(boggle);
        VueInfos vueI = new VueInfos(boggle);
        PanneauControle PC = new PanneauControle(boggle);
        Label consigne = new Label("Formez des mots avec des cases contigues.");
        consigne.setStyle("-fx-font: 22 arial");

        vue.setAlignment(Pos.CENTER);
        root.setCenter(vue);
        vueI.setAlignment(Pos.CENTER);
        root.setBottom(vueI);
        PC.setAlignment(Pos.CENTER);
        root.setRight(PC);
        root.setTop(consigne);


        primaryStage.setTitle("Boogle");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
