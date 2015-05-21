package com.bennysmemes.mlgsolidworks.core;

/**
 * Created by Ben on 5/18/2015.
 * The program launcher.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Launcher {
    JTextArea console;
    static JButton launchBtn;

    public Launcher() throws InterruptedException {

        // Setup the JFrame
        JFrame frame = new JFrame();
        frame.setTitle("MLG Solidworks - Launcher");
        frame.setPreferredSize(new Dimension(450, 450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // The console
        console = new JTextArea();
        console.setBackground(Color.BLACK);
        console.setForeground(Color.CYAN);
        console.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        console.setEditable(false);

        // The 'Launch' button panel
        JPanel bottemPanel = new JPanel();
        bottemPanel.setLayout(new BorderLayout());
        launchBtn = new JButton("Launch MLG Solidworks");
        launchBtn.setEnabled(false);
        bottemPanel.add(launchBtn, BorderLayout.CENTER);

        // Add to JFrame
        frame.add(console, BorderLayout.CENTER);
        frame.add(bottemPanel, BorderLayout.SOUTH);

        // Show JFrame
        frame.pack();
        frame.setVisible(true);

        // Start the console logging
        writeConsole("MLG SolidWorks - starting up...", 1000L);
        writeConsole("Loading plugins.", 2000L);
        writeConsole("YodairePlugin: loaded. up to date.", 100L);
        writeConsole("HodairePlugin: loaded. up to date. (only on Fridays)", 1000L);
        writeConsole("Plugins loaded.", 1000L);
        writeConsole("Contacting Mr. Haines for 3D printer guides", 2000L);
        writeConsole("Downloading rare_pepes.pdf", 3000L);
        writeConsole("Done. SolidWorks is ready.", 1000L);
        writeConsole("Press 'Launch MLG SolidWorks' to start!", 1000L);

        launchBtn.setEnabled(true);

        launchBtn.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(frame, "Holdem Down Boys", "Mr. Yodaire", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
                new Window();
            }
        });

    }

    public void writeConsole(String text, long delay) throws InterruptedException {
        console.append(text + "\n");
        Thread.sleep(delay);
    }



}
