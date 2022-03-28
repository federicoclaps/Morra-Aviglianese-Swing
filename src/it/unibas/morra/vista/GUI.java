package it.unibas.morra.vista;

import com.formdev.flatlaf.FlatLightLaf;
import it.unibas.morra.modello.Giocata;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class GUI extends javax.swing.JFrame {
    
     static {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

    }

    public void inizializza(){
        initComponents();
        inizializzaAzione();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void inizializzaAzione(){
        AzioneEsci azioneEsci = new AzioneEsci();
        menuEsci.setAction(azioneEsci);
        AzioneGioca azioneGioca = new AzioneGioca();
        menuGioca.setAction(azioneGioca);
        bottoneGioca.setAction(azioneGioca);
        campoGiocatore.setAction(azioneGioca);
        campoGiocata.setAction(azioneGioca);
        campoSomma.setAction(azioneGioca);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        campoGiocata = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        campoSomma = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        campoGiocatore = new javax.swing.JTextField();
        labelGiocatore = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        labelGiocataCOM = new javax.swing.JLabel();
        labelSommaCOM = new javax.swing.JLabel();
        labelGiocataPlayer = new javax.swing.JLabel();
        labelSommaPlayer = new javax.swing.JLabel();
        labelRisultato = new javax.swing.JLabel();
        bottoneGioca = new javax.swing.JButton();
        bottoneReset = new javax.swing.JButton();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        menuGioca = new javax.swing.JMenuItem();
        menuEsci = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morra Aviglianese");

        jPanel1.setToolTipText("");

        jLabel1.setText("Giocata");

        jLabel2.setText("Somma");

        jLabel3.setText("COMPUTER");

        jLabel4.setText("GIOCATORE:");

        jLabel5.setText("Giocatore");

        jLabel6.setText("Giocata:");

        jLabel7.setText("Somma:");

        jLabel8.setText("Giocata:");

        jLabel9.setText("Somma:");

        labelGiocataCOM.setOpaque(true);

        labelSommaCOM.setOpaque(true);

        labelGiocataPlayer.setToolTipText("");
        labelGiocataPlayer.setOpaque(true);

        labelSommaPlayer.setOpaque(true);

        labelRisultato.setBackground(new java.awt.Color(51, 204, 0));
        labelRisultato.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelRisultato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRisultato.setText("RISULTATO");
        labelRisultato.setOpaque(true);

        bottoneGioca.setText("Gioca");

        bottoneReset.setText("Reset");
        bottoneReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelGiocatore))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(62, 62, 62)
                        .addComponent(labelSommaPlayer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(59, 59, 59)
                        .addComponent(labelGiocataPlayer)))
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71)
                        .addComponent(labelSommaCOM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70)
                        .addComponent(labelGiocataCOM)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRisultato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoGiocatore)
                    .addComponent(campoGiocata)
                    .addComponent(campoSomma))
                .addGap(18, 18, 18)
                .addComponent(bottoneGioca)
                .addGap(16, 16, 16)
                .addComponent(bottoneReset)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoGiocata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneGioca)
                    .addComponent(bottoneReset))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSomma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(labelGiocatore))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(labelGiocataCOM)
                    .addComponent(labelGiocataPlayer))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(labelSommaCOM)
                    .addComponent(labelSommaPlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRisultato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MORRA AVIGLIANESE");
        jLabel10.setOpaque(true);

        jMenu1.setText("File");

        menuGioca.setText("jMenuItem2");
        jMenu1.add(menuGioca);

        menuEsci.setText("jMenuItem1");
        jMenu1.add(menuEsci);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneResetActionPerformed
       labelRisultato.setText("RISULTATO");
       labelGiocatore.setText("");
       labelGiocataCOM.setText("");
       labelSommaCOM.setText("");
       labelGiocataPlayer.setText("");
       labelSommaPlayer.setText("");
       campoGiocatore.setText("");
       campoGiocata.setText("");
       campoSomma.setText("");
    }//GEN-LAST:event_bottoneResetActionPerformed

   
     public static void main(String[] args) {
        Splash splash = new Splash();
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
               Thread.sleep(90);
                splash.caricamento.setText("Caricamento.." + Integer.toString(i) + "%");
                splash.barra.setValue(i);
                if(i == 100){
                   GUI gui = new GUI();
                   gui.inizializza();
                   splash.setVisible(false);
                }
            }
    }   catch (Exception ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
//    public static void main(String args[]) {
//   
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                GUI gui = new GUI();
//                gui.inizializza();
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneGioca;
    private javax.swing.JButton bottoneReset;
    private javax.swing.JTextField campoGiocata;
    private javax.swing.JTextField campoGiocatore;
    private javax.swing.JTextField campoSomma;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelGiocataCOM;
    private javax.swing.JLabel labelGiocataPlayer;
    private javax.swing.JLabel labelGiocatore;
    private javax.swing.JLabel labelRisultato;
    private javax.swing.JLabel labelSommaCOM;
    private javax.swing.JLabel labelSommaPlayer;
    private javax.swing.JMenuItem menuEsci;
    private javax.swing.JMenuItem menuGioca;
    // End of variables declaration//GEN-END:variables

    private class AzioneEsci extends AbstractAction{
        
        public AzioneEsci(){
        this.putValue(NAME, "Esci");
        this.putValue(LONG_DESCRIPTION, "Esci dall'applicazione");
        this.putValue(MNEMONIC_KEY, KeyEvent.VK_E);
        this.putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("alt shift E"));
        }

        @Override
        public void actionPerformed(ActionEvent arg) {
              System.exit(0);
        }
        
    }
    
    private class AzioneGioca extends AbstractAction{
        
        public AzioneGioca(){
            this.putValue(NAME, "Gioca");
            this.putValue(SHORT_DESCRIPTION, "Gioco della morra");
            this.putValue(MNEMONIC_KEY, KeyEvent.VK_G);
            this.putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("alt shift G"));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nomeGiocatore = campoGiocatore.getText();
            String stringaGiocataPlayer = campoGiocata.getText();
            String stringaSommaPlayer = campoSomma.getText();
            int giocataPlayer = Integer.parseInt(stringaGiocataPlayer);
            int sommaPlayer = Integer.parseInt(stringaSommaPlayer);
            int giocataComputer = generaNumeroRandom(1, 5);
            int sommaComputer = generaNumeroRandom(giocataComputer+1, 10); 
            Giocata giocata = new Giocata(nomeGiocatore, giocataPlayer, sommaPlayer, giocataComputer, sommaComputer);
            
            String risultato = giocata.controlloGiocata();
            
            String stringaGiocataComputer = String.valueOf(giocataComputer);
            String stringaSommaComputer = String.valueOf(sommaComputer);
            labelGiocatore.setText(nomeGiocatore);
            labelGiocataCOM.setText(stringaGiocataComputer);
            labelSommaCOM.setText(stringaSommaComputer);
            labelGiocataPlayer.setText(stringaGiocataPlayer);
            labelSommaPlayer.setText(stringaSommaPlayer);
            labelRisultato.setText(risultato);
            
        }
        
        public int generaNumeroRandom(int a, int b){
            Random random = new Random();
            int c = ((b-a) + 1);
            int numero = random.nextInt(c) + a;
            return numero;
        }
    }
    
}
