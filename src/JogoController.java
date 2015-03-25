/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;


import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;


  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.geom.Rectangle2D;  
import javax.swing.JPanel;  

import java.awt.Graphics;  
import java.awt.image.BufferedImage;  
import java.nio.Buffer;  
  
import javax.swing.JFrame;  
/** 
/**
 * 
 */

/**
 * FXML Controller class
 *
 * @author servidor
 */


public class JogoController implements Initializable {

 /*   
 int a;
 int b;
 int c;
 int d;
 int e;
 
 int f;
 int g;
 int h;
 int i;
 int j; */
 
 int resultado1;
 int resultado2;
 
 Random rand = new Random(System.currentTimeMillis());

 @FXML
  Rectangle caixa;
 
  @FXML
  Label valor1;
  
  @FXML
  Label valor2;
  
  @FXML
  Label opcao;
  
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       int a = numeroAleatorio();
       int b = numeroAleatorio();
       int c = numeroAleatorio();
       int d = numeroAleatorio();
       int e = numeroAleatorio();
               
       int f = numeroAleatorio();
       int g = numeroAleatorio();
       int h = numeroAleatorio();
       int i = numeroAleatorio();
       int j = numeroAleatorio();
        // TODO
  
       valor1.setText( a + "x" + b + "+" + c + "-("+ d + "/" +  e + ")");
       valor2.setText( f + "x" + g + "+" + h + "-("+ i + "/" +  j + ")");
       
       resultado1 = a*b+c-(d/e);
       resultado2 = f*b+c-(d/e);
       
      
       
       
        
       if (resultado1 > resultado2 && opcao.getText() == ">"){           
           
         //  caixa.setFill(Color.GREEN);
           
           caixa.add(caixa);
           caixa.setRect(caixa);
           
         
           caixa.fill(Color.BISQUE);
                   
                   
                   
       }
       if (resultado2 > resultado1){
       
       
            
       }
       if (resultado1==resultado2){
           
           
           
       }
       
    }
    
    
    
    
    
    
    
    
    
    
    
    // ---------------------------------------------------------
   
 
 
 
           // lógica para gerar os numeros aleatórios
            public int numeroAleatorio (){
               int x;
                
                // Integer[] numerosAleatorios = new Integer[10];
                
                x = rand.nextInt(20);
                
                
                return x;
    
            }
                
               
            

               
            
            //------------------------------------


    
    
    
    // ----------------------------------------------------------
    
}
