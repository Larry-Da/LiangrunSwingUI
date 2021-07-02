import UIComponent.*;
import UIComponent.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Demo2
{

    public static void main(String[] args) {
        new UIStyle();
        JFrame jf = new JFrame();
        JPanel testPanel = new JPanel();
        testPanel.setLayout(null);

        String[] boxString = {"ChoiceName", "Choice 1", "Choice 2", "Choice 3"};
        FilterBox filterBox = new FilterBox(200, boxString, "light");
        testPanel.add(filterBox);
        FilterBox filterBoxSingle = new FilterBox(250, boxString, "light", true);
        testPanel.add(filterBoxSingle);

        String[] buttonOnBar = {"Choice 1", "Choice 2", "Choice 3", "Choice 4", "Choice 5"};
        MenuBar mb = new MenuBar(buttonOnBar);
        testPanel.add(mb);

        MyReminder reminder = new MyReminder(mb);

        InputText searchBar = new InputText(500, 50, 40, true, (int)(UIStyle.width / 2), 130, "Search", true);
        testPanel.add(searchBar);
        searchBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reminder.OK(searchBar.getText());
            }
        });
        boolean[] states = filterBox.getStates(); // get the current choice

        jf.add(testPanel);
        jf.setBounds((int)((UIStyle.ScreenWidth - UIStyle.width)/2), (int)(UIStyle.ScreenHeight - UIStyle.height)/2, (int) UIStyle.width, (int) UIStyle.height);
        jf.setUndecorated(true);
        jf.setVisible(true);
        testPanel.setBackground(Color.WHITE);




    }
}
