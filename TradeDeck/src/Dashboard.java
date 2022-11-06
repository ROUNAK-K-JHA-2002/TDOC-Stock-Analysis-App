
import java.awt.Color;
import java.awt.Cursor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

import org.json.*;

public class Dashboard extends javax.swing.JFrame {
    
    
    static ArrayList<String> companies = new ArrayList<String>();
    static ArrayList<String> symbols = new ArrayList<String>();;
    
    public static void search(String keyword) throws IOException, InterruptedException{
        String url = "https://www.alphavantage.co/query?function=SYMBOL_SEARCH&keywords="+keyword+"&apikey=R04RTX8ET873O08X";
            companies.clear();
            symbols.clear();
            
            
        
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            HttpClient client = HttpClient.newBuilder().build();
            HttpResponse <String> response  =client.send(request, HttpResponse.BodyHandlers.ofString());
//           

                
                JSONObject searchResults = new JSONObject(response.body());
                JSONArray bestMatches = searchResults.getJSONArray("bestMatches");

               ArrayList<JSONObject> results = new ArrayList<JSONObject>() ;
               for(int i=0 ; i<bestMatches.length();i++){
               JSONObject result= (JSONObject)bestMatches.get(i);
               results.add(result);
               companies.add(result.getString("2. name"));
               symbols.add(result.getString("1. symbol"));
               
               }
               
    }
    static String[] dates = new String[25];
    static String low="";
    static String high="";
    static String open="";
    static String close="";
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

            low=(time.getJSONObject(dates[0]).getString("3. low"));
            high=(time.getJSONObject(dates[0]).getString("2. high"));
            open = (time.getJSONObject(dates[0]).getString("1. open"));
            
            close = (time.getJSONObject(dates[0]).getString("4. close"));
            
            for(int i=0; i<25; i++){
                String l=time.getJSONObject(dates[i]).getString("3. low");
                values[i] = Double.parseDouble(l);
            }

           return values;
           
        }
    };

    

    public Dashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topbar = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title_label = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        Homebtn = new javax.swing.JButton();
        Wtchlstbtn = new javax.swing.JButton();
        portfoliobtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        home_tab = new javax.swing.JPanel();
        home_panel = new javax.swing.JPanel();
        search_textfield = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        search_result_panel = new javax.swing.JPanel();
        watchlist_tab = new javax.swing.JPanel();
        portfolio_tab = new javax.swing.JPanel();
        company_page = new javax.swing.JPanel();
        graphplot2 = new graphplot();
        stats_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Low_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        high_label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        open_label = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        close_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(121, 121));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbar.setBackground(new java.awt.Color(255, 61, 73));
        topbar.setPreferredSize(new java.awt.Dimension(1930, 100));

        logo_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel2.setText("|");

        title_label.setFont(new java.awt.Font("Samanata", 1, 24)); // NOI18N
        title_label.setText("TradeDeck");

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(logo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_label)
                .addContainerGap(1736, Short.MAX_VALUE))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, -1, 280));

        sidebar.setBackground(new java.awt.Color(59, 42, 42));
        sidebar.setPreferredSize(new java.awt.Dimension(300, 950));

        Homebtn.setBackground(new java.awt.Color(0, 0, 0));
        Homebtn.setForeground(new java.awt.Color(255, 102, 102));
        Homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home.png"))); // NOI18N
        Homebtn.setText("Home");
        Homebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });
        //Homebtn.setborder(set BorderRadius(10))

        Wtchlstbtn.setBackground(new java.awt.Color(0, 0, 0));
        Wtchlstbtn.setForeground(new java.awt.Color(255, 102, 102));
        Wtchlstbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/watchlist_white.png"))); // NOI18N
        Wtchlstbtn.setText("Watchlist");
        Wtchlstbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        Wtchlstbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Wtchlstbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtchlstbtnActionPerformed(evt);
            }
        });

        portfoliobtn.setBackground(new java.awt.Color(0, 0, 0));
        portfoliobtn.setForeground(new java.awt.Color(255, 102, 102));
        portfoliobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/portfolio_white.png"))); // NOI18N
        portfoliobtn.setText("Portfolio");
        portfoliobtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        portfoliobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        portfoliobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portfoliobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wtchlstbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addComponent(Homebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(portfoliobtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Wtchlstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(portfoliobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(641, Short.MAX_VALUE))
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 920));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1600, 1000));

        home_tab.setBackground(new java.awt.Color(255, 255, 255));
        home_tab.setForeground(new java.awt.Color(0, 0, 0));

        home_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_panel.setForeground(new java.awt.Color(0, 0, 0));

        search_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textfieldActionPerformed(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        search_result_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout search_result_panelLayout = new javax.swing.GroupLayout(search_result_panel);
        search_result_panel.setLayout(search_result_panelLayout);
        search_result_panelLayout.setHorizontalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        search_result_panelLayout.setVerticalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1095, Short.MAX_VALUE))
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(search_result_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(search_result_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout home_tabLayout = new javax.swing.GroupLayout(home_tab);
        home_tab.setLayout(home_tabLayout);
        home_tabLayout.setHorizontalGroup(
            home_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_tabLayout.createSequentialGroup()
                .addComponent(home_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        home_tabLayout.setVerticalGroup(
            home_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_tabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("tab1", home_tab);

        javax.swing.GroupLayout watchlist_tabLayout = new javax.swing.GroupLayout(watchlist_tab);
        watchlist_tab.setLayout(watchlist_tabLayout);
        watchlist_tabLayout.setHorizontalGroup(
            watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1595, Short.MAX_VALUE)
        );
        watchlist_tabLayout.setVerticalGroup(
            watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", watchlist_tab);

        javax.swing.GroupLayout portfolio_tabLayout = new javax.swing.GroupLayout(portfolio_tab);
        portfolio_tab.setLayout(portfolio_tabLayout);
        portfolio_tabLayout.setHorizontalGroup(
            portfolio_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1595, Short.MAX_VALUE)
        );
        portfolio_tabLayout.setVerticalGroup(
            portfolio_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", portfolio_tab);

        company_page.setBackground(new java.awt.Color(51, 51, 51));
        company_page.setForeground(new java.awt.Color(102, 102, 102));
        company_page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphplot2.setBackground(new java.awt.Color(51, 51, 51));
        graphplot2.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout graphplot2Layout = new javax.swing.GroupLayout(graphplot2);
        graphplot2.setLayout(graphplot2Layout);
        graphplot2Layout.setHorizontalGroup(
            graphplot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        graphplot2Layout.setVerticalGroup(
            graphplot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        company_page.add(graphplot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1370, 650));

        Low_label.setText("Todays lowest stock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Low_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(Low_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(43, 43, 43)))
        );

        high_label.setText("Todays Highest Stock");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(high_label, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(high_label, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        open_label.setText("open");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(open_label, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(open_label, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        close_label.setText("close");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close_label, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close_label, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout stats_panelLayout = new javax.swing.GroupLayout(stats_panel);
        stats_panel.setLayout(stats_panelLayout);
        stats_panelLayout.setHorizontalGroup(
            stats_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stats_panelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stats_panelLayout.setVerticalGroup(
            stats_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stats_panelLayout.createSequentialGroup()
                .addGroup(stats_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stats_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(stats_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(stats_panelLayout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        company_page.add(stats_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 140));

        jTabbedPane1.addTab("tab4", company_page);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -30, -1, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_HomebtnActionPerformed

    private void WtchlstbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtchlstbtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_WtchlstbtnActionPerformed

    private void portfoliobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portfoliobtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_portfoliobtnActionPerformed

    private void search_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_textfieldActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String keyword = search_textfield.getText();
        ArrayList<javax.swing.JLabel> companylabels = new ArrayList<javax.swing.JLabel>();
        

        try {
            search(keyword);
            search_textfield.setText("");
            for(int i=0; i<companies.size();i++){
                companylabels.add(new javax.swing.JLabel(companies.get(i) + "(" + symbols.get(i)+ ")"));
                companylabels.get(i).setBounds(410, 80+(i*50), 350, 50);
                companylabels.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
                companylabels.get(i).setBorder(BorderFactory.createLineBorder(Color.black));
                String symbol = symbols.get(i);
                companylabels.get(i).addMouseListener(new MouseAdapter(){
                
                    public void mousePressed(MouseEvent me){
                        
                        try {
                            graphplot2.cordy= api(symbol);
                            graphplot2.dates=dates;
                            
                            Low_label.setText("Today's lowest stock : "+(low));
                            high_label.setText("Todays's highses stock :" +high);
                            open_label.setText("Todays's highses stock :" +open);
                            close_label.setText("Todays's highses stock :" +close);
                            

                        } catch (IOException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                       
                        jTabbedPane1.setSelectedIndex(3);
                
                    }

                });
                
            }
            
            search_result_panel.removeAll();
            for(int i =0 ;i<companylabels.size();i++){
                
                search_result_panel.add(companylabels.get(i));
                search_result_panel.validate();
                search_result_panel.repaint();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, InterruptedException  {
        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
            
            });         
         

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JLabel Low_label;
    private javax.swing.JButton Wtchlstbtn;
    private javax.swing.JLabel close_label;
    private javax.swing.JPanel company_page;
    private graphplot graphplot2;
    private javax.swing.JLabel high_label;
    private javax.swing.JPanel home_panel;
    private javax.swing.JPanel home_tab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel open_label;
    private javax.swing.JPanel portfolio_tab;
    private javax.swing.JButton portfoliobtn;
    private javax.swing.JPanel search_result_panel;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JButton searchbtn;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel stats_panel;
    private javax.swing.JLabel title_label;
    private javax.swing.JPanel topbar;
    private javax.swing.JPanel watchlist_tab;
    // End of variables declaration//GEN-END:variables
}
