import java.awt.*;
import java.awt.geom.*;
import java.util.Arrays;


import javax.swing.*;

public class Candlestick extends JPanel{
    
    int[] low = new int[25];
    int[] high = new int[25];
    int[] open =new int[25];
    int[] close = new int[25];
    
    
    int[] cordx =new int[25];
    

    
    String[] dates = new String[25];
    
    int marg = 60;
     protected void paintComponent(Graphics cs){
        super.paintComponent(cs);  
        Graphics2D candlestick = (Graphics2D)cs;  
        
         candlestick.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get width and height  

        for(int i=0;i<=24;i++){
            cordx[i]=(i+1)*30;
        }
        
        int height = getHeight(); 
                // draw graph  
        candlestick.draw(new Line2D.Double(marg+750, marg, marg+750, height-marg));  
        candlestick.draw(new Line2D.Double(0, height-marg, marg+750, height-marg)); 

            for(int j=0;j<25;j++){
                if(open[j]<=close[j]){
                    candlestick.setPaint(new Color(34, 201, 95));  
                    candlestick.draw(new Line2D.Double(marg+cordx[j],height-marg-(low[j]*3)+250,marg+cordx[j],height-marg-(open[j]*3)+250));
                    candlestick.fillRect(marg+cordx[j]-7,height-marg-(close[j]*3)+250, 14, (close[j]-open[j])*3);
                    candlestick.draw(new Line2D.Double(marg+cordx[j],height-marg-(close[j]*3)+250,marg+cordx[j],height-marg-(high[j]*3)+250));
                }else{
                    candlestick.setPaint(Color.RED); 
                    candlestick.draw(new Line2D.Double(marg+cordx[j],height-marg-(low[j]*3)+250,marg+cordx[j],height-marg-(open[j]*3)+250));
                    candlestick.fillRect(marg+cordx[j]-7,height-marg-(open[j]*3)+250, 14, (open[j]-close[j])*3);
                    candlestick.draw(new Line2D.Double(marg+cordx[j],height-marg-(close[j]*3)+250,marg+cordx[j],height-marg-(high[j]*3)+250));
                }
                
                
            
        }

        
        
     }
    
}
