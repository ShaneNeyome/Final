import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Driver extends JPanel{
	private BufferedImage player1;
	private BufferedImage zombie1;
	private BufferedImage zombie2;
	private BufferedImage bullet1;
	private BufferedImage Room;
	private MovingObj p1;
	private MovingObj z1;
	private MovingObj z2;
	private MovingObj[] b1 = new MovingObj[5];
	int x = 0;
	static int ammo = 100;
	static int points = 10;
	


	public Driver(){
		// creating the room
		try {
				Room = ImageIO.read(new File("room.png"));
				
				
			}
			catch (IOException e) {
				System.out.println("Unable to read in image file");
			}
		
		
		try {//creating the movingObjs for the game
		player1 = ImageIO.read(new File("Player.png"));
		zombie1 = ImageIO.read(new File("Zombie.png"));
		zombie2 = ImageIO.read(new File("Zombie2.png"));
		bullet1 = ImageIO.read(new File("bullet.png"));
		
		p1 = new Player(300,500,64,64, player1, 0, 0, 1);
		z1 = null;
		z2 = null;
		
		
		}
		catch(IOException e) {
			System.out.println("File missing");
		}
		}
	public void fire() {
		if(ammo >= 1) {
		b1[x] = new Bullet(p1.GetXp()+36,p1.GetYp(),10,10, bullet1 , 0, -2);
		
		x++;
		ammo--;
		}
		if(x >= 5) {x = 0;}
	}
	static void addammo() {
		if(points >= 10) {
			points-=10;
			ammo+=10;
		}
	}
	
	
public void paint(Graphics g){
		try {//getting location for bullets and zombies
			int zx = 999;
			int zy = 999;
			int zx2 = 999;
			int zy2 = 999;
			int bx = 0;
			int by = 0;
			int bx2 = 0;
			int by2 = 0;
			int bx3 = 0;
			int by3 = 0;
			int bx4 = 0;
			int by4 = 0;
			int bx5 = 0;
			int by5 = 0;
			//drawing the images
			super.paint(g);
			if(p1 != null) {p1.drawImage(g);}
			if(z1 != null) {
				z1.drawImage(g);
				zx = z1.GetXp();
				zy = z1.GetYp();
				
			}
			if(z2 != null) {
				z2.drawImage(g);
				zx2 = z2.GetXp();
				zy2 = z2.GetYp();
				
			}
			if(b1[0] != null) {
				b1[0].drawImage(g);
				bx = b1[0].GetXp();
				by = b1[0].GetYp();
				
				
			}
			if(b1[1] != null) {
				b1[1].drawImage(g);
				bx2 = b1[1].GetXp();
				by2 = b1[1].GetYp();
				
				
			}
			if(b1[2] != null) {
				b1[2].drawImage(g);
				bx3 = b1[2].GetXp();
				by3 = b1[2].GetYp();
				
				
			}
			if(b1[3] != null) {
				b1[3].drawImage(g);
				bx4 = b1[3].GetXp();
				by4 = b1[3].GetYp();
				
				
			}
			if(b1[4] != null) {
				b1[4].drawImage(g);
				bx5 = b1[4].GetXp();
				by5 = b1[4].GetYp();
				
				
			}
			// checks collistion for z1 with each bullet in the array
			if (((zx+64 >= (bx )) && (zx-64 <= (bx ))) && ((zy == (by ))))
			{
				z1 = null;
				b1[0] = null;
				points += 5;
			}if (((zx+64 >= (bx2 )) && (zx-64 <= (bx2 ))) && ((zy == (by2 ))) )
			{
				z1 = null;
				b1[1] = null;
				points += 5;
			}if (((zx+64 >= (bx3 )) && (zx-64 <= (bx3 ))) && ((zy == (by3 ))) )
			{
				z1 = null;
				b1[2] = null;
				points += 5;
			}if (((zx+64 >= (bx4 )) && (zx-64 <= (bx4 ))) && ((zy == (by4 ))) )
			{
				z1 = null;
				b1[3] = null;
				points += 5;
			}if (((zx+64 >= (bx5 )) && (zx-64 <= (bx5 ))) && ((zy == (by5 ))) )
			{
				z1 = null;
				b1[4] = null;
				points += 5;
			}
			// checks collistion for z1 with each bullet in the array
			if (((zx2+64 >= (bx )) && (zx2-64 <= (bx ))) && ((zy2 == (by ))))
			{
				z2 = null;
				b1[0] = null;
				points += 5;
			}if (((zx2+64 >= (bx2 )) && (zx2-64 <= (bx2 ))) && ((zy2 == (by2 ))) )
			{
				z2 = null;
				b1[1] = null;
				points += 5;
			}if (((zx2+64 >= (bx3 )) && (zx2-64 <= (bx3 ))) && ((zy2 == (by3 ))) )
			{
				z2 = null;
				b1[2] = null;
				points += 5;
			}if (((zx2+64 >= (bx4 )) && (zx2-64 <= (bx4 ))) && ((zy2 == (by4 ))) )
			{
				z2 = null;
				b1[3] = null;
				points += 5;
			}if (((zx2+64 >= (bx5 )) && (zx2-64 <= (bx5 ))) && ((zy2 == (by5 ))) )
			{
				z2 = null;
				b1[4] = null;
				points += 5;
			}
			// This area controls the bounds in which the moving objs are allowed to move
			if(zy >= 600) {z1 = null;}
			if(zy2 >= 600) {z2 = null;}
			if(by <= 0) {b1[0] = null;}
			if(by2 <= 0) {b1[1] = null;}
			if(by3 <= 0) {b1[2] = null;}
			if(by4 <= 0) {b1[3] = null;}
			if(by5 <= 0) {b1[4] = null;}
			if(p1.GetXp() >= 500) {Player.xsp =0;
			p1.Xp = 490;}
			if(p1.GetXp() <= 20) {Player.xsp =0;
			p1.Xp = 30;}
			if(z1 == null) {
				int spawn = (int)(Math.random()*400)+100;
				
				z1 = new Zombie(spawn,0,64,-64, zombie1 , 0, 2, 2);
			}
			if(z2 == null) {
				int spawn = (int)(Math.random()*400)+100;
				
				z2 = new Zombie(spawn,0,64,-64, zombie2 , 0, 1, 1);
			}
			
			
			Thread.sleep(5);
			repaint();
		} 
			catch (InterruptedException e) {
						e.printStackTrace();
					}
		}

		
	
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(Room, 0,0, this);
	}
	
	
	
}

	
	

