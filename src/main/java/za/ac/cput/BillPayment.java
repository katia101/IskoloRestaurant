package za.ac.cput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Scanner;

import static sun.security.krb5.Confounder.intValue;

public class BillPayment extends JFrame {
    private JPanel billPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JTextField textField1;
    private JButton calculateButton;
    private JButton backButton;
    private JButton clearButton;
    private JButton nextButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public BillPayment() {

        comboBox1.addItem("Select Burgers");
        comboBox1.addItem("Chicken Burger");
        comboBox1.addItem("Beef Burger");
        comboBox1.addItem("Vegan Burger");

        comboBox2.addItem("Select Beverages");
        comboBox2.addItem("Still Water");
        comboBox2.addItem("Alcohol");
        comboBox2.addItem("Cold Drink");

        comboBox3.addItem("Select Sides");
        comboBox3.addItem("Mac and Cheese bombs");
        comboBox3.addItem("Sweet Chilli Wings");
        comboBox3.addItem("Greek Salad");

        comboBox4.addItem("Select Desserts");
        comboBox4.addItem("Cheese Cake");
        comboBox4.addItem("Malva Pudding");
        comboBox4.addItem("Cake");


        //Combo1
        //int comboBox1.setSelectedIndex(1) = 35;
//        String combo1 = comboBox1.getSelectedItem().toString();
//        textField2.setText(combo1);

//        int vegan = 50;
//
//        //Combo2
//        int water = 15;
//        int alcohol = 20;
//        int drink = 18;
//
//        //Combo3
//        int mac = 45;ff
//        int wings = 40;
//        int salad = 30;
//
//        //Combo4
//        int cheese = 25;
//        int malva = 30;
//        int cake = 25;

        setContentPane(billPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.setSelectedIndex(0);
                comboBox2.setSelectedIndex(0);
                comboBox3.setSelectedIndex(0);
                comboBox4.setSelectedIndex(0);

            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scanner.close();


            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


//                String combo1 = comboBox1.getSelectedItem().toString();
//                textField2.setText(combo1);

//                int price = comboBox1.getSelectedIndex();
//                textField2.setText(String.valueOf(price));

                //int price1 = comboBox1.getSelectedIndex();
               // textField2.setText(String.valueOf(price1));


                if (comboBox1.getSelectedIndex() == 1){
                    textField2.setText("70");
                }else if (comboBox1.getSelectedIndex() == 2){
                    textField2.setText("85");
                }else if (comboBox1.getSelectedIndex() == 3){
                    textField2.setText("99");
                }


            }
        });

        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // String combo2 = comboBox2.getSelectedItem().toString();
               // textField3.setText(combo2);
                //Combo2
                //        int water = 15;
                //        int alcohol = 20;
                //        int drink = 18;

                if (comboBox2.getSelectedIndex() == 1){
                    textField3.setText("12");
                }else if (comboBox2.getSelectedIndex() == 2){
                    textField3.setText("20");
                }else if (comboBox2.getSelectedIndex() == 3){
                    textField3.setText("18");
                }
            }
        });



        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String combo3 = comboBox3.getSelectedItem().toString();
                //textField4.setText(combo3);
                //
                //        //Combo3
                //        int mac = 45;ff
                //        int wings = 40;
                //        int salad = 30;
                if (comboBox3.getSelectedIndex() == 1){
                    textField4.setText("45");
                }else if (comboBox3.getSelectedIndex() == 2){
                    textField4.setText("40");
                }else if (comboBox3.getSelectedIndex() == 3){
                    textField4.setText("30");
                }
            }
        });

        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // String combo4 = comboBox4.getSelectedItem().toString();
                //textField5.setText(combo4);
                //        //Combo4
                //        int cheese = 25;
                //        int malva = 30;
                //        int cake = 25;

                if (comboBox4.getSelectedIndex() == 1){
                    textField5.setText("45");
                }else if (comboBox4.getSelectedIndex() == 2){
                    textField5.setText("40");
                }else if (comboBox4.getSelectedIndex() == 3){
                    textField5.setText("30");
                }
            }
        });
    }

    public static void main(String[] args) {
        BillPayment myFrame = new BillPayment();
    }
}
