package com.kronos.day5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;//java extended
import javax.swing.JFrame;

public class DemoGui extends JFrame {

	
	private JButton button;
	
	public DemoGui() {
		button= new JButton("click menu");
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("event is done");
				
			}
		});
		this.setVisible(true);
		this.setSize(300, 300);
		//this.setLayout(new BorderLayout());
	}
	public static void main(String[] args) {
		new DemoGui();
	}
	
}
