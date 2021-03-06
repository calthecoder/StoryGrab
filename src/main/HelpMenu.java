package main;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import keeptoo.Drag;

/**
 * Help menu.
 * @author Calvin Kinateder
 */
public class HelpMenu extends javax.swing.JFrame {

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setShape(new RoundRectangle2D.Double(0, 0, 500, 400, 20, 20));

        MainPanel.setBackground(new Color(0,0,0,0));
        MainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        MainPanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        MainPanel.setkBorderRadius(20);
        MainPanel.setkEndColor(new java.awt.Color(74, 74, 122));
        MainPanel.setkGradientFocus(250);
        MainPanel.setkStartColor(new java.awt.Color(81, 91, 101));
        MainPanel.setOpaque(false);
        MainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPanelMouseDragged(evt);
            }
        });
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPanelMousePressed(evt);
            }
        });
        MainPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MainPanelKeyPressed(evt);
            }
        });
        MainPanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>"
            + "Use your AEP username and password to login. This is to"
            + " enable web traffic past the firewall. This data is not stored outside of the"
            + " JVM and is as such destroyed after termination of the program.<br>"
            + "The sources in the left pane on the main screen contain all websites"
            + " that will be searched in the program. Their colors will change depending "
            + "on the status of the link. <br><br>"
            + "<&nbsp>White, yellow, and red: in process<br>"
            + "<&nbsp>Yellow: one or more errors<br>"
            + "<&nbsp>Red: ten or more errors<br>"
            + "<&nbsp>Green: finished<br><br>"
            + "Check \"tips\" box and hover cursor over things you need help with. "
            + "<br><br>To view the output, click on the Output button. Note that this will only work once the program is finished."+
            "</html>"
        );
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MainPanel.add(jLabel4);
        jLabel4.setBounds(20, 50, 470, 280);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancel-32.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        MainPanel.add(jLabel8);
        jLabel8.setBounds(460, 10, 30, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Help Menu");
        MainPanel.add(jLabel5);
        jLabel5.setBounds(20, 10, 140, 30);

        userlbl.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        userlbl.setForeground(new java.awt.Color(255, 255, 255));
        userlbl.setText("Program written by Calvin Kinateder, 2019");
        MainPanel.add(userlbl);
        userlbl.setBounds(240, 370, 240, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel8MouseReleased

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
        // TODO add your handling code here:
        new Drag(MainPanel).moveWindow(evt);
    }//GEN-LAST:event_MainPanelMouseDragged

    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
        // TODO add your handling code here:
        new Drag(MainPanel).onPress(evt);

    }//GEN-LAST:event_MainPanelMousePressed

    private void MainPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainPanelKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_MainPanelKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel MainPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables
}
