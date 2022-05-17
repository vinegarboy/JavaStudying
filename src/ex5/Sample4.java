package ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;


public class Sample4 extends JFrame
{
    private SamplePanel sp;

    public static void main(String args[])
    {
	Sample4 sm = new Sample4();
    }
    public Sample4()
    {
	super("サンプル");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(300, 300);
	sp = new SamplePanel();
	add(sp, BorderLayout.CENTER);
	setVisible(true);
    }
    public class SamplePanel extends JPanel
    {
	private ArrayList<Circle> circlelist
	    = new ArrayList<Circle>();

	public SamplePanel()
	{
	    addMouseListener(new SampleMouseListener());
	}
	public void paint(Graphics g)
	{
	    super.paint(g);
	    for(Circle c:circlelist) {
			c.draw(g);
		}
	}
	public class SampleMouseListener extends MouseAdapter
	{
	    public void mousePressed(MouseEvent e)
	    {
		circlelist.add(new Circle(e.getX(), e.getY()));
		repaint();
	    }
	}
    }
}
