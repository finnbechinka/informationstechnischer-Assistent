package swingAWT;
import java.awt.*;
import java.awt.event.*;

public class AWTTest extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1031597192603687215L;

	public AWTTest(){
		super("AWTFrame");
		this.setSize(300, 300);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		this.setVisible(true);
	}
}
