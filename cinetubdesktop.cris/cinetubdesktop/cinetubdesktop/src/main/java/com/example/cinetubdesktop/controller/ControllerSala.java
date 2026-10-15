package com.example.cinetubdesktop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSala {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCapacidade;

    @FXML
    private TextField txTipoTela;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSalvar;

    @FXML
    public void limpar() {
        txNome.clear();
        txCapacidade.clear();
        txTipoTela.clear();
    }

    @FXML
    public void salvar(ActionEvent event) {
        String nome = txNome.getText();
        String capacidade = txCapacidade.getText();
        String tipoTela = txTipoTela.getText();

        System.out.println("Sala cadastrada com sucesso!");
        System.out.println("Nome: " + nome + " | Capacidade: " + capacidade + " | Tipo de Tela: " + tipoTela);

        limpar();
    }

    @FXML
    public void ListarSalas(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/com/example/aula0909/view/ListarSalas.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
