package sample.first_gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CadastroProdutoController {

    @FXML
    private TextField valorCadProduto;

    @FXML
    private TextField tipoCadProduto;

    @FXML
    private Label error_msgCadProduto;

    @FXML
    private Button cad_buttonCadProduto;

    @FXML
    private TextField estoqueCadProduto;

    @FXML
    private ChoiceBox<String> vol_tipoCadProduto;

    @FXML
    private TextField nomeCadProduto;

    @FXML
    private DatePicker data_fabCadProduto;

    @FXML
    private TextField categCadProduto;

    @FXML
    private RadioButton controleCadProduto;

    @FXML
    private DatePicker data_vencCadProduto;

    @FXML
    private TextField loteCadProduto;

    @FXML
    private TextField vol_unidadeCadProduto;

    @FXML
    private TextField fabricanteCadProduto;
    
    @FXML
    public void initialize() {
        //Choice Box
        ObservableList<String> unidade = FXCollections.observableArrayList(
        "mg", "g", "kg", "mL", "L", "UI");
        
        vol_tipoCadProduto.setItems(unidade);
        vol_tipoCadProduto.setValue("mg");
    }

}