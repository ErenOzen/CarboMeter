package gui.View;
/**
 *
 * @author User
 */
public class FoodQuestionPanel extends javax.swing.JPanel {

    /**
     * Creates new form foodQuestionPanel
     */
    public FoodQuestionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        foodLabel = new javax.swing.JLabel();
        howMuchConsumeLabel = new javax.swing.JLabel();
        beefLambVealLabel = new javax.swing.JLabel();
        fishAndSeafoodLabel = new javax.swing.JLabel();
        otherMeatLabel = new javax.swing.JLabel();
        poultryAndEggsLabel = new javax.swing.JLabel();
        grainsAndBakedLabel = new javax.swing.JLabel();
        dairyLabel = new javax.swing.JLabel();
        fruitsAndVegetablesLabel = new javax.swing.JLabel();
        snacksLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        caloriesLabel1 = new javax.swing.JLabel();
        caloriesLabel2 = new javax.swing.JLabel();
        caloriesLabel3 = new javax.swing.JLabel();
        caloriesLabel4 = new javax.swing.JLabel();
        caloriesLabel5 = new javax.swing.JLabel();
        caloriesLabel6 = new javax.swing.JLabel();
        caloriesLabel7 = new javax.swing.JLabel();
        caloriesLabel8 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        foodLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(255, 255, 255));
        foodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodLabel.setText("FOOD");
        add(foodLabel);
        foodLabel.setBounds(580, 80, 116, 60);

        howMuchConsumeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        howMuchConsumeLabel.setForeground(new java.awt.Color(255, 255, 255));
        howMuchConsumeLabel.setText("How much do you consume? (Daily)");
        add(howMuchConsumeLabel);
        howMuchConsumeLabel.setBounds(220, 160, 316, 30);

        beefLambVealLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        beefLambVealLabel.setForeground(new java.awt.Color(255, 255, 255));
        beefLambVealLabel.setText("Beef, lamb, veal:");
        add(beefLambVealLabel);
        beefLambVealLabel.setBounds(220, 210, 200, 30);

        fishAndSeafoodLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        fishAndSeafoodLabel.setForeground(new java.awt.Color(255, 255, 255));
        fishAndSeafoodLabel.setText("Fish & Seafood:");
        add(fishAndSeafoodLabel);
        fishAndSeafoodLabel.setBounds(220, 260, 200, 30);

        otherMeatLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        otherMeatLabel.setForeground(new java.awt.Color(255, 255, 255));
        otherMeatLabel.setText("Other meat (processed, etc.):");
        add(otherMeatLabel);
        otherMeatLabel.setBounds(220, 310, 200, 30);

        poultryAndEggsLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        poultryAndEggsLabel.setForeground(new java.awt.Color(255, 255, 255));
        poultryAndEggsLabel.setText("Poultry & Eggs:");
        add(poultryAndEggsLabel);
        poultryAndEggsLabel.setBounds(220, 560, 200, 30);

        grainsAndBakedLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        grainsAndBakedLabel.setForeground(new java.awt.Color(255, 255, 255));
        grainsAndBakedLabel.setText("Grains & Baked Goods:");
        add(grainsAndBakedLabel);
        grainsAndBakedLabel.setBounds(220, 410, 200, 30);

        dairyLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        dairyLabel.setForeground(new java.awt.Color(255, 255, 255));
        dairyLabel.setText("Dairy:");
        add(dairyLabel);
        dairyLabel.setBounds(220, 360, 200, 30);

        fruitsAndVegetablesLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        fruitsAndVegetablesLabel.setForeground(new java.awt.Color(255, 255, 255));
        fruitsAndVegetablesLabel.setText("Fruits & Vegetables:");
        add(fruitsAndVegetablesLabel);
        fruitsAndVegetablesLabel.setBounds(220, 460, 200, 30);

        snacksLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        snacksLabel.setForeground(new java.awt.Color(255, 255, 255));
        snacksLabel.setText("Snacks, Processed Drinks, etc:");
        add(snacksLabel);
        snacksLabel.setBounds(220, 510, 200, 30);

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField1);
        jTextField1.setBounds(530, 210, 150, 30);

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField2);
        jTextField2.setBounds(530, 260, 150, 30);

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField3);
        jTextField3.setBounds(530, 310, 150, 30);

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField4);
        jTextField4.setBounds(530, 360, 150, 30);

        jTextField5.setBackground(new java.awt.Color(240, 240, 240));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField5);
        jTextField5.setBounds(530, 410, 150, 30);

        jTextField6.setBackground(new java.awt.Color(240, 240, 240));
        jTextField6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField6);
        jTextField6.setBounds(530, 460, 150, 30);

        jTextField7.setBackground(new java.awt.Color(240, 240, 240));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField7);
        jTextField7.setBounds(530, 510, 150, 30);

        jTextField8.setBackground(new java.awt.Color(240, 240, 240));
        jTextField8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jTextField8);
        jTextField8.setBounds(530, 560, 150, 30);

        nextButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1110, 610, 110, 35);

        goBackButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(80, 620, 110, 35);

        caloriesLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel1.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel1.setText("calories");
        add(caloriesLabel1);
        caloriesLabel1.setBounds(710, 210, 50, 30);

        caloriesLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel2.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel2.setText("calories");
        add(caloriesLabel2);
        caloriesLabel2.setBounds(710, 260, 50, 30);

        caloriesLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caloriesLabel3.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel3.setText("calories");
        add(caloriesLabel3);
        caloriesLabel3.setBounds(710, 310, 50, 30);

        caloriesLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel4.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel4.setText("calories");
        add(caloriesLabel4);
        caloriesLabel4.setBounds(710, 360, 50, 30);

        caloriesLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel5.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel5.setText("calories");
        add(caloriesLabel5);
        caloriesLabel5.setBounds(710, 410, 50, 30);

        caloriesLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel6.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel6.setText("calories");
        add(caloriesLabel6);
        caloriesLabel6.setBounds(710, 460, 50, 30);

        caloriesLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel7.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel7.setText("calories");
        add(caloriesLabel7);
        caloriesLabel7.setBounds(710, 510, 50, 30);

        caloriesLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        caloriesLabel8.setForeground(new java.awt.Color(255, 255, 255));
        caloriesLabel8.setText("calories");
        add(caloriesLabel8);
        caloriesLabel8.setBounds(710, 560, 50, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("../icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel beefLambVealLabel;
    private javax.swing.JLabel caloriesLabel1;
    private javax.swing.JLabel caloriesLabel2;
    private javax.swing.JLabel caloriesLabel3;
    private javax.swing.JLabel caloriesLabel4;
    private javax.swing.JLabel caloriesLabel5;
    private javax.swing.JLabel caloriesLabel6;
    private javax.swing.JLabel caloriesLabel7;
    private javax.swing.JLabel caloriesLabel8;
    private javax.swing.JLabel dairyLabel;
    private javax.swing.JLabel fishAndSeafoodLabel;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JLabel fruitsAndVegetablesLabel;
    private javax.swing.JLabel grainsAndBakedLabel;
    private javax.swing.JLabel howMuchConsumeLabel;
    public javax.swing.JButton goBackButton;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JButton nextButton;
    private javax.swing.JLabel otherMeatLabel;
    private javax.swing.JLabel poultryAndEggsLabel;
    private javax.swing.JLabel snacksLabel;
    // End of variables declaration//GEN-END:variables
}