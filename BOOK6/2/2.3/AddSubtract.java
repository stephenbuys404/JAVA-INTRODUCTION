import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override public void start(Stage primaryStage)
    {
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(	
            new EventHandler<ActionEvent>()	
            {
                public void handle(ActionEvent e)	
                {
                    iCounter++;	
                    lbl.setText(Integer.toString(iCounter));
                }
            } );

        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
            new EventHandler<ActionEvent>()	
            {
                public void handle(ActionEvent e)	
                {
                    iCounter--;
                    lbl.setText(Integer.toString(iCounter));
                }
            } );

        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

        Scene scene = new Scene(pane, 200, 75);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }
}
