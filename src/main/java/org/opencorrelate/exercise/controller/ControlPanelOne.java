package org.opencorrelate.exercise.controller;

import org.opencorrelate.exercise.model.Model;
import org.opencorrelate.exercise.view.Viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by revprez on 4/22/16.
 */
public class ControlPanelOne {

    private JPanel panel;
    private JButton button;

    public ControlPanelOne(final Controller controller){
        panel = new JPanel();
        button = new JButton("press me");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //do some stuff;

                controller.update();

            }
        });
    }


    public Component getPanel() {
        return null;
    }
}
