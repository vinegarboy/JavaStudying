package ex2;

import java.awt.*;

public class Yen {
    private int x;
    private int y;

    public Yen(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.black);
        g.drawChars(new char[]{'�~'},0,1,x,y);
    }
}
