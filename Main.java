/**
 * SigmaCalc
 *
 * Launches various applications that perform common tasks needed by Engineers.
 * Unit Conversion, Various date queries such as how many work days within a range of dates using CalPlanner
 * Common formula references / calculation.
 * Created by Zane Cook on 5/15/2017.
 */

import javafx.application.*;

import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application{

        public static void main (String[] args){

            launch(args);
        }

    @Override
    public void start(Stage mainWindow) throws Exception {

        String programTitle = "SigmaCalc";
        String iconPath = "file:C:\\Users\\Zane\\Dropbox\\Misc\\Electronics & Computer Science\\Java\\JavaPrograms\\SigmaCalc\\Images\\SigmaCalc Window Icon.png";



        mainWindow.setScene(SceneBuilder.BuildMainWindowScene(mainWindow));
        mainWindow.setTitle(programTitle);
        mainWindow.getIcons().add(new Image(iconPath));


        mainWindow.show();

    }



    }



