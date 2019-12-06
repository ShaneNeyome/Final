import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class MovingObj extends StaticObj{
	
	public int Xspeed;
	protected int Yspeed;
	
	public MovingObj(int Xp, int Yp,int imageW, int imageH, BufferedImage bi, int Xspeed, int Yspeed){
		super(Xp,Yp,imageW,imageH,bi);
		this.Xspeed = Xspeed;
		this.Yspeed = Yspeed;
	}
	public void drawImage(Graphics g){
		g.drawImage(bi,Xp, Yp,imageW,imageH,null);
		Xp+=Xspeed;
		Yp+=Yspeed;
	}
	public int GetXp(){
		return Xp;
	}
	public int GetYp(){
		int y = Yp;
		return y ;
	}
}