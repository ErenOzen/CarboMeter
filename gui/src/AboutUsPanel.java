/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbometerGUI;

/**
 *
 * @author Onur Ertunc
 * @version 17.12.2020
 */
public class AboutUsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutUsPanel
     */
    public AboutUsPanel() {
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

        aboutPageHomeScreenButton = new javax.swing.JButton();
        aboutUsPage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationField = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        aboutPageHomeScreenButton.setText("Back to Home Screen");
        aboutPageHomeScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutPageHomeScreenButtonActionPerformed(evt);
            }
        });

        aboutUsPage.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        aboutUsPage.setText("About Us");

        informationField.setEditable(false);
        informationField.setBackground(new java.awt.Color(75, 139, 59));
        informationField.setColumns(20);
        informationField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        informationField.setRows(5);
        informationField.setText("Carbometer is a desktop application that utilizes information about the consumption of users to measure environmental damage and gives \nrecommendations based on the information. The program gets the user data with a series of questions depending on their user type.\n As the user answers the questions, Carbometer makes calculations to calculate users' environmental damage. After the calculations, \nCarbometer shows their carbopoint and gives recommendations todiminish their Carbopoint level, and directs users to donateto payback \ntheir environmental damage if they want to. With this project, our aim is to make people aware of the damage they gave to the \nenvironment, and help them to reduce their harm by giving recommendations or directing them to donate any non-governmental \nenvironmental organizations.\n\n                                                                                                Creators of the Carbometer\n\n\t\t\t                  Alper Mumcular\n\t\t\t             Mustafa Çağrı Durgut\n\t\t\t                       Onur Ertunç\n\t\t\t                Şeyhmus Eren Özen \n\t\t\t                    Uygar Onat Erol");
        jScrollPane1.setViewportView(informationField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(aboutUsPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aboutPageHomeScreenButton)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(aboutUsPage)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(aboutPageHomeScreenButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aboutPageHomeScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutPageHomeScreenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutPageHomeScreenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutPageHomeScreenButton;
    private javax.swing.JLabel aboutUsPage;
    private javax.swing.JTextArea informationField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}