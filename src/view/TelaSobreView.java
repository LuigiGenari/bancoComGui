package view;

import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaSobreView {

    public VBox getSobre(Stage stage){
        VBox raiz = new VBox(10);
        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar= menuBarView.getMenuBar(stage);
        Label sobre = new Label("Desenvolvido por Guilherme");

        raiz.getChildren().addAll(menuBar,sobre);
        return raiz;
    }
}
