package JavaFX11;

import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class View {

	ComboBox<Info> itemsComboBox = new ComboBox<>(); //the drop down will show the item-names from csv file
	
	Label creditInfoLabel = new Label();
	Label fixedCreditQuestionLabel = new Label("What's your credit score?");
	
	BorderPane setupScene() {
		
		BorderPane root = new BorderPane();
		GridPane topGrid = new GridPane();
		root.setTop(topGrid);
		
		
		/**setup TopGrid*/
		topGrid.setVgap(10);
		topGrid.setHgap(10);
		
		//add controls to topGrid

		topGrid.add(fixedCreditQuestionLabel, 0, 0);
		topGrid.add(itemsComboBox, 0, 1);
		topGrid.add(creditInfoLabel, 0, 2);

		topGrid.getRowConstraints().add(new RowConstraints(20));
		topGrid.getColumnConstraints().add(new ColumnConstraints(500));
		
		//setup look and feel, fonts, alignment, etc
		itemsComboBox.setPromptText("Select Credit Type");
		creditInfoLabel.setTextFill(Color.TEAL);
		creditInfoLabel.setFont(Font.font(15));
		
		topGrid.setPrefSize(700, 500);
		root.setPrefSize(700, 500);
		BorderPane.setMargin(topGrid, new Insets(10, 10, 10, 10));
		return root;
	}
}
