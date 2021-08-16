package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	public void showButton() {
		System.out.println("Button clicked");
		
		frame.setVisible(true);
		
		frame.add(button);
		frame.pack();
		button.setText("Woohoo");
		button.addActionListener(this);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)arg0.getSource();

		// TODO Auto-generated method stub
		if (buttonPressed == button) {
		int ran = new Random().nextInt(5);
	if (ran==0) {
		button.setText("You will have a great day.");
	}
	else if(ran==1) {
		button.setText("You will like sandwiches!");
	}
	else if (ran==2) {
		button.setText("You are lucky today!");
	}
	else if (ran==3) {
		button.setText("You can do great things");
		
	}
	else {
		button.setText("You should play this again.");
	}
		}
		
	}

	

}

