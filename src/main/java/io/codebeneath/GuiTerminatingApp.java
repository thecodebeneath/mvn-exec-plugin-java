package io.codebeneath;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

/**
 * Java gui app that upon exit will System.exit() which abnormally terminates the Maven build.
 */
public class GuiTerminatingApp {

    public static void main(String[] args) {
        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300, 250);
        guiFrame.setLocationRelativeTo(null);
        String[] fruitOptions = {"Apple", "Apricot"};
        String[] vegOptions = {"Asparagus", "Broccoli", "Cabbage", "Turnip"};
        final JPanel comboPanel = new JPanel();
        JLabel comboLbl = new JLabel("Fruits:");
        JComboBox fruits = new JComboBox(fruitOptions);
        comboPanel.add(comboLbl);
        comboPanel.add(fruits);
        final JPanel listPanel = new JPanel();
        listPanel.setVisible(false);
        JLabel listLbl = new JLabel("Vegetables:");
        JList vegs = new JList(vegOptions);
        vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listPanel.add(listLbl);
        listPanel.add(vegs);
        JButton vegFruitBut = new JButton("Fruit or Veg");
        vegFruitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                listPanel.setVisible(!listPanel.isVisible());
                comboPanel.setVisible(!comboPanel.isVisible());
            }
        });
        guiFrame.add(comboPanel, BorderLayout.NORTH);
        guiFrame.add(listPanel, BorderLayout.CENTER);
        guiFrame.add(vegFruitBut, BorderLayout.SOUTH);
        guiFrame.setVisible(true);
    }
}
