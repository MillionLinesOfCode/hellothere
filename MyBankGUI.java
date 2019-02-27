import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;


//Simple BankingAccount UI, with no event-handlers i.e. all show!

public class MyBankGUI extends Application
{
   @Override
   public void start(Stage primaryStage) throws Exception{
	primaryStage.setTitle("My BankAccount");
    
    GridPane root = new GridPane(); 
	// Set a gap of (insert_number) pixels vertically and horizontally between elements
    root.setVgap(3);
    root.setHgap(2);
    
    /*Set margins around the whole grid
    (top/right/bottom/left)*/
	root.setPadding(new Insets(10,10,2,10));
    
    //Simple labels
    root.add(new Label("User information:"),1,1);
    root.add(new Label("Account Holder: John Doe"),1,2);
    root.add(new Label("Balance: 0.00"),1,3);
    root.add(new Label("Enter amount:"),1,35);
    
    //Adding textfield for userinput
    TextField userAmount = new TextField();
    GridPane.setConstraints(userAmount,2,35);
    root.getChildren().add(userAmount);

    //Add a new button to select "Submit"
    Button submitButton = new Button("Submit");
    GridPane.setConstraints(submitButton, 4, 36);     
    root.getChildren().add(submitButton);

	// Add a new button to select "Withdraw"
    Button wdrawButton = new Button("Withdraw amount");
    GridPane.setConstraints(wdrawButton, 1, 86);     
    root.getChildren().add(wdrawButton);
    
    //Add another button to select "Deposit"
	Button depButton = new Button("Deposit amount");
	GridPane.setConstraints(depButton,2,86);
    root.getChildren().add(depButton);
    
   	Scene scene = new Scene(root, 600, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
   }
   public static void main(String[] args)
   {
      launch(args);
   }
}
