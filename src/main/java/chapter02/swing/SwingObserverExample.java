package chapter02.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        button = new JButton("할까? 말까?");

        button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event -> System.out.println("그냥 저질러 버렷!!!"));

        frame.getContentPane().add(BorderLayout.CENTER, button);
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setTitle("할까? 말까?");
        frame.setVisible(true);
    }

	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
