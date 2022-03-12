package troublegame;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class GameDisplay extends javax.swing.JFrame {
    
    Movement move = new Movement();
    
    /**
     * Creates new form GameDisplay
     */
    public GameDisplay() {
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

        mainPanel = new javax.swing.JPanel();
        moveButton = new javax.swing.JButton();
        rulesButton = new javax.swing.JButton();
        pegsLocButton = new javax.swing.JButton();
        turnLabel = new javax.swing.JLabel();
        currentPlayer = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();
        diceLabel = new javax.swing.JLabel();
        boardDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1022, 750));

        mainPanel.setMinimumSize(new java.awt.Dimension(1022, 750));
        mainPanel.setPreferredSize(new java.awt.Dimension(1022, 750));

        moveButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        moveButton.setText("Make a Roll");
        moveButton.setMaximumSize(new java.awt.Dimension(204, 73));
        moveButton.setMinimumSize(new java.awt.Dimension(204, 73));
        moveButton.setPreferredSize(new java.awt.Dimension(204, 73));
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        rulesButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rulesButton.setText("Display Rules");
        rulesButton.setMaximumSize(new java.awt.Dimension(204, 73));
        rulesButton.setMinimumSize(new java.awt.Dimension(204, 73));
        rulesButton.setPreferredSize(new java.awt.Dimension(204, 73));
        rulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesButtonActionPerformed(evt);
            }
        });

        pegsLocButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pegsLocButton.setText("Show Pegs");
        pegsLocButton.setMaximumSize(new java.awt.Dimension(204, 73));
        pegsLocButton.setMinimumSize(new java.awt.Dimension(204, 73));
        pegsLocButton.setPreferredSize(new java.awt.Dimension(204, 73));
        pegsLocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegsLocButtonActionPerformed(evt);
            }
        });

        turnLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        turnLabel.setText("Current Turn:");

        currentPlayer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        currentPlayer.setText(move.currTurn());

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setMinimumSize(new java.awt.Dimension(716, 715));
        boardPanel.setPreferredSize(new java.awt.Dimension(716, 715));
        boardPanel.setLayout(null);

        diceLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        diceLabel.setForeground(new java.awt.Color(255, 255, 255));
        diceLabel.setText(Integer.toString(move.Roll));
        boardPanel.add(diceLabel);
        diceLabel.setBounds(350, 330, 50, 50);

        boardDisplay.setIcon(new javax.swing.ImageIcon("C:\\Users\\tolan\\Pictures\\troubleBoard3.png")); // NOI18N
        boardDisplay.setMaximumSize(new java.awt.Dimension(716, 715));
        boardDisplay.setMinimumSize(new java.awt.Dimension(716, 715));
        boardDisplay.setPreferredSize(new java.awt.Dimension(716, 715));
        boardPanel.add(boardDisplay);
        boardDisplay.setBounds(0, 0, 716, 715);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(turnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentPlayer)
                .addGap(32, 32, 32))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegsLocButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnLabel)
                            .addComponent(currentPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pegsLocButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Rolls dice and brings up move selection screen
    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        currentPlayer.setText(move.currTurn());
        MoveChoice m = new MoveChoice();
        move.makeMove();
        diceLabel.setText(Integer.toString(move.Roll));
        //Sound Here
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\popperSound.WAV"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        } 
        //------
        m.move = move;
        m.setVisible(true);
    }//GEN-LAST:event_moveButtonActionPerformed

    //Brings up Rules screen
    private void rulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesButtonActionPerformed
        currentPlayer.setText(move.currTurn());
        RuleDisplay r = new RuleDisplay();
        r.setVisible(true);
    }//GEN-LAST:event_rulesButtonActionPerformed

    //Shows peg locations in text output
    private void pegsLocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegsLocButtonActionPerformed
        currentPlayer.setText(move.currTurn());
        Pegs peg = Pegs.valueOf(move.currTurn());
        System.out.println("Peg 1 is on space " + peg.getPeg1() + ", Peg 2 is on space " + peg.getPeg2() + ", Peg 3 is on space " + peg.getPeg3() + ", and Peg 4 is on space " + peg.getPeg4());
    }//GEN-LAST:event_pegsLocButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boardDisplay;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel currentPlayer;
    private javax.swing.JLabel diceLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton pegsLocButton;
    private javax.swing.JButton rulesButton;
    private javax.swing.JLabel turnLabel;
    // End of variables declaration//GEN-END:variables
}
