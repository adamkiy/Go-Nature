package screenController;

import client.ClientController;
import enums.Commands;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import logic.LoginDetail;
import logic.Message;

public class VisitorScreenController extends ScreenController {


	/**
	 * Handles the action event for the prices button.
	 * Opens the prices screen.
	 * @param event The action event generated by clicking the prices button.
	 * @throws Exception Throws Exception if an error occurs during execution.
	 */
	public void pricesBtn(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		PricesScreenController newScreen = new PricesScreenController();
		newScreen.start(new Stage());
	}
	
	/**
	 * Handles the action event for the new booking button.
	 * Opens the new booking screen.
	 * @param event The action event generated by clicking the new booking button.
	 * @throws Exception Throws Exception if an error occurs during execution.
	 */
	public void newBookingBtn(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		NewBookingController newScreen = new NewBookingController();
		newScreen.start(new Stage());
	}
	
	/**
	 * Handles the action event for the my booking button.
	 * Opens the my booking screen.
	 * @param event The action event generated by clicking the my booking button.
	 * @throws Exception Throws Exception if an error occurs during execution.
	 */
	public void myBookingBtn(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		MyBookingController newScreen = new MyBookingController();
		newScreen.start(new Stage());
	}
	
	/**
	 * Handles the action event for the logout button.
	 * Logs out the visitor and opens the login screen.
	 * @param event The action event generated by clicking the logout button.
	 * @throws Exception Throws Exception if an error occurs during execution.
	 */
	public void logoutBtn(ActionEvent event) throws Exception {
		LoginDetail logoutDetail = new LoginDetail(ClientController.client.bookingController.getID());
		Message logoutDetailMsg = new Message(logoutDetail,Commands.VisitorLogOut);
		ClientController.client.sendToServer(logoutDetailMsg);
		((Node)event.getSource()).getScene().getWindow().hide();
		LoginController newScreen = new LoginController();
		newScreen.start(new Stage());
	}
	
	/**
	 * Handles the action event for the about us button.
	 * Opens the about us screen.
	 * @param event The action event generated by clicking the about us button.
	 * @throws Exception Throws Exception if an error occurs during execution.
	 */
	public void aboutUsBtn(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		AboutUsController newScreen = new AboutUsController();
		newScreen.start(new Stage());
	}
}