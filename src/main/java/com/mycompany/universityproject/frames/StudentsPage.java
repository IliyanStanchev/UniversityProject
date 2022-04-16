/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityproject.frames;

import entity.Group;
import entity.Student;
import entity.User;
import enums.RoleEnum;
import services.GroupService;
import services.RoleService;
import services.StudentService;
import services.UserService;
import validators.FieldValidator;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.management.relation.RoleStatus;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class StudentsPage extends javax.swing.JFrame {

    Student currentStudent;
    /**
     * Creates new form Home15
     */
    public StudentsPage() {
        currentStudent = null;
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
        studentsListButton = new javax.swing.JLabel();
        editStudentButton = new javax.swing.JLabel();
        removeStudentButton = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        studentsListPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        editStudentPanel = new javax.swing.JPanel();
        studentNameLabel = new javax.swing.JLabel();
        studentNameLabel1 = new javax.swing.JLabel();
        studentNameLabel2 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        studentNameLabel3 = new javax.swing.JLabel();
        studentNameLabel4 = new javax.swing.JLabel();
        studentNameLabel5 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        identifierField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        groupComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        facultyNumberField = new javax.swing.JTextField();
        studentNameLabel6 = new javax.swing.JLabel();
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
        pageNameLabel.setText("Students");

        exitIcon.setBackground(new java.awt.Color(0, 150, 62));
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

        studentsListButton.setBackground(new java.awt.Color(45, 118, 232));
        studentsListButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentsListButton.setForeground(new java.awt.Color(255, 255, 255));
        studentsListButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentsListButton.setText("Students");
        studentsListButton.setOpaque(true);
        studentsListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsListButtonMouseClicked(evt);
            }
        });

        editStudentButton.setBackground(new java.awt.Color(45, 118, 232));
        editStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        editStudentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editStudentButton.setText("Add/Edit student");
        editStudentButton.setOpaque(true);
        editStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editStudentButtonMouseClicked(evt);
            }
        });

        removeStudentButton.setBackground(new java.awt.Color(45, 118, 232));
        removeStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removeStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        removeStudentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeStudentButton.setText("Remove student");
        removeStudentButton.setOpaque(true);
        removeStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeStudentButtonMouseClicked(evt);
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
                        .addGap(197, 197, 197)
                        .addComponent(studentsListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(exitIcon)
                .addGap(30, 30, 30)
                .addComponent(pageNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        home.setLayout(new java.awt.CardLayout());

        studentsListPanel.setBackground(new java.awt.Color(255, 255, 255));
        studentsListPanel.setLayout(new javax.swing.BoxLayout(studentsListPanel, javax.swing.BoxLayout.LINE_AXIS));

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane.setBorder(null);

        studentsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studentsTable.setForeground(new java.awt.Color(51, 51, 51));
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        studentsTable.setGridColor(new java.awt.Color(255, 255, 255));
        studentsTable.setRowHeight(20);
        studentsTable.setSelectionBackground(new java.awt.Color(1, 198, 83));
        scrollPane.setViewportView(studentsTable);

        studentsListPanel.add(scrollPane);

        home.add(studentsListPanel, "card3");

        editStudentPanel.setBackground(new java.awt.Color(255, 255, 255));

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel.setText("First name");

        studentNameLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel1.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel1.setText("Last name");

        studentNameLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel2.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel2.setText("Email");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        studentNameLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel3.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel3.setText("Group");

        studentNameLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel4.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel4.setText("Identifier");

        studentNameLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel5.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel5.setText("Phone number");

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        identifierField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifierFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        saveButton.setForeground(new java.awt.Color(45, 118, 232));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        facultyNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNumberFieldActionPerformed(evt);
            }
        });

        studentNameLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameLabel6.setForeground(new java.awt.Color(45, 118, 232));
        studentNameLabel6.setText("Faculty number");

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout editStudentPanelLayout = new javax.swing.GroupLayout(editStudentPanel);
        editStudentPanel.setLayout(editStudentPanelLayout);
        editStudentPanelLayout.setHorizontalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(editStudentPanelLayout.createSequentialGroup()
                            .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentNameLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentNameLabel3)))
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(editStudentPanelLayout.createSequentialGroup()
                            .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentNameLabel1)
                                .addComponent(studentNameLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(studentNameLabel4)
                                .addGroup(editStudentPanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(studentNameLabel5))
                                .addComponent(identifierField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editStudentPanelLayout.createSequentialGroup()
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editStudentPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editStudentPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentNameLabel6)
                                    .addComponent(facultyNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(editStudentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editStudentPanelLayout.setVerticalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editStudentPanelLayout.createSequentialGroup()
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNameLabel)
                            .addComponent(studentNameLabel4)
                            .addComponent(studentNameLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identifierField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultyNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNameLabel1)
                            .addComponent(studentNameLabel5)))
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editStudentPanelLayout.createSequentialGroup()
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNameLabel2)
                            .addComponent(studentNameLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(groupComboBox)))
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        home.add(editStudentPanel, "card3");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

    private void studentsListButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsListButtonMouseClicked
        // TODO add your handling code here:
        
        setLblColor(studentsListButton);
        resetLblColor(editStudentButton);
        //switch bettween Jpanels
        editStudentPanel.setVisible(false);
        studentsListPanel.setVisible(true);
        initStudentsList();
      
    }//GEN-LAST:event_studentsListButtonMouseClicked

    private void initStudentsList() {
        String[] columnNames = {"Faculty Number", "Identifier", "Name","Email", "Speciality", "Course", "Group"};

        StudentService studentService = new StudentService();
        List<Student> students = studentService.getAll();

        Object[][] data = new Object[students.size()][columnNames.length];

        int index = 0;
        for(Student student : students) {
            data[index][0] = student.getFacultyNumber();
            data[index][1] = student.getUser().getIdentifier();
            data[index][2] = student.getUser().getName();
            data[index][3] = student.getUser().getEmail();
            data[index][4] = student.getGroup().getCourse().getSpeciality().getShortName();
            data[index][5] = student.getGroup().getCourse().getCourseNumber();
            data[index][6] = student.getGroup().getGroupNumber();
            index++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        studentsTable.setModel(model);
        studentsTable.setGridColor(new java.awt.Color(255, 255, 255));
        studentsTable.setRowHeight(20);
        studentsTable.setSelectionBackground(new java.awt.Color(45, 118, 232));
        scrollPane.setViewportView(studentsTable);

        studentsListPanel.add(scrollPane);
    }

    private void editStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editStudentButtonMouseClicked
        // TODO add your handling code here:

        currentStudent = null;
        emptyStudentControls();

        int column = 0;
        int row = studentsTable.getSelectedRow();

        GroupService groupService = new GroupService();
        List<Group> groupList = groupService.getAll();

        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();

        defaultComboBoxModel.addAll(groupList);

        groupComboBox.setModel(defaultComboBoxModel);

        if (row < 0){
            setLblColor(editStudentButton);
            resetLblColor(studentsListButton);
            editStudentPanel.setVisible(true);
            studentsListPanel.setVisible(false);
            return;
        }

        String facultyNumber = studentsTable.getModel().getValueAt(row, column).toString();
        StudentService studentService = new StudentService();
        currentStudent = studentService.getStudentByFacultyNumber(facultyNumber);
        if( currentStudent == null )
            return;

        fillStudentFields();
        setLblColor(editStudentButton);
        resetLblColor(studentsListButton);
        editStudentPanel.setVisible(true);
        studentsListPanel.setVisible(false);
        return;

    }//GEN-LAST:event_editStudentButtonMouseClicked

    private void emptyStudentControls() {
        facultyNumberField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        identifierField.setText("");
        phoneNumberField.setText("");

        groupComboBox.setSelectedItem(0);
    }

    private void fillStudentFields() {

        facultyNumberField.setText(currentStudent.getFacultyNumber());
        firstNameField.setText(currentStudent.getUser().getFirstName());
        lastNameField.setText(currentStudent.getUser().getLastName());
        emailField.setText(currentStudent.getUser().getEmail());
        identifierField.setText(currentStudent.getUser().getIdentifier());
        phoneNumberField.setText(currentStudent.getUser().getPhoneNumber());

        groupComboBox.setSelectedItem(currentStudent.getGroup());
    }

    private void removeStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeStudentButtonMouseClicked
        int column = 0;
        int row = studentsTable.getSelectedRow();
        if( row < 0 )
            return;

        String facultyNumber = studentsTable.getModel().getValueAt(row, column).toString();

        StudentService studentService = new StudentService();
        studentService.deleteStudent(facultyNumber);

        initStudentsList();
    }//GEN-LAST:event_removeStudentButtonMouseClicked

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void identifierFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifierFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identifierFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if( !validateData() )
            return;
        
        if( currentStudent == null ){
            addNewStudent();
            return;
        }

        currentStudent.setFacultyNumber(facultyNumberField.getText());
        currentStudent.getUser().setFirstName(firstNameField.getText());
        currentStudent.getUser().setLastName(lastNameField.getText());
        currentStudent.getUser().setEmail(emailField.getText());
        currentStudent.getUser().setIdentifier(identifierField.getText());
        currentStudent.getUser().setPhoneNumber(phoneNumberField.getText());
        currentStudent.setGroup((Group) groupComboBox.getSelectedItem());

        StudentService studentService = new StudentService();
        studentService.saveOrUpdate(currentStudent);

        setLblColor(studentsListButton);
        resetLblColor(editStudentButton);
        //switch bettween Jpanels
        editStudentPanel.setVisible(false);
        studentsListPanel.setVisible(true);
        initStudentsList();

    }//GEN-LAST:event_saveButtonActionPerformed

    private boolean validateData() {

        errorLabel.setText("");

        if( !FieldValidator.validatePersonName(firstNameField, errorLabel ))
        {
            errorLabel.setText("Wrong input in first name");
            return false;
        }

        if( !FieldValidator.validatePersonName(lastNameField, errorLabel ))
        {
            errorLabel.setText("Wrong input in last name");
            return false;
        }

        if( !FieldValidator.validateEmail( emailField, errorLabel ))
            return false;

        if( !FieldValidator.validateNumericField( identifierField, errorLabel ))
        {
            errorLabel.setText("Wrong input in identifier");
            return false;
        }

        if( !FieldValidator.validateNumericField( facultyNumberField, errorLabel ))
        {
            errorLabel.setText("Wrong input in faculty number");
            return false;
        }

        if( groupComboBox.getSelectedIndex() < 0 )
        {
            errorLabel.setText("Pick student group");
            return false;
        }

        return true;
    }

    private void addNewStudent() {

        currentStudent = new Student();
        User user = new User();

        RoleService roleService = new RoleService();

        user.setRole(roleService.getRole(RoleEnum.Student));
        user.setFirstName(firstNameField.getText());
        user.setLastName(lastNameField.getText());
        user.setEmail(emailField.getText());
        user.setIdentifier(identifierField.getText());
        user.setPhoneNumber(phoneNumberField.getText());
        user.setPassword(identifierField.getText());
        user.setUsername(emailField.getText());

        currentStudent.setFacultyNumber(facultyNumberField.getText());
        currentStudent.setGroup((Group) groupComboBox.getSelectedItem());

        UserService userService = new UserService();

        currentStudent.setUser(userService.saveOrUpdate(user));

        StudentService studentService = new StudentService();
        studentService.saveOrUpdate(currentStudent);

        setLblColor(studentsListButton);
        resetLblColor(editStudentButton);

        editStudentPanel.setVisible(false);
        studentsListPanel.setVisible(true);
        initStudentsList();
    }

    private void facultyNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyNumberFieldActionPerformed
    
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
            java.util.logging.Logger.getLogger(StudentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editStudentButton;
    private javax.swing.JPanel editStudentPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JTextField facultyNumberField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JTextField identifierField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPanel main;
    private javax.swing.JLabel pageNameLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel removeStudentButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameLabel1;
    private javax.swing.JLabel studentNameLabel2;
    private javax.swing.JLabel studentNameLabel3;
    private javax.swing.JLabel studentNameLabel4;
    private javax.swing.JLabel studentNameLabel5;
    private javax.swing.JLabel studentNameLabel6;
    private javax.swing.JLabel studentsListButton;
    private javax.swing.JPanel studentsListPanel;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables
}