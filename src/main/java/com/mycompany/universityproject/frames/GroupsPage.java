/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityproject.frames;

import entity.*;
import enums.GroupNumber;
import enums.UniversityUID;
import services.*;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class GroupsPage extends javax.swing.JFrame {

    Group currentGroup;
    /**
     * Creates new form Home15
     */
    public GroupsPage() {
        currentGroup = null;
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

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        pageNameLabel = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();
        listButton = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        entityTable = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        shortNameLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        groupCombo = new javax.swing.JComboBox<>();
        courseCombo = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();

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
        pageNameLabel.setText("Groups");

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

        editButton.setBackground(new java.awt.Color(45, 118, 232));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editButton.setText("Add/Edit group");
        editButton.setOpaque(true);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        listButton.setBackground(new java.awt.Color(45, 118, 232));
        listButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listButton.setForeground(new java.awt.Color(255, 255, 255));
        listButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listButton.setText("Groups");
        listButton.setOpaque(true);
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listButtonMouseClicked(evt);
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
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(pageNameLabel))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(exitIcon)
                .addGap(30, 30, 30)
                .addComponent(pageNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        editPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(45, 118, 232));
        nameLabel.setText("Group number");

        shortNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        shortNameLabel.setForeground(new java.awt.Color(45, 118, 232));
        shortNameLabel.setText("Course");

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        saveButton.setForeground(new java.awt.Color(45, 118, 232));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(groupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(shortNameLabel)
                                .addGap(97, 97, 97))
                            .addComponent(courseCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(shortNameLabel))
                .addGap(1, 1, 1)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(groupCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(courseCombo))
                .addGap(30, 30, 30)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        home.add(editPanel, "card3");

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
        String[] columnNames = {"Group identifier", "Group number", "Speciality" , "Course", "Students count"};

        GroupService groupService = new GroupService();
        List<Group> groups = groupService.getAll();

        Object[][] data = new Object[groups.size()][columnNames.length];

        StudentService studentService = new StudentService();
        int index = 0;
        for(Group group : groups) {
            data[index][0] = group.getId();
            data[index][1] = group.getGroupNumber();
            data[index][2] = group.getCourse().getSpeciality().getShortName();
            data[index][3] = group.getCourse().getCourseNumber();
            data[index][4] = studentService.getStudentsByGroup(group.getId()).size();
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

    private void listButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseClicked
        // TODO add your handling code here:
        
        setLblColor(listButton);
        resetLblColor(editButton);
        //switch bettween Jpanels
        editPanel.setVisible(false);
        listPanel.setVisible(true);
        initEntityTable();
      
    }//GEN-LAST:event_listButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked

        currentGroup = null;
        emptyControls();

        int column = 0;
        int row = entityTable.getSelectedRow();

        List<GroupNumber> groupNumbers = Arrays.asList(GroupNumber.values());
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addAll(groupNumbers);
        groupCombo.setModel(defaultComboBoxModel);

        CourseService courseService = new CourseService();
        List<Course> courses = courseService.getAll();

        DefaultComboBoxModel defaultComboBoxModelCourses = new DefaultComboBoxModel();

        defaultComboBoxModelCourses.addAll(courses);

        courseCombo.setModel(defaultComboBoxModelCourses);

        if (row < 0){
            setLblColor(editButton);
            resetLblColor(listButton);
            editPanel.setVisible(true);
            listPanel.setVisible(false);
            return;
        }

        int groupID = Integer.valueOf(entityTable.getModel().getValueAt(row, column).toString());
        GroupService groupService = new GroupService();
        currentGroup = groupService.getGroup(groupID);
        if( currentGroup == null )
            return;

        fillFields();
        setLblColor(editButton);
        resetLblColor(listButton);
        editPanel.setVisible(true);
        listPanel.setVisible(false);
        return;

    }//GEN-LAST:event_editButtonMouseClicked

    private void fillFields() {
        groupCombo.setSelectedItem(currentGroup.getGroupNumber());
        courseCombo.setSelectedItem(currentGroup.getCourse());
    }

    private void emptyControls() {

        groupCombo.setSelectedItem(0);
        courseCombo.setSelectedItem(0);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if( !validateData() )
            return;
        
        if( currentGroup == null )
            currentGroup = new Group();

        currentGroup.setGroupNumber((GroupNumber)groupCombo.getSelectedItem());
        currentGroup.setCourse((Course)courseCombo.getSelectedItem());

        GroupService groupService = new GroupService();
        groupService.saveOrUpdate(currentGroup);

        setLblColor(listButton);
        resetLblColor(editButton);

        editPanel.setVisible(false);
        listPanel.setVisible(true);
        initEntityTable();
    }//GEN-LAST:event_saveButtonActionPerformed

    private boolean validateData() {

        errorLabel.setText("");

        if( groupCombo.getSelectedIndex() < 0 )
        {
            errorLabel.setText("Pick group.");
            return false;
        }

        if( courseCombo.getSelectedIndex() < 0 )
        {
            errorLabel.setText("Pick course.");
            return false;
        }

        return true;
    }


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
            java.util.logging.Logger.getLogger(GroupsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GroupsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel editButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTable entityTable;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JComboBox<String> groupCombo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JLabel listButton;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel main;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pageNameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel shortNameLabel;
    // End of variables declaration//GEN-END:variables
}
