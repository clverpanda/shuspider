package cn.clverpanda.winUI;

import javax.swing.*;

/**
 * Created by miaol on 2015/12/24 0024.
 */
public class windowMain {
    private JTextField txtField;
    private JPasswordField pswField;
    private JButton btnLogin;
    private JTextArea textGet;
    private JPanel mainPanel;
    private JPanel Up;
    private JPanel Down;
    private JTextArea textInfo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试");
        frame.setContentPane(new windowMain().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
