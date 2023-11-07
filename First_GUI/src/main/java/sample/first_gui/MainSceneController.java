package sample.first_gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.stage.Modality;

public class MainSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> cliente_pedidoMain;

    @FXML
    private Button log_outMain;

    @FXML
    private Button listar_clienteMain;

    @FXML
    private TableColumn<?, ?> data_fab_estoqueMain;

    @FXML
    private TableColumn<?, ?> id_estoqueMain;

    @FXML
    private TableColumn<?, ?> data_venc_estoqueMain;

    @FXML
    private TableColumn<?, ?> categ_estoqueMain;

    @FXML
    private Button registrar_pedidoMain;

    @FXML
    private Button cadastrar_clienteMain;

    @FXML
    private TableColumn<?, ?> itens_pedidoMain;

    @FXML
    private TableColumn<?, ?> valor_pedidoMain;

    @FXML
    private TableColumn<?, ?> nome_estoqueMain;

    @FXML
    private TableColumn<?, ?> data_pedidoMain;

    @FXML
    private Button info_button_pedidoMain;

    @FXML
    private TableColumn<?, ?> lote_estoqueMain;

    @FXML
    private TableColumn<?, ?> tel_pedidoMain;

    @FXML
    private TableColumn<?, ?> cpf_pedidoMain;

    @FXML
    private TableColumn<?, ?> num_pedidoMain;

    @FXML
    private Button cadastrar_produtoMain;

    @FXML
    private TableColumn<?, ?> tipo_estoqueMain;

    @FXML
    private TableColumn<?, ?> volume_estoqueMain;

    @FXML
    private TableColumn<?, ?> end_pedidoMain;

    @FXML
    private TableColumn<?, ?> hora_pedidoMain;

    @FXML
    private TableColumn<?, ?> fab_estoqueMain;

    @FXML
    private Button excluir_produtoMain;

    @FXML
    private Label usernameMain;

    @FXML
    private TableColumn<?, ?> valor_estoqueMain;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameMain.setText("Luciano");
    }
    
    @FXML
    void handleLogOutButton(ActionEvent event) {
        //Call switchToLoginPage Method
        switchToLoginPage(event);
    }
    
    private void switchToLoginPage(ActionEvent event) {
        try {
            //Load the FXML arquive
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/loginScene.fxml"));
            Parent root = loader.load();
            //Getting the Scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            //Creating a new Scene
            Scene scene = new Scene(root);
            //Set the scene
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML void handleCadastrarClienteButton(ActionEvent event) {
        switchToCadastroClienteScene();
    }
    
    private void switchToCadastroClienteScene() {
        try {
            FXMLLoader  loader = new FXMLLoader(getClass().getResource("/scene/cadastro_clienteScene.fxml"));
            Parent root = loader.load();
            
            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Cadastrar Cliente");
            
            Scene scene = new Scene(root);
            
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleInfoButton(ActionEvent event) {
        switchToInfoScene();
    }
    
    @FXML
    private void switchToInfoScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/infoScene.fxml"));
            Parent root = loader.load();
            
            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Informações");
            
            Scene scene = new  Scene(root);
            
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML void handleListarClienteButton(ActionEvent event) {
        switchToListaClientesScene();
    }
    
    @FXML 
    private void switchToListaClientesScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/lista_clientesScene.fxml"));
            Parent root = loader.load();
            
            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Lista de Clientes");
            
            Scene scene = new Scene(root);
            
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleCadastrarProdutoButton(ActionEvent event) {
        switchToCadastrarProdutoScene();
    }
    
    @FXML
    private void switchToCadastrarProdutoScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/cadastro_produtoScene.fxml"));
            Parent root = loader.load();
            
            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Cadastro de Produto");
            
            Scene scene = new Scene(root);
            
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleExcluirProdutoButton(ActionEvent event) {
        switchToExcluirProdutoScene();
    }
    
    @FXML
    private void switchToExcluirProdutoScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/retirar_produtoScene.fxml"));
            Parent root = loader.load();
            
            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Retirar Produto");
            
            Scene scene = new Scene(root);
            
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleRegistrarPedidoButton(ActionEvent event) {
        switchToRegistrarPedidoScene();
    }
    
    @FXML
    private void switchToRegistrarPedidoScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/cadastro_pedidoScene.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("Registro de Pedido");

            Scene scene = new Scene(root);

            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
} //Class
