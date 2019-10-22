package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {
    public MenuBar getMenuBar(Stage stage) {
        MenuBar menuBar = new MenuBar();
        // cria barra de Menu.

        Menu cadastrar = new Menu("Cadastrar"); // cria o menu Cadastrar.
        MenuItem produto = new MenuItem("Produto");
        MenuItem cadastrarCliente = new MenuItem("Cliente"); // cria o item Cliente.
        MenuItem Funcionario = new MenuItem("Funcionário");
        cadastrar.getItems().addAll(cadastrarCliente, produto, Funcionario);  //Gera o item Cliente dentro do menu Cadastrar.


        Menu operacoes = new Menu("Operações"); // cria o Menu Operações.
        MenuItem depret = new MenuItem("Depositar / Retirar"); // cria o item Depositar / Retirar.
        operacoes.getItems().addAll(depret); // Gera o item Operações dentro do menu Operações

        Menu sobre = new Menu("Sobre");

        menuBar.getMenus().addAll(cadastrar, operacoes, sobre);  //Gera os botões interações.

        //abrir tela de cadastrar o cliente.
        cadastrarCliente.setOnAction(event -> {
            stage.setTitle("Cadastrar Cliente");
            TelaCadastroClienteView telaCadastroClienteView = new TelaCadastroClienteView();
            stage.setScene(new Scene(telaCadastroClienteView.getTelaCadastro(stage), 500, 275));
            stage.show();

        });

        depret.setOnAction(event -> {
            stage.setTitle("Depositar / Retirar");
            TelaDepositarRetirarView telaDepositarRetirarView = new TelaDepositarRetirarView();
            stage.setScene(new Scene(telaDepositarRetirarView.getTelaDepositarRetirar(stage), 500, 275));
            stage.show();
        });

        sobre.setOnAction(event -> {
            stage.setTitle("Sobre");
            TelaSobreView telaSobreView = new TelaSobreView();
            stage.setScene(new Scene(telaSobreView.getSobre(stage), 500, 275));
            stage.show();
        });

        produto.setOnAction(event -> {
            stage.setTitle("Produto");
            TelaProdutoView telaProdutoView = new TelaProdutoView();
            stage.setScene(new Scene(telaProdutoView.getProduto(stage), 500, 275));
            stage.show();
        });

        Funcionario.setOnAction(event -> {
            stage.setTitle("Funcionario");
            TelaFuncionarioView telaFuncionarioView = new TelaFuncionarioView();
            stage.setScene(new Scene(telaFuncionarioView.getFuncionario(stage), 500, 275));
        });


        return menuBar;
    }
}

