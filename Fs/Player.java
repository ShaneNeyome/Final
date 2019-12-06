import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends MovingObj{
	protected int hp;
	static int xsp;
	
	public Player(int Xp, int Yp,int imageW, int imageH, BufferedImage bi, int Xspeed, int Yspeed, int hp){
		super(Xp,Yp,imageW,imageH,bi,Xspeed,Yspeed);
		this.hp = hp;
	}
	public int GetXp(){
		return Xp;
	}
	public int GetYp(){
		int y = Yp;
		return y ;
	}
	public void drawImage(Graphics g){
		g.drawImage(bi,Xp, Yp,imageW,imageH,null);
		Xp+=xsp;
		Yspeed+=Yspeed;
	}
	
}