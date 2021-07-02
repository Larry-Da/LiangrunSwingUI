package UIComponent;


import java.awt.*;
import java.net.URL;

/**
 * <p>It is used to store all the UI fonts, size, image resources, colors and settings
 * so that any page uses color should directly reference this static variable and the page
 *  style will be consistent.</p>
 * @author daliangrun
 * @version 5.3
 */
public class UIStyle
{
    public static final Font NORMAL_FONT = new Font("Arial", Font.PLAIN, 18);
    public static final Font SMALL_FONT = new Font("Arial", Font.PLAIN, 14);
    public static final Font TINY_FONT = new Font("Arial", Font.PLAIN, 10);
    public static final Font BIG_FONT = new Font("Arial", Font.PLAIN, 36);


    public static final Font SMALL_ARIAL_BOLD = new Font("Arial", Font.BOLD, 14);
    public static final Font TINY_ARIAL_BOLD = new Font("Arial", Font.BOLD, 10);

    public static final Font NORMAL_ARIAL_BOLD = new Font("Arial", Font.BOLD, 18);

    public static final Color COLOR_1 = Color.decode("#292F41");
    public static final Color COLOR_2 = Color.WHITE;
    public static final Color COLOR_3 = Color.decode("#F6F6F6");
    public static final Color COLOR_4 = Color.BLACK;
    public static final Color COLOR_5 = Color.decode("#4D5054");

    public static final Color BLUE_BUTTRESS = Color.decode("#1253CE");
    public static final Color BLUE_SHALLOW = Color.decode("#ACC7F1");
    public static final Color GRAY_BUTTRESS = Color.decode("#58606A");
    public static final Color GRAY_SHALLOW = Color.decode("#F8FAFB");

    public static final Color GREEN_OK = Color.decode("#28943D");

    public static int width;
    public static int height;
    public static int barHeight;
    public static int ScreenWidth;
    public static int ScreenHeight;


    public UIStyle()
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ScreenWidth =(int)dim.getWidth();
        ScreenHeight = (int)dim.getHeight();
        width = 1120;
        height = 700;
    }

}

