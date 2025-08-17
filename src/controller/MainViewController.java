package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import util.Alerts;

public class MainViewController implements Initializable {
	
	// ##### elements declarations #####
	
	@FXML
	private Button btnConvert;
	
	@FXML
	private ProgressBar progressBarMain;
	
	@FXML
	private ComboBox<?> comboBoxFileType;
	
	@FXML
	private ComboBox<?> comboBoxFinalFileFormat;
	
	@FXML
	private TextField fieldDirectory;
	
	@FXML
	private Button btnChooseDirectory;
	
	@FXML
	private TextField fieldArchDirectory;
	
	@FXML
	private Button btnChooseFile;
	
	@FXML
	private TextField fieldFileName;
	
	@FXML
	private TextField fieldFileFormat;
	
	// ##### objects initialize #####
	
	private final FileConverterController fileConverter = new FileConverterController();
	
	// ##### function calls #####
	
	@FXML
	public void onBtnConvertClick() {
		Alerts.showAlert("Clicked", null, "Button convert has been clicked", AlertType.CONFIRMATION);
	}
	
	@FXML
	public void onBtnChooseFileClick() {
		javafx.stage.Window owner = btnChooseFile.getScene().getWindow();
        fileConverter.selectFile(owner);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
