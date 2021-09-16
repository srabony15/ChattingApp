/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattingapp;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author DELL
 */
public class ChattingApp {

    public static void main(String[] args) {
        JFrame f=new JFrame("Srabony");
        f.setBounds(100,30,300,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.green);
        f.setResizable(false);


        JButton b=new JButton("Send");
        b.setBounds(212,332,70,25);

        JTextField tf=new JTextField();
        tf.setBounds(5,332,200,25);


        f.setVisible(true);
        f.setLayout(null);
        f.add(b);f.add(tf);
    }  
}

      

