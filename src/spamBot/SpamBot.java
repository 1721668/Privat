package spamBot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JOptionPane;

import com.sun.glass.events.KeyEvent;

public class SpamBot extends Thread {

	public SpamBot() {};
	
	public void schreiben(String text, int verzögerung,int anzahl, int zeitProNachricht, boolean enter) {
		Robot r;
		try {
			r = new Robot();
			StringSelection stringSelection = new StringSelection(text);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, stringSelection);

			r.delay(verzögerung);
			for (int i = 1; i <= anzahl; i++) {
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
				if (enter) {
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
				r.delay(zeitProNachricht);
			}
		} catch (AWTException e) {
			JOptionPane.showConfirmDialog(null,
					"Robot konnte aufgrund eines unerwarteten Fehlers nicht erstellt werden", "Robot-Fehler",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
}
