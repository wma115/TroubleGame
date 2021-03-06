package troublegame;

public class RuleDisplay extends javax.swing.JFrame {

    /**
     * Creates new form RuleDisplay
     */
    public RuleDisplay() {
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

        rulesPanel = new javax.swing.JPanel();
        rulesTag = new javax.swing.JLabel();
        objTag = new javax.swing.JLabel();
        objText = new javax.swing.JLabel();
        moveTag = new javax.swing.JLabel();
        moveText = new javax.swing.JLabel();
        baseTag = new javax.swing.JLabel();
        baseText1 = new javax.swing.JLabel();
        baseText2 = new javax.swing.JLabel();
        landingTag = new javax.swing.JLabel();
        landingText = new javax.swing.JLabel();
        playerOrderTag = new javax.swing.JLabel();
        playerOrderText = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1107, 540));
        setPreferredSize(new java.awt.Dimension(1107, 540));

        rulesPanel.setMinimumSize(new java.awt.Dimension(1107, 540));

        rulesTag.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rulesTag.setText("Rules:");

        objTag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        objTag.setText("Objective:");

        objText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        objText.setText("Your objective is to get all your colored pegs to your color's respective finish first.");

        moveTag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        moveTag.setText("Movement:");

        moveText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moveText.setText("Movement is based on a dice roll. Then the peg can move clockwise around the board until it reaches the finish.");

        baseTag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        baseTag.setText("Bases:");

        baseText1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        baseText1.setText("To get out of Home base you must roll a 6. If a 6 is rolled and a peg leaves home base, another roll can be performed.");

        baseText2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        baseText2.setText("To get into the finish an exact roll is needed to get to that space in the finish. A roll over the number of spaces is invalid and the peg cannot move.");

        landingTag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        landingTag.setText("Landing on other Players:");

        landingText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        landingText.setText("If one player lands exactly on another player's peg, the player's peg that was landed on is sent back to home base.");

        playerOrderTag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerOrderTag.setText("Player Order:");

        playerOrderText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOrderText.setText("The player using Red will have the first roll of the game. The full order goes: Red, Green, Yellow, Blue.");

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rulesPanelLayout = new javax.swing.GroupLayout(rulesPanel);
        rulesPanel.setLayout(rulesPanelLayout);
        rulesPanelLayout.setHorizontalGroup(
            rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rulesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rulesPanelLayout.createSequentialGroup()
                        .addGroup(rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(objTag)
                            .addComponent(objText)
                            .addComponent(moveTag)
                            .addComponent(baseTag)
                            .addComponent(baseText1)
                            .addComponent(baseText2)
                            .addComponent(landingTag)
                            .addComponent(landingText)
                            .addComponent(playerOrderTag)
                            .addComponent(playerOrderText))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rulesPanelLayout.createSequentialGroup()
                        .addGroup(rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rulesTag, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moveText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        rulesPanelLayout.setVerticalGroup(
            rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rulesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rulesTag)
                    .addComponent(exitButton))
                .addGap(18, 18, 18)
                .addComponent(objTag)
                .addGap(18, 18, 18)
                .addComponent(objText)
                .addGap(18, 18, 18)
                .addComponent(moveTag)
                .addGap(18, 18, 18)
                .addComponent(moveText)
                .addGap(18, 18, 18)
                .addComponent(baseTag)
                .addGap(18, 18, 18)
                .addComponent(baseText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseText2)
                .addGap(18, 18, 18)
                .addComponent(landingTag)
                .addGap(18, 18, 18)
                .addComponent(landingText)
                .addGap(18, 18, 18)
                .addComponent(playerOrderTag)
                .addGap(18, 18, 18)
                .addComponent(playerOrderText)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rulesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rulesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RuleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RuleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RuleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RuleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RuleDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baseTag;
    private javax.swing.JLabel baseText1;
    private javax.swing.JLabel baseText2;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel landingTag;
    private javax.swing.JLabel landingText;
    private javax.swing.JLabel moveTag;
    private javax.swing.JLabel moveText;
    private javax.swing.JLabel objTag;
    private javax.swing.JLabel objText;
    private javax.swing.JLabel playerOrderTag;
    private javax.swing.JLabel playerOrderText;
    private javax.swing.JPanel rulesPanel;
    private javax.swing.JLabel rulesTag;
    // End of variables declaration//GEN-END:variables
}
