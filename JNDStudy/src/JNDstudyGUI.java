
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiffany
 */
public class JNDstudyGUI extends javax.swing.JFrame {

    /**
     * Creates new form JNDstudyGUI
     */
    int count = 0;
    
    boolean refIsOne = true;
    boolean goingUp = false;
    //Ignores the reversal added when the user gets the first reference
    boolean firstReversal = false; 
    int numRefSelected = 0;
    int comparison = 10;
    ArrayList<URL> images = new ArrayList<>();
    ArrayList<Integer> reversals = new ArrayList<>();
    public JNDstudyGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTPbutton = new javax.swing.JButton();
        tpButton = new javax.swing.JButton();
        bpbutton = new javax.swing.JButton();
        bpbutton1 = new javax.swing.JButton();
        box1 = new javax.swing.JLabel();
        box2 = new javax.swing.JLabel();
        counter = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTPbutton.setText("BTP");
        BTPbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPbuttonActionPerformed(evt);
            }
        });

        tpButton.setText("TP");
        tpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpButtonActionPerformed(evt);
            }
        });

        bpbutton.setText("BP");
        bpbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpbuttonActionPerformed(evt);
            }
        });

        bpbutton1.setText("orig");
        bpbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpbutton1ActionPerformed(evt);
            }
        });

        box1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box1MousePressed(evt);
            }
        });

        box2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box2MousePressed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTPbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpbutton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton)
                        .addGap(541, 541, 541)
                        .addComponent(counter)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTPbutton)
                    .addComponent(tpButton)
                    .addComponent(bpbutton)
                    .addComponent(bpbutton1)
                    .addComponent(counter)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bpbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpbuttonActionPerformed
        System.out.println("bp selected");
        URL o100 = getClass().getResource("/bunny_bp/100.png");
        URL o95 = getClass().getResource("/bunny_bp/95.png");
        URL o90 = getClass().getResource("/bunny_bp/90.png");
        URL o85 = getClass().getResource("/bunny_bp/85.png");
        URL o80 = getClass().getResource("/bunny_bp/80.png");
        URL o75 = getClass().getResource("/bunny_bp/75.png");
        URL o70 = getClass().getResource("/bunny_bp/70.png");
        URL o65 = getClass().getResource("/bunny_bp/65.png");
        URL o60 = getClass().getResource("/bunny_bp/60.png");
        URL o55 = getClass().getResource("/bunny_bp/55.png");
        URL o50 = getClass().getResource("/bunny_bp/50.png");
        URL o45 = getClass().getResource("/bunny_bp/45.png");
        URL o40 = getClass().getResource("/bunny_bp/40.png");
        URL o35 = getClass().getResource("/bunny_bp/35.png");
        URL o30 = getClass().getResource("/bunny_bp/30.png");
        URL o25 = getClass().getResource("/bunny_bp/25.png");
        images.add(o100); 
        images.add(o95);
        images.add(o90);
        images.add(o85);
        images.add(o80);
        images.add(o75);
        images.add(o70);
        images.add(o65);
        images.add(o60);
        images.add(o55);
        images.add(o50);
        images.add(o45); 
        images.add(o40);
        images.add(o35);
        images.add(o30);
        images.add(o25);
        
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_bpbuttonActionPerformed

    private void bpbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpbutton1ActionPerformed
        System.out.println("orig");
        URL o100 = getClass().getResource("/bunny_orig/100.png");
        URL o95 = getClass().getResource("/bunny_orig/95.png");
        URL o90 = getClass().getResource("/bunny_orig/90.png");
        URL o85 = getClass().getResource("/bunny_orig/85.png");
        URL o80 = getClass().getResource("/bunny_orig/80.png");
        URL o75 = getClass().getResource("/bunny_orig/75.png");
        URL o70 = getClass().getResource("/bunny_orig/70.png");
        URL o65 = getClass().getResource("/bunny_orig/65.png");
        URL o60 = getClass().getResource("/bunny_orig/60.png");
        URL o55 = getClass().getResource("/bunny_orig/55.png");
        URL o50 = getClass().getResource("/bunny_orig/50.png");
        URL o45 = getClass().getResource("/bunny_orig/45.png");
        URL o40 = getClass().getResource("/bunny_orig/40.png");
        URL o35 = getClass().getResource("/bunny_orig/35.png");
        URL o30 = getClass().getResource("/bunny_orig/30.png");
        URL o25 = getClass().getResource("/bunny_orig/25.png");
        images.add(o100); 
        images.add(o95);
        images.add(o90);
        images.add(o85);
        images.add(o80);
        images.add(o75);
        images.add(o70);
        images.add(o65);
        images.add(o60);
        images.add(o55);
        images.add(o50);
        images.add(o45); 
        images.add(o40);
        images.add(o35);
        images.add(o30);
        images.add(o25);
        
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_bpbutton1ActionPerformed

    private void box1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1MousePressed
        // user selected the reference image
        counter.setText(++count + "");
        if(refIsOne)
        {
            //System.out.println("User selected reference.");
            numRefSelected++;
            //twice in a row
            if(numRefSelected == 2)
            {
                numRefSelected = 0;
                if(!goingUp) 
                {
                    if(!firstReversal) 
                    {
                        firstReversal = true;
                    } 
                    else 
                    {
                        reversals.add(100-((comparison-1)*5));
                        if(reversals.size() >= 9) 
                        {
                            for(int r : reversals)
                                System.out.print(r + " ");
                            System.out.println();
                            double average = 0;
                            for(int i = 3; i < 9; i++)
                            {
                                average += reversals.get(i);
                            }
                            average /= 6.0; 
                            JOptionPane.showMessageDialog(null, "Done. The JND value is " + average);
                        }
                    }
//                    System.out.println("Reversal at " + (100-((comparison-1)*5)));
                }
                goingUp = true;
                comparison--;
                if(comparison == 0)
                {
                    comparison = 2;
                    goingUp = false; 
                    reversals.add(95);
                }
                //System.out.println("Mesh increased to: " + (100-((comparison)*5)));
            }
        }
        else // user selected the non-reference
        {
            numRefSelected = 0;
            //System.out.println("User selected scaled:    " + (100-(comparison*5)));
            if(goingUp) {
                firstReversal = true;
                reversals.add(100-((comparison+1)*5));
                if(reversals.size() >= 9)
                {
                    for(int r : reversals)
                                System.out.print(r + " ");
                            System.out.println();
                            double average = 0;
                            for(int i = 3; i < 9; i++)
                            {
                                average += reversals.get(i);
                            }
                            average /= 6.0; 
                            JOptionPane.showMessageDialog(null, "Done. The JND value is " + average);
                }
//                System.out.println("Reversal at " + (100-((comparison+1)*5)));
            }
            comparison++; 
            //System.out.println("Mesh decreased to: " + (100-((comparison)*5)));
            goingUp = false;
        }
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(comparison == 16)
        {
                comparison = 14; 
                reversals.add(25);
                goingUp = true;
        }
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_box1MousePressed

    private void box2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2MousePressed
        // user selected the reference image
        counter.setText(++count + "");
        if(!refIsOne)
        {
            //System.out.println("User selected reference");
            numRefSelected++;
            //twice in a row
            if(numRefSelected == 2)
            {
                numRefSelected = 0;
                if(!goingUp) 
                {
                    if(!firstReversal) 
                    {
                        firstReversal = true;
                    }
                    else 
                    {
                        reversals.add(100-((comparison-1)*5));
                        if(reversals.size() >= 9) 
                        {
                            for(int r : reversals)
                                System.out.print(r + " ");
                            System.out.println();
                            double average = 0;
                            for(int i = 3; i < 9; i++)
                            {
                                average += reversals.get(i);
                            }
                            average /= 6.0; 
                            JOptionPane.showMessageDialog(null, "Done. The JND value is " + average);
                        }
                    }
//                    System.out.println("Reversal at " + (100-((comparison-1)*5)));
                }
                goingUp = true;
                comparison--;
                if(comparison == 0)
                {
                    comparison = 2;
                    goingUp = false; 
                    reversals.add(95);
                }
                //System.out.println("Mesh increased to: " + (100-((comparison)*5)));
            }
        }
        else // user selected the non-reference
        {
            numRefSelected = 0;
            //System.out.println("User selected scaled");
            if(goingUp) 
            {
                firstReversal = true;
                reversals.add(100-((comparison+1)*5));
                if(reversals.size() >= 9) 
                {
                    for(int r : reversals)
                                System.out.print(r + " ");
                            System.out.println();
                            double average = 0;
                            for(int i = 3; i < 9; i++)
                            {
                                average += reversals.get(i);
                            }
                            average /= 6.0; 
                            JOptionPane.showMessageDialog(null, "Done. The JND value is " + average);
                }
//                System.out.println("Reversal at " + (100-((comparison+1)*5)));
            }
            comparison++;
           // System.out.println("Mesh decreased to: " + (100-((comparison)*5)));
            goingUp = false;
            if(comparison == 16)
            {   
                comparison = 14; 
                reversals.add(25);
                goingUp = true;
            }
        }
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_box2MousePressed

    private void tpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpButtonActionPerformed
        System.out.println("tp");
        URL o100 = getClass().getResource("/plane_tp/95.png");
        URL o95 = getClass().getResource("/plane_tp/95.png");
        URL o90 = getClass().getResource("/plane_tp/90.png");
        URL o85 = getClass().getResource("/plane_tp/85.png");
        URL o80 = getClass().getResource("/plane_tp/80.png");
        URL o75 = getClass().getResource("/plane_tp/75.png");
        URL o70 = getClass().getResource("/plane_tp/70.png");
        URL o65 = getClass().getResource("/plane_tp/65.png");
        URL o60 = getClass().getResource("/plane_tp/60.png");
        URL o55 = getClass().getResource("/plane_tp/55.png");
        URL o50 = getClass().getResource("/plane_tp/50.png");
        URL o45 = getClass().getResource("/plane_tp/45.png");
        URL o40 = getClass().getResource("/plane_tp/40.png");
        URL o35 = getClass().getResource("/plane_tp/35.png");
        URL o30 = getClass().getResource("/plane_tp/30.png");
        URL o25 = getClass().getResource("/plane_tp/25.png");
        images.add(o100);
        images.add(o95);
        images.add(o90);
        images.add(o85);
        images.add(o80);
        images.add(o75);
        images.add(o70);
        images.add(o65);
        images.add(o60);
        images.add(o55);
        images.add(o50);
        images.add(o45); 
        images.add(o40);
        images.add(o35);
        images.add(o30);
        images.add(o25);
        
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_tpButtonActionPerformed

    private void BTPbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPbuttonActionPerformed
        System.out.println("btp");
        URL o100 = getClass().getResource("/plane_btp/100.png");
        URL o95 = getClass().getResource("/plane_btp/95.png");
        URL o90 = getClass().getResource("/plane_btp/90.png");
        URL o85 = getClass().getResource("/plane_btp/85.png");
        URL o80 = getClass().getResource("/plane_btp/80.png");
        URL o75 = getClass().getResource("/plane_btp/75.png");
        URL o70 = getClass().getResource("/plane_btp/70.png");
        URL o65 = getClass().getResource("/plane_btp/65.png");
        URL o60 = getClass().getResource("/plane_btp/60.png");
        URL o55 = getClass().getResource("/plane_btp/55.png");
        URL o50 = getClass().getResource("/plane_btp/50.png");
        URL o45 = getClass().getResource("/plane_btp/45.png");
        URL o40 = getClass().getResource("/plane_btp/40.png");
        URL o35 = getClass().getResource("/plane_btp/35.png");
        URL o30 = getClass().getResource("/plane_btp/30.png");
        URL o25 = getClass().getResource("/plane_btp/25.png");
        images.add(o100);
        images.add(o95);
        images.add(o90);
        images.add(o85);
        images.add(o80);
        images.add(o75);
        images.add(o70);
        images.add(o65);
        images.add(o60);
        images.add(o55);
        images.add(o50);
        images.add(o45); 
        images.add(o40);
        images.add(o35);
        images.add(o30);
        images.add(o25);
        int x = (Math.random() <= 0.5) ? 1 : 2;
        if(x == 2) //reference becomes 2
        {
            box2.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box1.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = false;
        } 
        else //reference becomes 1
        {
            box1.setIcon(new javax.swing.ImageIcon(images.get(0)));
            box2.setIcon(new javax.swing.ImageIcon(images.get(comparison)));
            refIsOne = true;
        }
    }//GEN-LAST:event_BTPbuttonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        System.out.println("Resetting");
        //flush variables just in case
        count = 0;
        refIsOne = true;
        goingUp = false;
        //Ignores the reversal added when the user gets the first reference
        firstReversal = false; 
        numRefSelected = 0;
        comparison = 10;
        images = new ArrayList<>();
        reversals = new ArrayList<>();
        //flush images
        box1.setIcon(null);
        box2.setIcon(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JNDstudyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JNDstudyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JNDstudyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JNDstudyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JNDstudyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTPbutton;
    private javax.swing.JLabel box1;
    private javax.swing.JLabel box2;
    private javax.swing.JButton bpbutton;
    private javax.swing.JButton bpbutton1;
    private javax.swing.JLabel counter;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton tpButton;
    // End of variables declaration//GEN-END:variables
}
