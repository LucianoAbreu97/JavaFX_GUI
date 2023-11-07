package sample.first_gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HistoricoClienteController {

    @FXML
    private TableColumn<?, ?> num_pedidoHistCliente;

    @FXML
    private TableColumn<?, ?> valor_pedidoHistCliente;

    @FXML
    private TableColumn<?, ?> cpfHistCliente;

    @FXML
    private TableColumn<?, ?> sob_nomeHistCliente;

    @FXML
    private TableColumn<?, ?> data_pedidoHistCliente;

    @FXML
    private TableView<?> tabelaHistCliente;

    @FXML
    private TableColumn<?, ?> nome_tabHistCliente;
    
    @FXML
    public void initialize() {
        
    }

}
