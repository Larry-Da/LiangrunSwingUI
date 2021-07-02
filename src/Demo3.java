import UIComponent.Picture;
import UIComponent.Sticker;
import UIComponent.UIStyle;

import javax.swing.*;
import java.awt.*;

public class Demo3
{
    public static void main(String[] args) {
        new UIStyle();
        JFrame jf = new JFrame();
        JLayeredPane testPanel = new JLayeredPane();
        testPanel.setLayout(null);
        Sticker java_icon = new Sticker(300, 150, "Java is" , "Not best", (int)(UIStyle.width - 300 - 50), (int)(UIStyle.height - UIStyle.barHeight - 150), "/Users/daliangrun/LiangrunSwingUI/src/test.png", Color.white, UIStyle.COLOR_3);
        testPanel.add(java_icon);

        JLabel picture = new Picture("/Users/daliangrun/LiangrunSwingUI/src/bupt.jpeg", UIStyle.width,  UIStyle.height - UIStyle.barHeight);
        picture.setBounds(0, UIStyle.barHeight, UIStyle.width, (UIStyle.height - UIStyle.barHeight));
        testPanel.add(picture);


        testPanel.setLayer(java_icon, 0);
        testPanel.setLayer(picture, -1);

        jf.add(testPanel);
        jf.setBounds((int)((UIStyle.ScreenWidth - UIStyle.width)/2), (int)(UIStyle.ScreenHeight - UIStyle.height)/2, (int) UIStyle.width, (int) UIStyle.height);
        jf.setUndecorated(true);
        jf.setVisible(true);
        testPanel.setBackground(Color.WHITE);
    }
}
