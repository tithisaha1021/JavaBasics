package fx.mavenproject1;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) {
        /*---------0----------------
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);*/
        /*-----------1----------
        Button btn1= new Button("Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
            System.out.println("Wellcome to my first app");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        Scene scene=new Scene(root,600,300);
        stage.setScene(scene);
        stage.setTitle("Frist javafx app");
        stage.show();*/
        /*----------2.Login program--------------
        stage.setTitle("Javafx welcome");
        GridPane grid=new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        //Add texe,labels and textfield
        Text scenetitle=new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0,2,1);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        //Add a button and a text
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        //Handle an event
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }});

        Scene scene=new Scene(grid,300,275);
        stage.setScene(scene);
        stage.show();*/
        //-----------3.Temperature conversion program-----------
        /*stage.setTitle("Temperature value conversion");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Welcome");
        Label promt = new Label("Enter the temperature value");
        promt.setPrefSize(200, 30);
        TextField tempVal = new TextField();
        Button btn1 = new Button("Celsius to Fahrenheit ");
        Button btn2 = new Button("Fahrenheit to Celsius ");
        TextField res = new TextField();
        grid.add(scenetitle, 0, 0);
        grid.add(promt, 0, 1);
        grid.add(tempVal,1, 1);
        grid.add(btn1, 0, 2);
        grid.add(btn2, 1, 2);
        grid.add(res, 0, 3);
        
        //code for temerature conversion....
        
        Scene scene = new Scene(grid, 500, 300);
        stage.setScene(scene);
        stage.show();*/
        //--------------4.Menu program--------
        MenuBar menubar = new MenuBar();
        /*Menu number = new Menu("Number");
        MenuItem add = new MenuItem("Addition");
        add.setOnAction(actionEvent -> this.onadd());
        MenuItem sub = new MenuItem("Subtraction");
        MenuItem mul = new MenuItem("Multiplication");
        MenuItem div = new MenuItem("Division");
        number.getItems().addAll(add,sub,mul,div);*/
      
        Menu str = new Menu("String");
        MenuItem copy = new MenuItem("Copy");
        copy.setOnAction(actionEvent -> this.oncopy());
        MenuItem len = new MenuItem("Length");
        len.setOnAction(actionEvent -> this.onlen());
        MenuItem concat = new MenuItem("Concatenate");
        concat.setOnAction(actionEvent -> this.onconcat());
        MenuItem compare = new MenuItem("Compare");
        compare.setOnAction(actionEvent -> this.oncompare());
        str.getItems().addAll(copy,len,concat,compare);
      
        Menu quit = new Menu("Quit");
        MenuItem exit = new MenuItem("Exit from the application");
        exit.setOnAction(actionEvent -> Platform.exit());
        quit.getItems().add(exit);
      
        menubar.getMenus().addAll( str,quit);
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp, 300, 250, Color.WHITE);
        bp.setTop(menubar);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    /*void onadd()
    {
        //Reading first input for addition
        TextInputDialog ip1 = new TextInputDialog();
        ip1.setHeaderText("Give your input....");
        ip1.setContentText("Enter an integer ");
        Optional<String> val1 = ip1.showAndWait();
        //Reading second input for addition
        TextInputDialog ip2 = new TextInputDialog();
        ip2.setHeaderText("Give your input....");
        ip2.setContentText("Enter an integer ");
        Optional<String> val2 = ip2.showAndWait();
        //Converting string to int
        int i1=Integer.parseInt(val1.get());
        int i2=Integer.parseInt(val2.get());
        //Displaying sum
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("The result is...");
        alert.setContentText("Sum of the inputs is "+(i1+i2));
        alert.showAndWait();
    }*/
    void oncopy() { 
        //Reading input for addition
        TextInputDialog ip1 = new TextInputDialog();
        ip1.setHeaderText("Give your input....");
        ip1.setContentText("Enter a String ");
        Optional<String> val1 = ip1.showAndWait();
        String str = val1.get();
        String s=str;
        str="changed";
        //Displaying Copied string
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("The copied string is:\t"+s); 
        alert.showAndWait(); 
    }

    private void onlen() {
        //Reading input for addition
        TextInputDialog ip1 = new TextInputDialog();
        ip1.setHeaderText("Give your input....");
        ip1.setContentText("Enter a String ");
        Optional<String> val1 = ip1.showAndWait();
        String s = val1.get();
        //Displaying Copied string
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("The length of the string is:\t"+s.length()); 
        alert.showAndWait(); 
        }

    private void onconcat() {
        //Reading input for addition
        TextInputDialog ip1 = new TextInputDialog();
        ip1.setHeaderText("Give your input....");
        ip1.setContentText("Enter 1st String ");
        Optional<String> val1 = ip1.showAndWait();
        ip1.setContentText("Enter 2nd String ");
        Optional<String> val2 = ip1.showAndWait();
        String s = val1.get();
        String ss = val2.get();
        //Displaying Copied string
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("The cancatenated string is:\t"+s+ss); 
        alert.showAndWait();
      }

    private void oncompare() {
        //Reading input for addition
        TextInputDialog ip1 = new TextInputDialog();
        ip1.setHeaderText("Give your input....");
        ip1.setContentText("Enter 1st String ");
        Optional<String> val1 = ip1.showAndWait();
        ip1.setContentText("Enter 2nd String ");
        Optional<String> val2 = ip1.showAndWait();
        String s = val1.get();
        String ss = val2.get();
        //Displaying Copied string
        Alert alert = new Alert(AlertType.INFORMATION);
        if(s.equals(ss)){
        alert.setHeaderText("1st and 2nd strings are equal"); }
        else{alert.setHeaderText("1st and 2nd strings are not equal");
        }
        alert.showAndWait();
    }

}