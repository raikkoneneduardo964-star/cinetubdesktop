package com.example.cinetubdesktop.controller;

import com.example.cinetubdesktop.model.Filme;
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

public class ControllerFilme {

    @FXML
    private TextField txTitulo;

    @FXML
    private TextField txGenero;

    @FXML
    private TextField txAnoLancamento;

    @FXML
    private TextField txAvaliacao;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSalvar;

    @FXML
    public void limpar() {
        txTitulo.clear();
        txGenero.clear();
        txAnoLancamento.clear();
        txAvaliacao.clear();
    }

    @FXML
    public void salvar(ActionEvent event) {
        // Captura o texto dos campos
        String titulo = txTitulo.getText();
        String genero = txGenero.getText();

        // Converte o ano para número inteiro
        int ano = 0;
        if (!txAnoLancamento.getText().isEmpty()) {
            ano = Integer.parseInt(txAnoLancamento.getText());
        }

        // Converte a avaliação para número com vírgula/ponto
        double avaliacao = 0.0;
        if (!txAvaliacao.getText().isEmpty()) {
            avaliacao = Double.parseDouble(txAvaliacao.getText().replace(",", "."));
        }

        // Instancia o objeto Filme usando o modelo
        Filme novoFilme = new Filme(null, titulo, genero, ano, avaliacao);

        // Exibe no console para confirmação
        System.out.println("Filme cadastrado com sucesso:");
        System.out.println("Título: " + novoFilme.getTitulo());
        System.out.println("Gênero: " + novoFilme.getGenero());
        System.out.println("Ano: " + novoFilme.getAnoLancamento());
        System.out.println("Avaliação: " + novoFilme.getAvaliacao());

        // Limpa os campos após salvar
        limpar();
    }

    @FXML
    public void listarFilmes(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/com/example/aula0909/view/ListarFilmes.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
