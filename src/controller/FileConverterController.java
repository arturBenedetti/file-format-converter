package controller;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class FileConverterController {

	@FXML
	private void selectFile() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Files", "*.*"));

		File selectedFile = fileChooser.showOpenDialog(new Stage()); // open the system archive selection window

		if (selectedFile != null) {
			String fileName = selectedFile.getName();
			String fileExtension = getFileExtension(selectedFile);

			System.out.println("Archive name: " + fileName);
			System.out.println("Archive extension: " + fileExtension);
		} else {
			System.out.println("No one archive selected");
		}
	}

	private String getFileExtension(File file) {
		String fileName = file.getName();
		int dotIndex = fileName.lastIndexOf(".");

		if (dotIndex > 0) {
			return fileName.substring(dotIndex + 1);
		} else {
			return "Has no extension";
		}
	}
}
