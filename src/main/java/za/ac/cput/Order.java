package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Order extends JFrame implements ActionListener {
        private JPanel panelNorth;
        private JPanel panelCenter, panelRB1, panelRB2;
        private JPanel panelSouth;

        private JLabel lblEventLogo;
        private JLabel lblHeading;

        private JLabel lblPadding1, lblPadding2, lblPadding3;
        private JLabel lblStudentNumber;
        private JTextField txtStudentNumber;
        private JLabel lblStudentErr;

        private JLabel lblFirstName;
        private JTextField txtFirstName;
        private JLabel lblFirstNameErr;

        private JLabel lblLastName;
        private JTextField txtLastName;
        private JLabel lblLastNameErr;

        private JLabel lblProgramme;
        private JComboBox cboProgramme;
        private JLabel lblBlank4;

        private JLabel lblDevice;
        private JRadioButton radDeviceYes;
        private JRadioButton radDeviceNo;
        private JLabel lblBlank5;
        private JLabel lblData;
        private JRadioButton radDataYes;
        private JRadioButton radDataNo;
        private JLabel lblBlank6;
        private JLabel lblPadding4, lblPadding5, lblPadding6;
        private ButtonGroup dataGroup;
        private ButtonGroup deviceGroup;

        private JButton btnSave, btnClear, btnExit;
        private Font ft1, ft2, ft3;

        public Order() {
            super("Hackathon Event Registration App version 1.0");
            panelNorth = new JPanel();
            panelCenter = new JPanel();
            panelRB1 = new JPanel();
            panelRB2 = new JPanel();
            panelSouth = new JPanel();

            lblEventLogo = new JLabel(new ImageIcon("Hacker.png"));
            lblHeading = new JLabel("Hackathon Event Registration");

            lblPadding1 = new JLabel();
            lblPadding2 = new JLabel();
            lblPadding3 = new JLabel();
            lblStudentNumber = new JLabel("Student Number: ");
            txtStudentNumber = new JTextField();
            lblStudentErr = new JLabel("*student number is required");
            lblStudentErr.setVisible(false);
            lblFirstName = new JLabel("First Name: ");
            txtFirstName = new JTextField();
            lblFirstNameErr = new JLabel("*first name is required");
            lblFirstNameErr.setVisible(false);
            lblLastName = new JLabel("Last Name: ");
            txtLastName = new JTextField();
            lblLastNameErr = new JLabel("*last name is required");
            lblLastNameErr.setVisible(false);
            lblProgramme = new JLabel("Programme: ");
            cboProgramme = new JComboBox();
            cboProgramme.addItem("Applications Development");
            cboProgramme.addItem("Communication Networks");
            cboProgramme.addItem("Multimedia Technology");
            lblBlank4 = new JLabel("");
            lblDevice = new JLabel("Do you have a device (pc or laptop): ");
            radDeviceYes = new JRadioButton("Yes");
            radDeviceNo = new JRadioButton("No");
            lblBlank5 = new JLabel("");
            lblData = new JLabel("Do you have access to a data or wifi connection: ");
            radDataYes = new JRadioButton("Yes");
            radDataNo = new JRadioButton("No");
            lblBlank6 = new JLabel("");
            lblPadding4 = new JLabel();
            lblPadding5 = new JLabel();
            lblPadding6 = new JLabel();

            dataGroup = new ButtonGroup();
            deviceGroup = new ButtonGroup();

            btnSave = new JButton("Save");
            btnClear = new JButton("Clear");
            btnExit = new JButton("Exit");

            ft1 = new Font("Arial", Font.BOLD, 32);
            ft2 = new Font("Arial", Font.PLAIN, 22);
            ft3 = new Font("Arial", Font.PLAIN, 24);
        }

        public void setGUI() {
            panelNorth.setLayout(new FlowLayout());
            panelCenter.setLayout(new GridLayout(8, 3));
            panelRB1.setLayout(new GridLayout(1, 2));
            panelRB2.setLayout(new GridLayout(1, 2));
            panelSouth.setLayout(new GridLayout(1, 3));

            panelNorth.add(lblEventLogo);
            panelNorth.add(lblHeading);
            lblHeading.setFont(ft1);
            lblHeading.setForeground(Color.yellow);
            panelNorth.setBackground(new Color(0, 106, 255));

            lblPadding1.setFont(ft1);
            panelCenter.add(lblPadding1);
            lblPadding2.setFont(ft1);
            panelCenter.add(lblPadding2);
            lblPadding3.setFont(ft1);
            panelCenter.add(lblPadding3);

            lblStudentNumber.setFont(ft2);
            lblStudentErr.setFont(ft2);
            lblStudentErr.setForeground(Color.red);
            lblStudentNumber.setHorizontalAlignment(JLabel.RIGHT);
            txtStudentNumber.setFont(ft2);
            panelCenter.add(lblStudentNumber);
            panelCenter.add(txtStudentNumber);
            panelCenter.add(lblStudentErr);

            lblFirstName.setFont(ft2);
            lblFirstNameErr.setFont(ft2);
            lblFirstNameErr.setForeground(Color.red);
            lblFirstName.setHorizontalAlignment(JLabel.RIGHT);
            txtFirstName.setFont(ft2);
            panelCenter.add(lblFirstName);
            panelCenter.add(txtFirstName);
            panelCenter.add(lblFirstNameErr);

            lblLastName.setFont(ft2);
            lblLastNameErr.setFont(ft2);
            lblLastNameErr.setForeground(Color.red);
            lblLastName.setHorizontalAlignment(JLabel.RIGHT);
            txtLastName.setFont(ft2);
            panelCenter.add(lblLastName);
            panelCenter.add(txtLastName);
            panelCenter.add(lblLastNameErr);

            lblProgramme.setFont(ft2);
            lblProgramme.setHorizontalAlignment(JLabel.RIGHT);
            cboProgramme.setFont(ft2);
            panelCenter.add(lblProgramme);
            panelCenter.add(cboProgramme);
            panelCenter.add(lblBlank4);
            panelCenter.setBackground(new Color(36, 145, 255));

            lblData.setFont(ft2);
            lblData.setHorizontalAlignment(JLabel.RIGHT);
            radDataYes.setFont(ft2);
            radDataYes.setHorizontalAlignment(JRadioButton.CENTER);
            radDataYes.setBackground(new Color(36, 145, 255));
            radDataNo.setFont(ft2);
            radDataNo.setHorizontalAlignment(JRadioButton.LEFT);
            radDataNo.setBackground(new Color(36, 145, 255));
            radDataYes.setSelected(true);

            dataGroup.add(radDataYes);
            dataGroup.add(radDataNo);

            panelCenter.add(lblData);
            panelRB1.add(radDataYes);
            panelRB1.add(radDataNo);
            panelCenter.add(panelRB1);
            panelCenter.add(lblBlank5);

            lblDevice.setFont(ft2);
            lblDevice.setHorizontalAlignment(JLabel.RIGHT);
            radDeviceYes.setFont(ft2);
            radDeviceYes.setHorizontalAlignment(JRadioButton.CENTER);
            radDeviceYes.setBackground(new Color(36, 145, 255));
            radDeviceNo.setFont(ft2);
            radDeviceNo.setHorizontalAlignment(JRadioButton.LEFT);
            radDeviceNo.setBackground(new Color(36, 145, 255));
            radDeviceYes.setSelected(true);

            deviceGroup.add(radDeviceYes);
            deviceGroup.add(radDeviceNo);

            panelCenter.add(lblDevice);
            panelRB2.add(radDeviceYes);
            panelRB2.add(radDeviceNo);
            panelCenter.add(panelRB2);
            panelCenter.add(lblBlank6);
            panelRB1.setBackground(new Color(36, 145, 255));
            panelRB2.setBackground(new Color(36, 145, 255));
            panelCenter.setBackground(new Color(36, 145, 255));

            lblPadding4.setFont(ft1);
            panelCenter.add(lblPadding4);
            lblPadding5.setFont(ft1);
            panelCenter.add(lblPadding5);
            lblPadding6.setFont(ft1);
            panelCenter.add(lblPadding6);

            btnSave.setFont(ft3);
            btnClear.setFont(ft3);
            btnExit.setFont(ft3);
            panelSouth.add(btnSave);
            panelSouth.add(btnClear);
            panelSouth.add(btnExit);

            this.add(panelNorth, BorderLayout.NORTH);
            this.add(panelCenter, BorderLayout.CENTER);
            this.add(panelSouth, BorderLayout.SOUTH);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            btnSave.addActionListener(this);
            btnClear.addActionListener(this);
            btnExit.addActionListener(this);

            this.setSize(600, 600);
            this.pack();
            this.setVisible(true);
        }

        private boolean isInputValid() {
            boolean valid = true;
            if (txtLastName.getText().equals("")) {
                lblLastNameErr.setVisible(true);
                txtLastName.requestFocus();
                valid = false;
            }
            else
                lblLastNameErr.setVisible(false);

            if (txtFirstName.getText().equals("")) {
                lblFirstNameErr.setVisible(true);
                txtFirstName.requestFocus();
                valid = false;
            }
            else
                lblFirstNameErr.setVisible(false);

            if (txtStudentNumber.getText().equals("")) {
                lblStudentErr.setVisible(true);
                txtStudentNumber.requestFocus();
                valid = false;
            }
            else
                lblStudentErr.setVisible(false);

            return valid;
        }

        private void clearForm() {
            txtStudentNumber.setText("");
            lblStudentErr.setVisible(false);
            txtFirstName.setText("");
            lblFirstNameErr.setVisible(false);
            txtLastName.setText("");
            lblLastNameErr.setVisible(false);
            cboProgramme.setSelectedIndex(0);
            radDataYes.setSelected(true);
            radDeviceYes.setSelected(true);
            txtStudentNumber.requestFocus();
        }

        public void actionPerformed(ActionEvent e) {
//            if (e.getActionCommand().equals("Save")) {
//                if (isInputValid()) {
//                    // save to file
//                    Event attendee = new Event(txtStudentNumber.getText(),
//                            txtFirstName.getText(),
//                            txtLastName.getText(),
//                            cboProgramme.getSelectedItem().toString(),
//                            radDataYes.isSelected()?"Yes":"No",
//                            radDeviceYes.isSelected()?"Yes":"No");
//                    attendee.save();
//                    clearForm();
//                }
//            }
            if (e.getActionCommand().equals("Clear")) {
                clearForm();
            }
            else if (e.getActionCommand().equals("Exit")) {
                System.exit(0);
            }
        }

        public static void main(String[] args) {
            new Order().setGUI();
        }
    }

