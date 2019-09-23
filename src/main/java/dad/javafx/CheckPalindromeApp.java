package dad.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {
	
	
	private Label checkpalindromeLabel;
	private Button checkButton;
	private TextField palindromeText;
	private TextField tituloText;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		palindromeText = new TextField();
		palindromeText.setPromptText("Introduce tu palíndromo");
		palindromeText.setMaxWidth(150);
		
		
		checkButton = new Button("comprobar");
		checkButton.setDefaultButton(true);
		checkButton.setOnAction(e -> onCheckButtonAction(e));
		
		checkpalindromeLabel = new Label("Aquí saldrá la comprobación");
		checkpalindromeLabel.setWrapText(true);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(palindromeText, checkButton, checkpalindromeLabel);
		
		Scene scene = new  Scene(root, 320, 200);
		primaryStage.setTitle("Comprobador de palíndromos");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

	private void onCheckButtonAction(ActionEvent e) {

		String palindromo = palindromeText.getText();
		boolean check = palindromo.equals(new StringBuilder(palindromo).reverse().toString());
		
		if(check) 
		{
			checkpalindromeLabel.setText("Es palíndromo");
			checkpalindromeLabel.setStyle("-fx-text-fill: green; -fx-font: bold 30 consolas;");
		}
		else
		{
			checkpalindromeLabel.setText("No es palíndromo");
			checkpalindromeLabel.setStyle("-fx-text-fill: red; -fx-font: bold 30 consolas;");	
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
