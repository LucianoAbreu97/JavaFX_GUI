package sample.first_gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroClienteController {

    @FXML
    private TextField sobrenomeCadCliente;

    @FXML
    private ChoiceBox<String> email_choice_boxCadCliente;

    @FXML
    private TextField end_numCadCliente;

    @FXML
    private TextField nomeCadCliente;

    @FXML
    private TextField end_ruaCadCliente;

    @FXML
    private TextField end_bairroCadCliente;

    @FXML
    private Button cad_buttonCadCliente;

    @FXML
    private TextField emailCadCliente;

    @FXML
    private TextField cpfCadCliente;

    @FXML
    private TextField end_compCadCliente;

    @FXML
    private TextField telCadCliente;

    @FXML
    private Label error_msgCadCliente;
    
    @FXML
    public void initialize() {
        
        ObservableList<String> emails = FXCollections.observableArrayList(
        "gmail.com","gmail.com.br","outlook.com","outlook.com.br",
        "yahoo.com","yahoo.com.br");
        
        email_choice_boxCadCliente.setItems(emails);
        
        email_choice_boxCadCliente.setValue("gmail.com");
    }

}
