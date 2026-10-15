package com.example.cinetubdesktop.controller;

import com.example.cinetubdesktop.database.BancoDeDados;
import com.example.cinetubdesktop.model.Filme;
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

public class ControllerCadastroFilme {

    @FXML
    private TextField txTitulo;

    @FXML
    private TextField txGenero;

    @FXML
    private TextField txAnoLancamento;

    @FXML
    private TextField txAvaliacao;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnLimpar;

    @FXML
    public void limpar() {
        txTitulo.clear();
        txGenero.clear();
        txAnoLancamento.clear();
        txAvaliacao.clear();
    }

    @FXML
    public void CadastrarFilme() {
        String titulo = txTitulo.getText();
        String genero = txGenero.getText();
        String textoAno = txAnoLancamento.getText();
        String textoAvaliacao = txAvaliacao.getText();


        if (titulo.isEmpty() || genero.isEmpty() || textoAno.isEmpty() || textoAvaliacao.isEmpty()) {
            exibirAlerta(Alert.AlertType.WARNING, "Aviso", "Por favor, preencha todos os campos do filme.");
            return;
        }

        int anoLancamento;
        double avaliacao;

        try {
            anoLancamento = Integer.parseInt(textoAno);
            avaliacao = Double.parseDouble(textoAvaliacao.replace(",", "."));
        } catch (NumberFormatException e) {
            exibirAlerta(Alert.AlertType.ERROR, "Erro de Formato", "O ano deve ser um número inteiro e a avaliação deve ser um número válido.");
            return;
        }


        Filme filme = new Filme(null, titulo, genero, anoLancamento, avaliacao);
        
        BancoDeDados.filmes.add(filme);

        exibirAlerta(Alert.AlertType.INFORMATION, "Cadastro Concluído",
                "O filme '" + titulo + "' (" + anoLancamento + ") foi cadastrado com sucesso!");

        limpar();
    }

    private void exibirAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    @FXML
    public void ListarFilmes(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/com/example/cinetubdesktop/view/ListarFilmes.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}