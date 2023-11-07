package sample.first_gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    
    @FXML
    void handleHistoricoButton(ActionEvent event) {
        switchToHistoricoScene();
    }
    
    @FXML
    private void switchToHistoricoScene() {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/historicoScene.fxml"));
        Parent root = loader.load();
        
        Stage newStage = new Stage();
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setTitle("Histórico Cliente");
        
        Scene scene = new Scene(root);
        
        newStage.setScene(scene);
        newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

} //Class