import UIComponent.*;
import UIComponent.MenuBar;

import javax.swing.*;
import java.awt.*;

public class Demo1
{
    public static void main(String[] args) {
        new UIStyle();
        JFrame jf = new JFrame();
        JPanel testPanel = new JPanel();
        testPanel.setLayout(null);
        jf.add(testPanel);
        jf.setBounds((int)((UIStyle.ScreenWidth - UIStyle.width)/2), (int)(UIStyle.ScreenHeight - UIStyle.height)/2, (int) UIStyle.width, (int) UIStyle.height);
        jf.setUndecorated(true);
        jf.setVisible(true);


        String[] buttonOnBar = {"Choice 1", "Choice 2", "Choice 3", "Choice 4", "Choice 5"};
        testPanel.add(new MenuBar(buttonOnBar));

        InputText account = new InputText(250, 35, 15, true, UIStyle.width / 2, UIStyle.height / 2 - 30,"Account", false);
        testPanel.add(account);
        Password pass = new Password(UIStyle.width / 2, UIStyle.height / 2 + 30, 250, 35);
        testPanel.add(pass);

        testPanel.setBackground(Color.WHITE);
        TextButton Login = new TextButton(UIStyle.width / 2, UIStyle.height / 2 + 80, Color.decode("#6EE6B1"), Color.black, "Login", 120, 35, "normal", true);
        testPanel.add(Login);



    }
}
