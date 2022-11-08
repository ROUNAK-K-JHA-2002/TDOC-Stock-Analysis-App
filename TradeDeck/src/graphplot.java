
import java.awt.*;
import java.awt.geom.*;


import javax.swing.*;

public class graphplot extends JPanel{

   
    double[] cordy = new double[25]; 
    int[] cordx = new int[25];
    int marg = 60;  
    
    String[] dates = new String[25];
    

    

    
    
      
    protected void paintComponent(Graphics grf){ 
        
        
        
        
        //create instance of the Graphics to use its methods  
        super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;  
          
        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get width and height  

        int height = getHeight();  

        // draw graph  
        graph.draw(new Line2D.Double(marg+750, marg, marg+750, height-marg));  
        graph.draw(new Line2D.Double(-0, height-marg, marg+750, height-marg));  
          
        graph.setPaint(new Color(82, 79, 79));  
          for(int i=0;i<=24;i++){
                cordx[i]=(i+1)*30;
                if(i%2==0){
                graph.draw(new Line2D.Double(-0,height - marg-(i+1)*20, marg+750,height - marg-(i+1)*20));
                }
                if(i==24){
                    break;
                }
                graph.draw(new Line2D.Double(marg+(i+1)*30, marg, marg+(i+1)*30, height-marg));
                
            }  
         
 
             graph.setPaint(Color.RED);  



           
             graph.setFont(new Font("TimesRoman", Font.PLAIN, 10)); 

             for(int i=0;i<=24;i++){
                 if(i%2==0){
                 graph.drawString(dates[i], marg+(i+1)*30-25, height-marg+20);
                 graph.drawString(Integer.toString(height-marg-343-((24-i)*7)),marg+770,height-marg-(i+1)*20);
                 
             }
             }

             

          for (int i=0;i<25;i++){
              
              graph.fill(new Ellipse2D.Double(marg+cordx[i],height-marg-(cordy[i]*3)+250, 4, 4));
          }
          
           for(int j=0; j<cordx.length-1;j++){
            graph.draw(new Line2D.Double(marg+cordx[j],height-marg-(cordy[j]*3)+250,marg+cordx[j+1],height-marg-(cordy[j+1]*3)+250));
            
        }
        
    }  
      

    
    
    

}
// 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