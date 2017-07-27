import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



//get ssthe pics in the first place 
public class cannel1 {
	
	public ArrayList list1= new ArrayList();
	JFrame jf= new JFrame();
	JPanel pan= new JPanel();
	
	public cannel1 pic() {
		
		try {
			URL tar = new URL("http://1channel.biz/");
			
			URLConnection ucon= tar.openConnection();
			ucon.setRequestProperty("User-Agent",
			        "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
					
			Scanner scn= new Scanner(ucon.getInputStream());
			Pattern pat= Pattern.compile("http://1channel.biz/upload/.*jpg");
			
					
			while (scn.hasNext()){
				Matcher match=pat.matcher(scn.nextLine());
				
				if (match.find()) {
					
					//System.out.println(match.group());
					String glory=match.group().toString();
					System.out.println(glory);
				     list1.add(glory);	
				}
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			didntw();
		}
		
		
		
		
		
		
		return null;
		
	}
	
	
	
	
	///shows the application in the first place 
	public void showme() throws Exception {
		
	
	pan.setBackground(Color.BLACK);
	
	int x=0;
	jf.setSize(300,300);
	
	while (x<10) {
		//JButton but=new JButton(new ImageIcon(new URL("http://1channel.biz/upload/movie/201707/twice-upon-a-yesterday.jpg")));
		//ImageIcon imz=new ImageIcon(new URL("http://1channel.biz/upload/movie/201707/twice-upon-a-yesterday.jpg"));
		//but.setIcon(imz);
		//but.setSize(10,10);
		
		
		 
				 
				 
		ImageIcon ikz = new ImageIcon(((new ImageIcon(
			        new URL("http://1channel.biz/upload/movie/201707/twice-upon-a-yesterday.jpg").getFile())
			        .getImage()
			        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH))));
		JButton bunz = new JButton(ikz);
		
		 pan.add(bunz);
		x++;
	
	
	
	
	jf.add(pan);
		
	jf.setVisible(true);	
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);	
		
	
	
	
	
	}
	
	

}
	


protected void didntw() {
	
	
	JLabel lb= new JLabel("something went wrong mayb with your internet i think");
	
	pan.add(lb);
	jf.add(pan);
	jf.setSize(1200, 70);
	jf.show();
	
		
}







}
