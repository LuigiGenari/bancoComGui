package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Funcionario;

public class TelaFuncionarioView {
    public VBox getFuncionario(Stage stage){
        VBox raiz = new VBox(10);
        Label nomeF = new Label("Nome");
        TextField nome = new TextField();
        Label areaF = new Label("Area");
        TextField area = new TextField();
        Label codigoF = new Label("Codigo");
        TextField codigo = new TextField();
        Label liderF = new Label ("Líder");
        TextField lider = new TextField();
        MenuBarView menuBarView= new MenuBarView();
        MenuBar menuBar= menuBarView.getMenuBar(stage);
        Label cadastroComSucesso = new Label(" ");



        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        btnCadastrar.setOnAction(event -> {
            Funcionario funcionario = new Funcionario(nome.getText(), area.getText(), Double.valueOf(codigo.getText()), lider.getText());
            cadastroComSucesso.setText("Cadastrado com sucesso");

            System.out.println(funcionario);
        });

        btnLimpar.setOnAction(event -> {
            nome.setText("");
            area.setText("");
            codigo.setText("");
            lider.setText("");

        });



        raiz.getChildren().addAll(menuBar, cadastroComSucesso, nomeF, nome, areaF, area, codigoF, codigo, liderF, lider, btnCadastrar, btnLimpar);


        return raiz;
    }
}
