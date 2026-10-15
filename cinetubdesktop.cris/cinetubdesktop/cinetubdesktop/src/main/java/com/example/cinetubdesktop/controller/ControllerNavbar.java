package com.example.cinetubdesktop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerNavbar {

    @FXML
    public void irParaInicio(ActionEvent event) throws IOException {
        trocarTela(event, "menu.fxml");
    }

    @FXML
    public void irParaFuncionario(ActionEvent event) throws IOException {
        trocarTela(event, "Funcionario.fxml");
    }

    @FXML
    public void irParaSessoes(ActionEvent event) throws IOException {
        trocarTela(event, "Sessao.fxml");
    }
    @FXML
    public void irParaSala(ActionEvent event) throws IOException {
        trocarTela(event, "Sala.fxml");
    }
    @FXML
    public void irParaSalaCadastro(ActionEvent event) throws IOException {
        trocarTela(event, "SalaCadastro.fxml");
    }




    private void trocarTela(ActionEvent event, String arquivo) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/com/example/cinetubdesktop/view/" + arquivo)
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}