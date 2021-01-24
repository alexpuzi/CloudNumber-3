import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.SVGPath;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class CloudServerFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Server. Cloud. Panpartizanin");

        SVGPath svgPath = new SVGPath();
        svgPath.setContent("11 11");
        BorderPane borderPane = new BorderPane();
        Button btn = new Button("CLose Window");

        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(borderPane, 800,800); //add color "Color.BLUE" p/89 of javaFX

        primaryStage.setScene(myScene);
        primaryStage.setX(12);
        primaryStage.setY(12);
//        myScene.setFill(Color.BLUE);
//        BorderPane root = new BorderPane()

        try {
            primaryStage.getIcons().add(new Image( //page 88
                    getClass().getResourceAsStream("C:/Users/CloudStorage3/CloudServer3/src/main/resources/png1.png")));
        } catch(Exception e){
            System.out.println("Не удалось загрузить значок");
        }



//        Stage window = new Stage(StageStyle.DECORATED);
//        window.initStyle(StageStyle.UTILITY);
//        window.show(); //page 78 книга JavaFX
//        window.setWidth(234);
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Старт Серверного приложения");
        launch(args);
        System.out.println("Экранов: "+ Screen.getScreens().size());
    }

    @Override
    public void stop() throws Exception {
        System.out.println("метод stop()");
    }
}
