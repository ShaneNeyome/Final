
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MapDriver extends JFrame implements KeyListener{
	
	
	
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_D) {
			Player.xsp = 2;
			
		}
		if(c == KeyEvent.VK_A) {
			Player.xsp = -2;
			
		}
	}
	public void keyReleased(KeyEvent e) {
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_D) {
			Player.xsp = 0;
			
		}
		if(c == KeyEvent.VK_A) {
			Player.xsp = 0;
		
		}
	}
	
	
	public void keyTyped(KeyEvent e) {}
	public MapDriver(){
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 100, 561);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblCost = new JLabel("Cost: 10");
		lblCost.setBounds(18, 28, 82, 14);
		panel.add(lblCost);
		
		
		JLabel lblAmmo = new JLabel("Ammo :");
		lblAmmo.setBounds(10, 455, 90, 14);
		panel.add(lblAmmo);
		
		JLabel lblPoints = new JLabel("Points :");
		lblPoints.setBounds(10, 480, 90, 14);
		panel.add(lblPoints);
		
		JLabel ac = new JLabel("10");
		ac.setBounds(58, 455, 32, 14);
		panel.add(ac);
		
		JLabel lblNewLabel = new JLabel("10");
		lblNewLabel.setBounds(58, 480, 42, 14);
		panel.add(lblNewLabel);
		
		JButton btnAmmo = new JButton("AMMO");
		btnAmmo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Driver.addammo();
				lblNewLabel.setText(Integer.toString(Driver.points));
				ac.setText(Integer.toString(Driver.ammo));
			}
		});
		btnAmmo.setBounds(0, 5, 100, 23);
		panel.add(btnAmmo);
		
		
		
		
		
		
		Driver Map = new Driver();
		Map.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Map.fire();
				ac.setText(Integer.toString(Map.ammo));
				lblNewLabel.setText(Integer.toString(Driver.points));
			}
			
		});
		lblNewLabel.setText(Integer.toString(Map.points));
		Map.setBounds(100, 0, 600, 600);
		getContentPane().add(Map);
		
		
		
		
		
		
	
		
		
		
	}
	
	public static void main (String [] args){
		MapDriver m = new MapDriver();
		m.setSize(725, 650);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		

	}
	
}
