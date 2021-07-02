package UIComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

/**
 * <p>The top bar that can change the page from one to another</p>
 * @author daliangrun
 * @version 5.3
 */
public class MenuBar extends JPanel
{

    String buttonSelected = null;
    String[] buttons = null;

    public MenuBar(String[] button)
    {
        int buttonWidth = (int)(UIStyle.width / 2 / 6);
        int mid = (int)(UIStyle.width / 2);
        int barHeight = (int)(UIStyle.height) / 10;
        UIStyle.barHeight = barHeight;
        int buttonHeight = barHeight / 2;
        buttons = button;
        buttonSelected = button[0];


        this.setBounds(0, 0, (int) UIStyle.width, barHeight);
        this.setBackground(UIStyle.COLOR_1);
        for(int i = 0; i < button.length; i++)
        {
            TextButton temp = new TextButton((i+1) *buttonWidth +  mid, buttonHeight, UIStyle.COLOR_1, UIStyle.COLOR_2, button[i],  buttonWidth, buttonHeight, "small", false);
            temp.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);
                    //event here
                }
            });
            this.add(temp);

        }
        this.setLayout(null);

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.addRenderingHints(new HashMap<RenderingHints.Key, Object>() {{
            put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        }});

        if(buttonSelected != null) {
            for(int i = 0; i < buttons.length; i++)
            {
                if(buttons[i].equals(buttonSelected))
                {
                    g2.setPaint(Color.decode("#EC9730"));
                    int buttonHeight = UIStyle.barHeight / 2;
                    int buttonWidth = (int)(UIStyle.width / 2 / 6);
                    int mid = (int)(UIStyle.width / 2) - buttonWidth / 2;
                    g2.drawLine(mid + (i + 1)* buttonWidth, buttonHeight * 2 - 15, mid + (i + 2) * buttonWidth, buttonHeight * 2 - 15);
                }
                else
                {
                    g2.setPaint(UIStyle.GRAY_SHALLOW);
                    int buttonHeight = UIStyle.barHeight / 2;
                    int buttonWidth = (int)(UIStyle.width / 2 / 6);
                    int mid = (int)(UIStyle.width / 2) - buttonWidth / 2;
                    g2.drawLine(mid + (i + 1)* buttonWidth, buttonHeight * 2 - 15, mid + (i + 2) * buttonWidth, buttonHeight * 2 - 15);

                }
            }
        }
    }

}
