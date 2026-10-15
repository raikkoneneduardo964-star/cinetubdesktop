package com.example.cinetubdesktop.controller;

import com.example.cinetubdesktop.database.BancoDeDados;
import com.example.cinetubdesktop.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerCadastroFuncionario {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCpf;

    @FXML
    private TextField txCargo;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnLimpar;


    @FXML
    public void limpar() {
        txNome.clear();
        txCpf.clear();
        txCargo.clear();
    }


    @FXML
    public void CadastrarFuncionario() {

        String nome = txNome.getText();
        String cpf = txCpf.getText();
        String cargo = txCargo.getText();


        if (nome.isEmpty() || cpf.isEmpty() || cargo.isEmpty()) {

            exibirAlerta(
                    Alert.AlertType.WARNING,
                    "Aviso",
                    "Por favor, preencha todos os campos do funcionário."
            );

            return;
        }


        Funcionario funcionario = new Funcionario(
                null,
                nome,
                cpf,
                cargo
        );


        BancoDeDados.funcionarios.add(funcionario);


        exibirAlerta(
                Alert.AlertType.INFORMATION,
                "Cadastro Concluído",
                "O funcionário '" + nome +
                        "' foi cadastrado com sucesso!"
        );


        limpar();
    }


    private void exibirAlerta(
            Alert.AlertType tipo,
            String titulo,
            String mensagem) {

        Alert alert = new Alert(tipo);

        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);

        alert.showAndWait();
    }


    @FXML
    public void ListarFuncionarios(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource(
                        "/com/example/cinetubdesktop/view/FuncionarioParte2.fxml"
                )
        );


        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();


        stage.setScene(new Scene(root));
        stage.show();
    }
}
