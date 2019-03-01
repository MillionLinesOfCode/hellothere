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

public class QuizApp extends Application {

     public void start(Stage primaryStage) {

           VBox root = new VBox();

           Scene scene = new Scene(root);

           primaryStage.setScene(scene);

 

           Label label = new Label("Hello");

           root.getChildren().add(label);

          

           Button button1 = new Button("one");

           Button button2 = new Button("two");

          

           button1.setOnAction(new HandleButtonClick("Hello"));

           button2.setOnAction(new HandleButtonClick("There", label));

          

          root.getChildren().add(button1);

          root.getChildren().add(button2);

          

          primaryStage.show();

     }

}

public class HandleButtonClick implements EventHandler<ActionEvent> {

     private String message;

     private Label msgLabel = null;

     private int counter = 0;

    

     public HandleButtonClick(String msg) {

           message = msg;

     }

     public HandleButtonClick(String msg, Label aLabel) {

           message = msg;

           msgLabel = aLabel;

     }

     public void handle(ActionEvent event){

           counter++;

           if (msgLabel == null) {

                System.out.println(message + counter);

           } else {

                msgLabel.setTextFill(Color.RED);

                msgLabel.setText(message + counter);

           }

     }

}