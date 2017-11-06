/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepattern;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Jesper
 */
public class ShapePatternController implements Initializable
{
    
    private Label label;
    @FXML
    private Button draw;
    @FXML
    private Label labelSize;
    @FXML
    private TextField size;
    @FXML
    private ListView<?> listShapes;
    @FXML
    private Button add;
    @FXML
    private ComboBox<?> dropdownShapes;
    @FXML
    private ComboBox<?> dropdownPattern;
    @FXML
    private Canvas canvas;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
