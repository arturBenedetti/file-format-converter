package service;

import java.io.File;

import javafx.stage.FileChooser;

public class FileDataService {
	
	public void selectFile(javafx.stage.Window owner) {
		FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Todos", "*.*"));
        File f = fc.showOpenDialog(owner);
        if (f != null) {
        	System.out.println(getFileExtension(f));
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
