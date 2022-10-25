
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;
;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author satyam
 */
public class graphplot extends JPanel{
    int[] cordy = {65, 20, 15, 100,80}; 
    int[] cordx = {10,20,30,40,50};
    int marg = 60;  
      
    protected void paintComponent(Graphics grf){  
        //create instance of the Graphics to use its methods  
        super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;  
          
        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get width and height  
        int width = getWidth();  
        int height = getHeight();  
          
        // draw graph  
        graph.draw(new Line2D.Double(marg, marg, marg, height-marg));  
        graph.draw(new Line2D.Double(marg, height-marg, width-marg, height-marg));  
          
          
          
        //set color for points  
        graph.setPaint(Color.RED);  
          
        // set points to the graph  
        for(int i=0; i<5; i++){  
            double x1 = marg+cordx[i];  
            double y1 = height-marg-cordy[i];  
            graph.fill(new Ellipse2D.Double(x1,y1 , 4, 4));  
            
        }  
    }  
      
    //create getMax() method to find maximum value  
//    private int getMax(){  
//        int max = -Integer.MAX_VALUE;  
//        for(int i=0; i<cord.length; i++){  
//            if(cord[i]>max)  
//                max = cord[i];  
//             
//        }  
//        return max;  
//    }  

}
// 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