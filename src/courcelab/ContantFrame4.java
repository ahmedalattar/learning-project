/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courcelab;

import java.awt.ComponentOrientation;

/**
 *
 * @author attar
 */
public class ContantFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form ContantFrame4
     */
    public ContantFrame4() {
        initComponents();
        setBounds(0, 0, 950, 750);
        jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("الفصل الثانى");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("أولا:- النصوص النصوص المكتوبة\n \nيقصد بالنص المكتوب كل ما تحتويه الشاشة من بيانات مكتوبة تعرض علي المتعلم أثناء تفاعله مع البرامج,بغرض تعريفه بالأهداف أو الارشادات أو تقديم المعلومات والمفاهيم,ويعد النص من أهم وسائل الاتصال ولا يمكن تخيل برنامج للوسائط المتعددة بدون نصوص مكتوبة .\nوتأخذ النصوص إحدي الأشكال التالية:\n:printing textالنصوص المطبوعة    \n.word processor  وهي النصوص المنقولة الي الكمبيوتر بالكتابة عن طريق لوحة المفاتيح بواسطة معالج الكلمات\n:hyper text - النصوص الفائقة\nlinksوهي عملية الربط بين النصوص,وكيفية إظهار أى نص,أو إخفاء وإظهار غيره علي الشاشة من خلال عملية اتصالات\nبين النصوص .\n:scanning text- النصوص المنقولة باستخدام الماسح الضوئي \nوفيه يتم نقل النصوص باستخدام الماسح الضوئي كصورة.\n");
        jTextArea1.setToolTipText("الفصل الثانى ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAlignmentX(2.0F);
        jTextArea1.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 940, 598);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/home-.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 610, 70, 70);

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/back1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 630, 90, 30);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/forward1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 630, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
MasterFrame masterFrame = new MasterFrame();
        masterFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ContantFrame30 contantFrame3 = new ContantFrame30()        // TODO add your handling code here:
                ;
        contantFrame3.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ContantFrame5 contantFrame5 = new ContantFrame5()        // TODO add your handling code here:
                ;
        contantFrame5.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ContantFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContantFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContantFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContantFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContantFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}