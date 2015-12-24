package cn.clverpanda.winUI;

import javax.swing.*;

/**
 * Created by miaol on 2015/12/24 0024.
 */
public class windowMain {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton 登陆Button;
    private JTextArea textArea1;
    private JPanel mainPanel;
    private JPanel Up;
    private JPanel Middle;
    private JPanel Down;

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试");
        frame.setContentPane(new windowMain().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
