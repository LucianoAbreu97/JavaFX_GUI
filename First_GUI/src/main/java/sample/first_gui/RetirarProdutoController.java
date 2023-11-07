package sample.first_gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RetirarProdutoController {

    @FXML
    private Label error_msgRetProduto;

    @FXML
    private TableColumn<?, ?> nome_tabRetProduto;

    @FXML
    private TableColumn<?, ?> data_fab_tabRetProduto;

    @FXML
    private TableColumn<?, ?> data_venc_tabRetProduto;

    @FXML
    private TableColumn<?, ?> id_tabRetProduto;

    @FXML
    private Button remover_buttonRetProduto;

    @FXML
    private TableView<?> tabela_RetProduto;

    @FXML
    private TextField nome_boxRetProduto;

    @FXML
    private TableColumn<?, ?> vol_tabRetProduto;

    @FXML
    private TextField lote_boxRetProduto;

    @FXML
    private TableColumn<?, ?> valor_tabRetProduto;

    @FXML
    private TableColumn<?, ?> fab_tabRetProduto;

    @FXML
    private TableColumn<?, ?> tipo_tabRetProduto;

    @FXML
    private TableColumn<?, ?> cat_tabRetProduto;

    @FXML
    private TableColumn<?, ?> lote_tabRetProduto;
    
    @FXML
    public void initialize() {
        
    }

}