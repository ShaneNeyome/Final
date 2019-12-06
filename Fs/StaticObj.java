import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class StaticObj{
	protected int Xp;
	protected int Yp;
	protected int imageW;
	protected int imageH;
	protected BufferedImage bi;
	
	public StaticObj(int Xp, int Yp,int imageW, int imageH, BufferedImage bi){
		this.Xp = Xp;
		this.Yp = Yp; 
		this.imageW = imageW; 
		this.imageH = imageH;
		this.bi= bi;
	}
	public void drawImage(Graphics g){
		g.drawImage(bi,Xp, Yp,imageW,imageH,null);
	}
}	