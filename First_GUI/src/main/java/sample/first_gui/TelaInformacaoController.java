package sample.first_gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TelaInformacaoController {

    @FXML
    private Label tel_clienteInfo;

    @FXML
    private Label valorInfo;

    @FXML
    private TableColumn<?, ?> lote_produtoInfo;

    @FXML
    private Label nome_clienteInfo;

    @FXML
    private Label cpf_clienteInfo;

    @FXML
    private TableColumn<?, ?> nome_produtoInfo;

    @FXML
    private TableColumn<?, ?> valor_produtoInfo;

    @FXML
    private TableView<?> tabelaInfo;

    @FXML
    private TableColumn<?, ?> vol_produtoInfo;

    @FXML
    private TableColumn<?, ?> categ_produtoInfo;

    @FXML
    private Label num_pedidoInfo;

    @FXML
    private TableColumn<?, ?> fab_produtoInfo;

    @FXML
    private TableColumn<?, ?> tipo_produtoInfo;

    @FXML
    private Label end_clienteInfo;
    
    @FXML
    public void initialize() {
        
    }

}
