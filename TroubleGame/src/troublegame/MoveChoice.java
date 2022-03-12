/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troublegame;
import java.awt.event.*;
import java.awt.*;

public class MoveChoice extends javax.swing.JFrame {
    
    public Movement move;
    
    /**
     * Creates new form MoveChoice
     */
    public MoveChoice() {
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

        BasePanelMove = new javax.swing.JPanel();
        moveText = new javax.swing.JLabel();
        normMbutton = new javax.swing.JButton();
        homeMbutton = new javax.swing.JButton();
        finishMbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BasePanelMove.setPreferredSize(new java.awt.Dimension(500, 500));

        moveText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        moveText.setText("What move would you like to make?");

        normMbutton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        normMbutton.setText("Normal Move");
        normMbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normMbuttonActionPerformed(evt);
            }
        });

        homeMbutton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        homeMbutton.setText("Move out of Home");
        homeMbutton.setMaximumSize(new java.awt.Dimension(200, 100));
        homeMbutton.setMinimumSize(new java.awt.Dimension(200, 100));
        homeMbutton.setPreferredSize(new java.awt.Dimension(200, 100));
        homeMbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMbuttonActionPerformed(evt);
            }
        });

        finishMbutton.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        finishMbutton.setText("Move into Finish");
        finishMbutton.setMaximumSize(new java.awt.Dimension(200, 100));
        finishMbutton.setMinimumSize(new java.awt.Dimension(200, 100));
        finishMbutton.setPreferredSize(new java.awt.Dimension(200, 100));
        finishMbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishMbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasePanelMoveLayout = new javax.swing.GroupLayout(BasePanelMove);
        BasePanelMove.setLayout(BasePanelMoveLayout);
        BasePanelMoveLayout.setHorizontalGroup(
            BasePanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelMoveLayout.createSequentialGroup()
                .addGroup(BasePanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasePanelMoveLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(moveText))
                    .addGroup(BasePanelMoveLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(BasePanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(homeMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finishMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        BasePanelMoveLayout.setVerticalGroup(
            BasePanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelMoveLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(moveText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(normMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finishMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Selects normal move and opens peg choice panel, also checks if this move is possible, ends turn if it is not
    private void normMbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normMbuttonActionPerformed
        PegChoice p = new PegChoice();
        Pegs peg = Pegs.valueOf(move.currTurn());
        if(peg.getPeg1() == 100 && peg.getPeg2() == 100 && peg.getPeg3() == 100 && peg.getPeg4() == 100){
            System.out.println("A normal move cannot be made because all pegs are in home");
            if(move.Roll == 6){
                System.out.println("An out of home move can be made");
            } else{
                System.out.println("No move can be made, " + move.currTurn() + " turn ends");
                move.chgTurn();
                System.out.println("It is " + move.currTurn() + "s turn!");
                this.setVisible(false);
            }
        }else{
            p.moveChosen = 1;
            p.move = move;
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_normMbuttonActionPerformed

    //selects move out of home and checks to see if the move is possible, if not tells user to choose another move
    private void homeMbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMbuttonActionPerformed
        PegChoice p = new PegChoice();
        Pegs peg = Pegs.valueOf(move.currTurn());
        if(move.Roll != 6){
            System.out.println("The Roll was not a six, please choose one of the other options");
        } else{
            p.moveChosen = 2;
            p.move = move;
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_homeMbuttonActionPerformed

    //Selects move into finish and checks if it is possible with current roll, if not tells user to choose another option
    private void finishMbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishMbuttonActionPerformed
        PegChoice p = new PegChoice();
        Pegs peg = Pegs.valueOf(move.currTurn());
        //Checks to see if finish move is possible
        if(move.Roll == 5 || move.Roll == 6){
            System.out.println("The Roll was over a 4, please choose one of the other options:");
        }else{
            p.moveChosen = 3;
            p.move = move;
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_finishMbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MoveChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoveChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoveChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoveChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoveChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanelMove;
    private javax.swing.JButton finishMbutton;
    private javax.swing.JButton homeMbutton;
    private javax.swing.JLabel moveText;
    private javax.swing.JButton normMbutton;
    // End of variables declaration//GEN-END:variables
}
