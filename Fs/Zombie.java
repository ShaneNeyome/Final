import java.awt.image.BufferedImage;

public class Zombie extends MovingObj{
	protected int hp;

	public Zombie(int Xp, int Yp,int imageW, int imageH, BufferedImage bi, int Xspeed, int Yspeed, int hp){
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
}