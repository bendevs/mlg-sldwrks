package com.bennysmemes.mlgsolidworks.core;

/**
 * Created by Ben on 5/18/2015.
 * The main window
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Window {

    public Window() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize()); // i <3 awt toolkit
        frame.setLayout(new BorderLayout());
        frame.setTitle("MLG SolidWorks #memes")

        // menus
        JPanel menuPanel = new JPanel();
        JMenuBar testBar = new JMenuBar();
        JMenu testMenu = new JMenu("test");
        testBar.add(testMenu);
        menuPanel.add(testBar);

        //main window
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);

        // log
        JPanel log = new JPanel();
        log.add(new JLabel("log"));

        frame.add(menuPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(log, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }

}
