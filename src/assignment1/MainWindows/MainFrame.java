/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.MainWindows;

import assignment1.Users.Professor;
import assignment1.Users.Student;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFrame extends javax.swing.JFrame
{

    static final JPanel nextWindow = new Professor();
    public static Object handle;
    public static Container thingsInWindow;

    public MainFrame()
    {
        initComponents();

        this.pack();

        // Get a handle to this frame
        handle = this;
        thingsInWindow = this.getContentPane();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroupUserType = new javax.swing.ButtonGroup();
        panelLogin = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        nameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelUserType = new javax.swing.JPanel();
        studentRadioButton = new javax.swing.JRadioButton();
        instructorRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz!");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        passwordText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Name");
        jLabel1.setToolTipText("");

        panelUserType.setBorder(javax.swing.BorderFactory.createTitledBorder("User Type"));

        buttonGroupUserType.add(studentRadioButton);
        studentRadioButton.setText("Student");
        studentRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                studentRadioButtonActionPerformed(evt);
            }
        });

        buttonGroupUserType.add(instructorRadioButton);
        instructorRadioButton.setSelected(true);
        instructorRadioButton.setText("Instructor");
        instructorRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                instructorRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUserTypeLayout = new javax.swing.GroupLayout(panelUserType);
        panelUserType.setLayout(panelUserTypeLayout);
        panelUserTypeLayout.setHorizontalGroup(
            panelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUserTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructorRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(studentRadioButton)
                .addContainerGap())
        );
        panelUserTypeLayout.setVerticalGroup(
            panelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructorRadioButton)
                    .addComponent(studentRadioButton))
                .addContainerGap())
        );

        jLabel2.setText("PW");

        jLabel3.setText("Please Login To Continue");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUserType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(passwordText))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nameText)))
                .addContainerGap())
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(panelUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        //JOptionPane.showMessageDialog(null, "Bye");
        if (instructorRadioButton.isSelected())
        {
            // Check the password
            if (!passwordText.getText().equalsIgnoreCase("Admin"))
            {
                return;
            }

            AppManager.isAdmin = true;

            // Move to the Instructor window  
            this.setContentPane(new Professor());
            this.pack();

            // TODO Check the password
        }
        else
        {
            // Don't login a student without a name
            if (nameText.getText() == null)
            {
                return;
            }

            AppManager.isAdmin = false;

            // Read the questions file
            try
            {
                AppManager.readOneLineFromFile();
            }
            catch (RuntimeException exc)
            {
                System.out.println("Failed to read from file, " + exc.getMessage());
                return;
            }

            // Save the student name
            AppManager.studentName = nameText.getText();

            // Change the window
            this.getContentPane();
            this.setContentPane(new Student());
            this.pack();
        }
        passwordText.setText("");
        System.out.println("Admin Logged:" + (AppManager.isAdmin ? "True" : "False"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_studentRadioButtonActionPerformed
    {//GEN-HEADEREND:event_studentRadioButtonActionPerformed
        // Disable the password textbox
        passwordText.setEnabled(false);

    }//GEN-LAST:event_studentRadioButtonActionPerformed

    private void instructorRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_instructorRadioButtonActionPerformed
    {//GEN-HEADEREND:event_instructorRadioButtonActionPerformed
        // Remove the text in the text box then disable it
        passwordText.setText(null);
        passwordText.setEnabled(true);
    }//GEN-LAST:event_instructorRadioButtonActionPerformed

    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            ex.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupUserType;
    private javax.swing.JRadioButton instructorRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameText;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelUserType;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JRadioButton studentRadioButton;
    // End of variables declaration//GEN-END:variables
}
