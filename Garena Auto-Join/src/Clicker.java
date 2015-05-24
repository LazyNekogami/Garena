import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Clicker extends Thread {
	private volatile boolean isRunning = true;

	public void finish() {
		isRunning = false;
	}

	Clicker() {
		setDaemon(true);
		isRunning = true;
	}

	private static void doubleClick() {
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void EnterPress() {
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void EnterRelease() {
		Robot r;
		try {
			r = new Robot();
			r.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sleep(int i) {
		try {
			TimeUnit.MILLISECONDS.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			if (isRunning) {
				Point b = MouseInfo.getPointerInfo().getLocation();
				int x = (int) b.getX();
				int y = (int) b.getY();
				sleep(5000);
				b = MouseInfo.getPointerInfo().getLocation();
				while (x == (int) b.getX() && y == (int) b.getY()) {
					doubleClick();
					EnterPress();
					sleep(6000);
					EnterRelease();
					b = MouseInfo.getPointerInfo().getLocation();
				}
			} else {
				return;
			}

		}

	}

}
