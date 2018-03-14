
package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtTesto"
    private TextField txtTesto; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML
    void doClear(ActionEvent event) {
    	txtResult.clear();
    	txtTesto.clear();
    }
    
    
    public boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String s=(txtTesto.getText()).toLowerCase();
    	String sArray[];
    	String s1; String s2; String s3;
    	if(s.contains(" "))
    	{
    	sArray=s.split(" ");
    	s1=sArray[0];
    	s2=sArray[1];
    	if(isAlpha(s1) && isAlpha(s2))
    	dict.setWord(s1,s2);
    	else
    	{
    		txtResult.clear();
    		txtResult.setText("Inserisci un valore alfabetico!!!");
    	}
    	}
    	
    	else if(s.contains("?"))
    	{
    	sArray=s.split("\\?");
    	s1=sArray[0];
    	s2=sArray[1];
    	if(isAlpha(s1) && isAlpha(s2))
    	{
    		
    		s3=dict.getWord(s1,s2);
    		txtResult.clear();
    		txtResult.setText(s3);
    		
    	}
    	else
    	{
    		txtResult.setText("Inserisci un valore alfabetico!!!");	
    	}
    		
    		
    	}
    	
    	else
    	{
    		if(isAlpha(s))
    		{s1=dict.getWord(s);
    		txtResult.clear();
    		txtResult.setText(s1);}	
    		else
    		{
    			txtResult.clear();
        		txtResult.setText("Inserisci un valore alfabetico!!!");
    			
    		}
    	}
    	
    	
    	
    	

    }
    
    
    Dictionary dict;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";
        dict = new Dictionary();//metti qui tutto quello che ti servirebbe nel main, ma ti è comodo usare qui

    }
}
