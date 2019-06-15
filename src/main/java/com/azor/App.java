package com.azor;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class App extends JFrame implements WindowListener {

    private JPanel panel1;
    private JLabel label;

    private App(){
        setSize(800,600);
        setVisible(true);

        addWindowListener(this);

        panel1.setVisible(true);

        label.setText("Hello world");
        label.setVisible(true);

        add(panel1);
    }

    public static void main(String[] args) {
        App app = new App();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
