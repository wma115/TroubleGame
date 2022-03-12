/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troublegame;
import java.awt.event.*;
import java.awt.*;

public class PegChoice extends javax.swing.JFrame {

    public int pegChosen;
    public int moveChosen;
    public Movement move;
    private boolean End;
    
    /**
     * Creates new form PegChoice
     */
    public PegChoice() {
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

        pegGroup = new javax.swing.ButtonGroup();
        BasePanelPeg = new javax.swing.JPanel();
        pegText = new javax.swing.JLabel();
        pegRadio1 = new javax.swing.JRadioButton();
        pegRadio2 = new javax.swing.JRadioButton();
        pegRadio3 = new javax.swing.JRadioButton();
        pegRadio4 = new javax.swing.JRadioButton();
        confirmMoveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pegText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pegText.setText("Choose the Peg you wish to move:");

        pegGroup.add(pegRadio1);
        pegRadio1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pegRadio1.setText("Peg 1");
        pegRadio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pegRadio1ItemStateChanged(evt);
            }
        });

        pegGroup.add(pegRadio2);
        pegRadio2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pegRadio2.setText("Peg 2");
        pegRadio2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pegRadio2ItemStateChanged(evt);
            }
        });

        pegGroup.add(pegRadio3);
        pegRadio3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pegRadio3.setText("Peg 3");
        pegRadio3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pegRadio3ItemStateChanged(evt);
            }
        });

        pegGroup.add(pegRadio4);
        pegRadio4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pegRadio4.setText("Peg 4");
        pegRadio4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pegRadio4ItemStateChanged(evt);
            }
        });

        confirmMoveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmMoveButton.setText("Confirm");
        confirmMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmMoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasePanelPegLayout = new javax.swing.GroupLayout(BasePanelPeg);
        BasePanelPeg.setLayout(BasePanelPegLayout);
        BasePanelPegLayout.setHorizontalGroup(
            BasePanelPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelPegLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(BasePanelPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BasePanelPegLayout.createSequentialGroup()
                        .addGroup(BasePanelPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pegRadio2)
                            .addComponent(pegRadio1)
                            .addComponent(pegRadio3)
                            .addComponent(pegRadio4))
                        .addGap(105, 105, 105)
                        .addComponent(confirmMoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pegText))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        BasePanelPegLayout.setVerticalGroup(
            BasePanelPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelPegLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(pegText)
                .addGap(56, 56, 56)
                .addComponent(pegRadio1)
                .addGroup(BasePanelPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasePanelPegLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pegRadio2)
                        .addGap(18, 18, 18)
                        .addComponent(pegRadio3))
                    .addGroup(BasePanelPegLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(confirmMoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pegRadio4)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanelPeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanelPeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @return 
     */
    public boolean endGame(){
        //Sees if game is over
        Pegs peg = Pegs.valueOf(move.currTurn());
        if (peg.getPeg1() < 0 && peg.getPeg2() < 0 && peg.getPeg3() < 0 && peg.getPeg4() < 0){
            End = true;
        }else {
            End = false;
        }
        return End;
    }
    
    //Makes the move based on current peg choice and movement choice
    private void confirmMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmMoveButtonActionPerformed
        MoveChoice m = new MoveChoice();
        move.pegNum = pegChosen;
        if(moveChosen == 1){
            move.normMove();
            move.chgTurn();
        }
        if(moveChosen == 2){
            move.homeMove();
            move.makeMove();
            //m.move = move;
            m.setVisible(true);
            this.setVisible(false);
        }
        if(moveChosen == 3){
            move.finishMove();
            if(endGame() == true){
                System.out.println("The Winner is " + move.currTurn() + "!");
                System.exit(0);
            }
            move.chgTurn();
        }
        System.out.println("It is " + move.currTurn() + "s turn!");
        this.setVisible(false);
    }//GEN-LAST:event_confirmMoveButtonActionPerformed

    //selects peg 1
    private void pegRadio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pegRadio1ItemStateChanged
        pegChosen = 1;
    }//GEN-LAST:event_pegRadio1ItemStateChanged

    //selects peg 2
    private void pegRadio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pegRadio2ItemStateChanged
        pegChosen = 2;
    }//GEN-LAST:event_pegRadio2ItemStateChanged

    //selects peg 3
    private void pegRadio3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pegRadio3ItemStateChanged
        pegChosen = 3;
    }//GEN-LAST:event_pegRadio3ItemStateChanged

    //selects peg 4
    private void pegRadio4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pegRadio4ItemStateChanged
        pegChosen = 4;
    }//GEN-LAST:event_pegRadio4ItemStateChanged

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
            java.util.logging.Logger.getLogger(PegChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanelPeg;
    private javax.swing.JButton confirmMoveButton;
    private javax.swing.ButtonGroup pegGroup;
    private javax.swing.JRadioButton pegRadio1;
    private javax.swing.JRadioButton pegRadio2;
    private javax.swing.JRadioButton pegRadio3;
    private javax.swing.JRadioButton pegRadio4;
    private javax.swing.JLabel pegText;
    // End of variables declaration//GEN-END:variables
}
