
import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Set;


import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.*;
import org.json.JSONObject;
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
    double[] cordy = new double[25]; 
    int[] cordx = new int[25];
    int marg = 60;  
    
    public static double[]  api() throws IOException, InterruptedException {
        {
        double[] values =new double[25]; 
        
         
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&outputsize=full&apikey=R04RTX8ET873O08X";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse <String> response  =client.send(request, HttpResponse.BodyHandlers.ofString());
        String info = response.body();

            
            JSONObject obj = new JSONObject(info);
            
 
            JSONObject time = obj.getJSONObject("Time Series (5min)");
            
            
            Set<String> key = time.keySet();
            String[] keys= key.toArray(new String[key.size()]);
            
            for(int i=0; i<25; i++){
                String l=time.getJSONObject(keys[i]).getString("3. low");
                values[i] = Double.parseDouble(l);
            }
           return values;
           
        }
    };

    
    

    
    
      
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
         
       

        try {
            cordy=api();
            for(int i=0;i<=24;i++){
                cordx[i]=(i+1)*10;
            }
        } catch (IOException ex) {
            Logger.getLogger(graphplot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(graphplot.class.getName()).log(Level.SEVERE, null, ex);
        }
          for (int i=0;i<25;i++){
              graph.fill(new Ellipse2D.Double(marg+cordx[i],height-marg-cordy[i], 4, 4));
          }
          
           for(int j=0; j<cordx.length-1;j++){
            graph.draw(new Line2D.Double(marg+cordx[j],height-marg-cordy[j],marg+cordx[j+1],height-marg-cordy[j+1]));
//                        
//            
        }
        
    }  
      

    
    
    

}
// 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