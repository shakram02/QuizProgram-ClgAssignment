/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.QuestionsGUI;

import assignment1.MainWindows.AppManager;
import assignment1.QuestionsClasses.LongAnswerQuestion;
import assignment1.Users.Student;
import javax.swing.WindowConstants;

/**
 *
 * @author Ahmed
 */
public class LongAnswer extends javax.swing.JFrame
{

    /**
     * Creates new form LongAnswer
     */
    public LongAnswer()
    {
        initComponents();

        // Set the JFrame to just hide and not to close the program when it's closed
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        // Draw the window at the center of the screen
        this.setLocationRelativeTo(null);

        if (AppManager.isAdmin == false)
        {
            // If the student loggs in, he can't change the quesiton head
            questionText.setEnabled(false);
            questionText.setText(AppManager.currentQuestion.question);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        questionText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        confrimButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Long Answer Question"));

        jLabel1.setText("Question");

        answerText.setColumns(20);
        answerText.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        answerText.setRows(5);
        jScrollPane1.setViewportView(answerText);

        jLabel2.setText("Answer");

        confrimButton.setText("Confirm");
        confrimButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confrimButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(confrimButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confrimButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confrimButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confrimButtonActionPerformed
    {//GEN-HEADEREND:event_confrimButtonActionPerformed
        // Keep the answer tidy
        cleanUpStrings();

        // Check the user Mode
        if (AppManager.isAdmin)
        {
            // Debug Statement
            //System.out.println("LongAnswer" + "," + questionText.getText() + "," + answerText.getText() + " " + "false");

            AppManager.writeToFlie("LongAnswer", questionText.getText(), answerText.getText(), false);
        }
        else
        {
            // Check the answer
            LongAnswerQuestion question = new LongAnswerQuestion();
            String answer = answerText.getText();

            if (question.checkAnswer(answer))
            {
                // True answer
                // Increment the questions answered by the student
                System.out.println("True answer");
                AppManager.answeredQuestionsCount++;
            }
            else
            {
                System.out.println("Wrong answer");
            }

            // Update scoreboard
            Student.updateScoreBoard();

            // Load the next question
            // Load the next question
            if (AppManager.LoadNextQuestion())
            {
                Student.getNextQuestionWindow();
            }
            else
            {
                // End of quiz
                Student.endQuiz();
            }

        }

        // Close the sub-window
        this.dispose();
    }//GEN-LAST:event_confrimButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LongAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LongAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LongAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LongAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LongAnswer().setVisible(true);
            }
        });
    }

    private void cleanUpStrings()
    {
        // Remove any existing "," because this character is used for file separation
        answerText.setText(answerText.getText().replace(',', ' '));
        questionText.setText(questionText.getText().replace(',', ' '));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerText;
    private javax.swing.JButton confrimButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField questionText;
    // End of variables declaration//GEN-END:variables
}
