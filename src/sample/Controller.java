package sample;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;


public class Controller implements Initializable {
    @FXML
    ListView list;

    @FXML
    TextField enterName;

    @FXML
    TextField enterEmail;

    @FXML
    TextField enterNumber;


    ObservableList<Contact> contacts = FXCollections.observableArrayList();


    public void addContact() {
        if (enterName.getText().isEmpty() | enterNumber.getText().isEmpty() | enterEmail.getText().isEmpty()) {
        } else {
            Contact c = new Contact(enterName.getText(), enterNumber.getText(), enterEmail.getText());
            contacts.add(c);
            enterName.setText(" ");
            enterNumber.setText(" ");
            enterEmail.setText(" ");

        }
    }

    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);

    }
}