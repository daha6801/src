package JavaFX11;

import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TextField;
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
	Label carPriceLabel = new Label("Car price ($)");
	TextField carPriceTextField = new TextField();
	Label afterNegotiations = new Label("After negotiations");
	
	Label tradeInDownPaymentLabel = new Label("Trade-in / down payment ($)");
	TextField tradeInDownPaymentTextField = new TextField();
	Label tradeInDownPaymentTextLabel = new Label("Your trade-in can be all or part of a down payment");
	
	Label interestRateLabel = new Label("Intesrest rate(%)");
	Spinner<Double> interestRate = new Spinner<>();
	Label interestRateTextLabel = new Label("A higher credit score means lower interest rates");
	
	//interestRate.setEditable(false);
	
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
		topGrid.add(carPriceLabel, 0, 3);
		topGrid.add(carPriceTextField, 0, 4);
		topGrid.add(afterNegotiations, 0, 5);
		topGrid.add(tradeInDownPaymentLabel, 0, 6);
		topGrid.add(tradeInDownPaymentTextField, 0, 7);
		topGrid.add(tradeInDownPaymentTextLabel, 0, 8);
		

		

		topGrid.getRowConstraints().add(new RowConstraints(20));
		topGrid.getColumnConstraints().add(new ColumnConstraints(500));
		
		//setup look and feel, fonts, alignment, etc
		itemsComboBox.setPromptText("Select Credit Type");
		carPriceTextField.setPromptText("5000");
		tradeInDownPaymentTextField.setPromptText("4000");
		creditInfoLabel.setTextFill(Color.TEAL);
		creditInfoLabel.setFont(Font.font(15));
		
		
		DoubleSpinnerValueFactory spinnerFactory = new DoubleSpinnerValueFactory(0,100,4.5); //Figure out how to take user input
		
		topGrid.add(interestRateLabel, 0, 9);
		interestRate.setValueFactory(spinnerFactory);
		topGrid.add(interestRate, 0, 10);
		topGrid.add(interestRateTextLabel, 0, 11);
		
		topGrid.setPrefSize(700, 500);
		root.setPrefSize(700, 500);
		BorderPane.setMargin(topGrid, new Insets(10, 10, 10, 10));
		return root;
	}
}
