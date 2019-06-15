package com.azor;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class App extends JFrame {

    private JPanel panel1;
    private JLabel label;

    private App(){
        setSize(800,600);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel1.setVisible(true);

        label.setText("Hello world");
        label.setVisible(true);

        add(panel1);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
