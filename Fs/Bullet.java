import java.awt.image.BufferedImage;

public class Bullet extends MovingObj{
	
	public Bullet(int Xp, int Yp,int imageW, int imageH, BufferedImage bi, int Xspeed, int Yspeed){
		super(Xp,Yp,imageW,imageH,bi,Xspeed,Yspeed);
	}
	public int GetXp(){
		return Xp;
	}
	public int GetYp(){
		int y = Yp;
		return y ;
	}
}