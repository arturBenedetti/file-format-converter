package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class ViewController {
	
	// ##### elements declarations #####
	
	@FXML
	private Button btnConvert;
	
	@FXML
	private ProgressBar progressBarMain;
	
	//@FXML
	//private ComboBox dropdownFileType;
	
	//@FXML
	//private ComboBox dropdownFinalFileFormat;
	
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
	
	// ##### function calls #####
	
	public void onBtnChooseFile() {
		System.out.println("kkk");
	}
}
