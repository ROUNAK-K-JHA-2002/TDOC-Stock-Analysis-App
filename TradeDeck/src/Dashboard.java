
import java.awt.Color;
import java.awt.Cursor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

import org.json.*;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
        Homebtn = new javax.swing.JButton();
        Wtchlstbtn = new javax.swing.JButton();
        portfoliobtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        sidebar = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        home_tab = new javax.swing.JPanel();
        home_panel = new javax.swing.JPanel();
        watchlist_tab = new javax.swing.JPanel();
        search_result_panel = new javax.swing.JPanel();
        search_textfield = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        portfolio_tab = new javax.swing.JPanel();
        company_page = new javax.swing.JPanel();
        graphplot2 = new graphplot();

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title_label)
                .addGap(63, 63, 63)
                .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Wtchlstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(portfoliobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1064, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Wtchlstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(portfoliobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, -1, 280));

        sidebar.setBackground(new java.awt.Color(59, 42, 42));
        sidebar.setPreferredSize(new java.awt.Dimension(300, 950));

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 920));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1600, 1000));

        home_tab.setBackground(new java.awt.Color(51, 51, 51));
        home_tab.setForeground(new java.awt.Color(153, 153, 153));

        home_panel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1368, Short.MAX_VALUE)
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout home_tabLayout = new javax.swing.GroupLayout(home_tab);
        home_tab.setLayout(home_tabLayout);
        home_tabLayout.setHorizontalGroup(
            home_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_tabLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(home_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        home_tabLayout.setVerticalGroup(
            home_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_tabLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(home_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", home_tab);

        javax.swing.GroupLayout search_result_panelLayout = new javax.swing.GroupLayout(search_result_panel);
        search_result_panel.setLayout(search_result_panelLayout);
        search_result_panelLayout.setHorizontalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
        );
        search_result_panelLayout.setVerticalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout watchlist_tabLayout = new javax.swing.GroupLayout(watchlist_tab);
        watchlist_tab.setLayout(watchlist_tabLayout);
        watchlist_tabLayout.setHorizontalGroup(
            watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(watchlist_tabLayout.createSequentialGroup()
                .addGroup(watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(watchlist_tabLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(watchlist_tabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(search_result_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        watchlist_tabLayout.setVerticalGroup(
            watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(watchlist_tabLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(watchlist_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search_result_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
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
            .addGap(0, 970, Short.MAX_VALUE)
        );
        graphplot2Layout.setVerticalGroup(
            graphplot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        company_page.add(graphplot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 970, 650));

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
                        
                        graphplot2.keyword = symbol;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton Wtchlstbtn;
    private javax.swing.JPanel company_page;
    private graphplot graphplot2;
    private javax.swing.JPanel home_panel;
    private javax.swing.JPanel home_tab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JPanel portfolio_tab;
    private javax.swing.JButton portfoliobtn;
    private javax.swing.JPanel search_result_panel;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JButton searchbtn;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel title_label;
    private javax.swing.JPanel topbar;
    private javax.swing.JPanel watchlist_tab;
    // End of variables declaration//GEN-END:variables
}
