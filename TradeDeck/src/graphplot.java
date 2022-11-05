
import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.*;


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
    String keyword;
   
    double[] cordy = new double[25]; 
    int[] cordx = new int[25];
    int marg = 60;  
    
    static String[] dates = new String[25];
    
    public static double[]  api(String keyword) throws IOException, InterruptedException {
        {
        double[] values =new double[25]; 
        
         
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+keyword+"&outputsize=full&apikey=R04RTX8ET873O08X";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse <String> response  =client.send(request, HttpResponse.BodyHandlers.ofString());
        String info = response.body();


            JSONObject obj = new JSONObject(info);
            
 
            JSONObject time = obj.getJSONObject("Time Series (Daily)");
            
            
            Set<String> key = time.keySet();
            String[] keys= key.toArray(new String[key.size()]);
            
            Arrays.sort(keys);
            
            for(int i =0; i<25;i++){
                dates[i]=keys[keys.length-1-i];
            }
            Arrays.sort(dates);

            
            
            for(int i=0; i<25; i++){
                String l=time.getJSONObject(dates[i]).getString("3. low");
                values[i] = Double.parseDouble(l);
            }
            System.out.println(Arrays.toString(values));
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
        graph.draw(new Line2D.Double(marg+750, marg, marg+750, height-marg));  
        graph.draw(new Line2D.Double(marg-width, height-marg, marg+750, height-marg));  
          
        graph.setPaint(new Color(82, 79, 79));  
          for(int i=0;i<=24;i++){
                cordx[i]=(i+1)*30;
                if(i%2==0){
                graph.draw(new Line2D.Double(marg-width,height - marg-(i+1)*20, marg+750,height - marg-(i+1)*20));
                }
                if(i==24){
                    break;
                }
                graph.draw(new Line2D.Double(marg+(i+1)*30, marg, marg+(i+1)*30, height-marg));
                
            }  
         
        //set color for points  
             graph.setPaint(Color.RED);  

        // set points to the graph  


        try {
           
             graph.setFont(new Font("TimesRoman", Font.PLAIN, 10)); 
             cordy=api(keyword);
             for(int i=0;i<=24;i++){
                 if(i%2==0){
                 graph.drawString(dates[i], marg+(i+1)*30-25, height-marg+20);
                 graph.drawString(Integer.toString(height-marg-343-((24-i)*7)),marg+770,height-marg-(i+1)*20);
                 
             }
             }
             
//             for(int i=){
//                 graph.drawString(Integer.toString((height-marg-(24-i-1))/3), marg+770,height-marg-(i+1)*20);
//             }
             
        } catch (IOException ex) {
            Logger.getLogger(graphplot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(graphplot.class.getName()).log(Level.SEVERE, null, ex);
        }
          for (int i=0;i<25;i++){
              
              graph.fill(new Ellipse2D.Double(marg+cordx[i],height-marg-(cordy[i]*3)+250, 4, 4));
          }
          
           for(int j=0; j<cordx.length-1;j++){
            graph.draw(new Line2D.Double(marg+cordx[j],height-marg-(cordy[j]*3)+250,marg+cordx[j+1],height-marg-(cordy[j+1]*3)+250));
//                        
//            
        }
        
    }  
      

    
    
    

}
// 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