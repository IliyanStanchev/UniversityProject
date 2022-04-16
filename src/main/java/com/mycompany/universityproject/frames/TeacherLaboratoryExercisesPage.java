/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityproject.frames;

import entity.*;
import services.*;

import java.awt.Color;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class TeacherLaboratoryExercisesPage extends javax.swing.JFrame {

    TeacherService teacherService = new TeacherService();

    Teacher teacher;
    LaboratoryExercise laboratoryExercise;
    /**
     * Creates new form Home15
     */
    public TeacherLaboratoryExercisesPage() {
        laboratoryExercise = null;
        initComponents();
    }

    public void setTeacher(String identifier) {
        this.teacher = teacherService.getTeacher(identifier);
        initEntityTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        pageNameLabel = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        entityTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        main.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(45, 118, 232));
        header.setPreferredSize(new java.awt.Dimension(838, 200));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        pageNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pageNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        pageNameLabel.setText("Laboratory exercises");

        exitIcon.setBackground(new java.awt.Color(45, 118, 232));
        exitIcon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitIcon.setForeground(new java.awt.Color(255, 255, 255));
        exitIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitIcon.setText("X");
        exitIcon.setOpaque(true);
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(pageNameLabel)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(exitIcon)
                .addGap(30, 30, 30)
                .addComponent(pageNameLabel)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        home.setLayout(new java.awt.CardLayout());

        listPanel.setBackground(new java.awt.Color(255, 255, 255));
        listPanel.setLayout(new javax.swing.BoxLayout(listPanel, javax.swing.BoxLayout.LINE_AXIS));

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane.setBorder(null);

        entityTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        entityTable.setForeground(new java.awt.Color(51, 51, 51));
        entityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        entityTable.setGridColor(new java.awt.Color(255, 255, 255));
        entityTable.setRowHeight(20);
        entityTable.setSelectionBackground(new java.awt.Color(1, 198, 83));
        scrollPane.setViewportView(entityTable);

        listPanel.add(scrollPane);

        home.add(listPanel, "card3");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initEntityTable() {
        String[] columnNames = {"Discipline", "Teacher", "Group", "Day", "Time"};

        LaboratoryExerciseService laboratoryExerciseService = new LaboratoryExerciseService();
        List<LaboratoryExercise> laboratoryExercises = laboratoryExerciseService.getTeacherLaboratoryExercises(teacher.getId());

        Object[][] data = new Object[laboratoryExercises.size()][columnNames.length];

        int index = 0;
        for(LaboratoryExercise laboratoryExercise : laboratoryExercises) {
            data[index][0] = laboratoryExercise.getDiscipline().toString();
            data[index][1] = laboratoryExercise.getTeacher().getName();
            data[index][2] = laboratoryExercise.getGroup().getGroupNumber();
            data[index][3] = laboratoryExercise.getDayOfWeek();
            data[index][4] = laboratoryExercise.getTime();
            index++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        entityTable.setModel(model);
        entityTable.setGridColor(new Color(255, 255, 255));
        entityTable.setRowHeight(20);
        entityTable.setSelectionBackground(new Color(45, 118, 232));
        scrollPane.setViewportView(entityTable);

        listPanel.add(scrollPane);
    }

    int xx;
    int xy;

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_headerMouseDragged

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_exitIconMouseClicked
 
    // ------------switch between colors for Active/Inactive color
    public void setLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(45,118,255));
    }
    
      public void resetLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(45,118,232));
    }
      
           
      
      //-----------End --------
      
     //Let's create staff options and Avoid data
      
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //Change UI look of table.
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherLaboratoryExercisesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLaboratoryExercisesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLaboratoryExercisesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLaboratoryExercisesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLaboratoryExercisesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable entityTable;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel main;
    private javax.swing.JLabel pageNameLabel;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}