/**
 * Created by Zane on 5/13/2017.
 */

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javafx.scene.*;

class MessageBox {

   private static Stage messageBox;


     static void show(String title, String message){

         Scene messageBoxScene;
         BorderPane messageBoxLayout;
         Label msg;
         Button okButton;
         String iconPath = "Multix Window Icon.png";


        okButton = new Button("OK");
        okButton.getStyleClass().addAll("globalButtonText");

        msg = new Label(message);

        messageBoxLayout = new BorderPane();
        messageBoxLayout.setCenter(msg);
        messageBoxLayout.setBottom(okButton);
        okButton.setMinSize(60,15);
        messageBoxLayout.setAlignment(okButton,Pos.TOP_CENTER);
        messageBoxLayout.setPadding(new Insets(10,10,10,10));

        messageBoxScene = new Scene(messageBoxLayout);
        messageBoxScene.getStylesheets().addAll("GlobalStyle.css");

        messageBox = new Stage();

        messageBox.getIcons().add(new Image(iconPath));
        messageBox.setTitle(title);
        messageBox.setScene(messageBoxScene);
        messageBox.setMinHeight(150);
        messageBox.setMinWidth(200);
        messageBox.initModality(Modality.APPLICATION_MODAL);


        okButton.setOnAction(e-> okButtonClick());
        okButton.setOnKeyPressed( e -> okButton_OnEnter(e));

        messageBox.show();
    }

    private static void okButtonClick(){

        messageBox.close();
    }

    private static void okButton_OnEnter(javafx.scene.input.KeyEvent e){

        if (e.getCode() == KeyCode.ENTER){
            messageBox.close();
        }
    }


}
