package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Conta;

public class TelaCadastroClienteView{
        public VBox getTelaCadastro(Stage stage) {
    VBox raiz = new VBox(10);

    Label nomeCliente = new Label("Nome: ");
    TextField Nome = new TextField();

    Label numeroCpf = new Label("CPF: ");
    TextField CPF = new TextField();

    Label numeroConta = new Label("Numero da Conta: ");
    TextField Conta = new TextField();

    Button btnCadastrar = new Button("Cadastrar");
    Button btnLimpar = new Button("Limpar");

    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar = menuBarView.getMenuBar(stage);

    raiz.getChildren().addAll(menuBar, nomeCliente, Nome, numeroCpf, CPF, numeroConta, Conta, btnCadastrar, btnLimpar);

    btnCadastrar.setOnAction(event -> {
        model.Conta conta = new Conta(Integer.valueOf(Conta.getText()), 0.0);
        Cliente cliente = new Cliente(Nome.getText(), CPF.getText(), conta);
    });

    btnLimpar.setOnAction(event -> {
        Nome.setText("");
        CPF.setText("");
        Conta.setText("");
    });
    return raiz;
}
}
