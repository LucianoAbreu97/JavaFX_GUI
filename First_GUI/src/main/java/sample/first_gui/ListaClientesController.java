package sample.first_gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListaClientesController {

    @FXML
    private TableColumn<?, ?> nome_tabListaClientes;

    @FXML
    private TableColumn<?, ?> tel_tabListaClientes;

    @FXML
    private Button remover_buttonListaClientes;

    @FXML
    private TableColumn<?, ?> bairro_tabListaClientes;

    @FXML
    private TableColumn<?, ?> num_tabListaClientes;

    @FXML
    private Button hist_buttonListaClientes;

    @FXML
    private TableColumn<?, ?> sob_nome_tabListaClientes;

    @FXML
    private TableColumn<?, ?> email_tabListaClientes;

    @FXML
    private TableView<?> tabelaListaClientes;

    @FXML
    private Label error_msgListaClientes;

    @FXML
    private TableColumn<?, ?> cpf_tabListaClientes;

    @FXML
    private TableColumn<?, ?> rua_tabListaClientes;
    
    @FXML
    public void initialize() {
        
    }

}