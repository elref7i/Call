package application;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class SampleController  {
	
        
	@FXML
    private Button btn_eight;

    @FXML
    private Button btn_five;

    @FXML
    private Button btn_four;

    @FXML
    private Button btn_hash;

    @FXML
    private Button btn_ni;

    @FXML
    private Button btn_one;

    @FXML
    private Button btn_seven;

    @FXML
    private Button btn_six;

    @FXML
    private Button btn_str;

    @FXML
    private Button btn_three;

    @FXML
    private Button btn_two;

    @FXML
    private Button btn_zero;

    @FXML
    private Label number_one;

    @FXML
    private Label number_three;

    @FXML
    private Label number_two;

    @FXML
    private AnchorPane conent_btn;

    @FXML
    private AnchorPane number_btn;
    @FXML
    private Button call;
    
    @FXML
    private TextField text_fi;
    @FXML
    private Button clear;

    String soundrun = "D:\\\\eclice\\\\callnumber\\\\src\\\\muisc\\\\runtwo.mp3";

    Media so = new Media(new File(soundrun).toURI().toString());
   
    MediaPlayer run = new MediaPlayer(so);
    

   	String soundFilePath = "D:\\\\eclice\\\\callnumber\\\\src\\\\muisc\\\\Soundeff.mp3";

    Media sound = new Media(new File(soundFilePath).toURI().toString());
   
    MediaPlayer mediaPlayer = new MediaPlayer(sound);
    
    


    
    

    @FXML
    void btn_eight(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"8");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	

    }

    @FXML
    void btn_five(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"5");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}

    }

    @FXML
    void btn_four(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"4");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	
    }

    @FXML
    void btn_hash(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"#");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		
    		}
    	

    }

    @FXML
    void btn_ni(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"9");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}

    }

    @FXML
    void btn_one(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"1");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	

    }

    @FXML
    void btn_seven(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"7");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	
    }

    @FXML
    void btn_six(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"6");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}

    }

    @FXML
    void btn_str(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"*");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	 

    }

    @FXML
    void btn_three(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"3");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}

    }

    @FXML
    void btn_two(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"2");
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}

    }

    @FXML
    void btn_zero(ActionEvent event) {
    	if (text_fi.getText().length()<11){
    		text_fi.setText(text_fi.getText()+"0");
    		mediaPlayer.play();
    		mediaPlayer.stop();
    		mediaPlayer.play();
    		}
    	

    }
    
    @FXML
    void clear(ActionEvent event) {
    	text_fi.clear();

    }
    
    @FXML
    void numone(MouseEvent event) {
 
    		String text = number_one.getText();
        	text_fi.setText(text);
    		}

   

    @FXML
    void numth(MouseEvent event) {
    	
    		String text = number_three.getText();
        	text_fi.setText(text);
    		
    	

    }

    @FXML
    void numtwo(MouseEvent event) {
    	if (text_fi.getText().length()<11){
    		String text = number_two.getText();
        	text_fi.setText(text);
    		}

    }
    @FXML
    void call_ac(ActionEvent event) {
    	if (text_fi.getText().length()==11){
    		
    		
    		run.stop();
    		run.play();
    		}
    	

    }

	
    

	
}
