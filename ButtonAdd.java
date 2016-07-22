import java.awt.*;
class Button1 extends Frame
{
	Button b1,b2;
	Button1(String str)
	{
		super(str);
		b1=new Button("ok");
		b2=new Button("Cancel");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
}
class ButtonAdd 
{
	public static void main(String[] args) 
	{
		Button1 b=new Button1("My First Button");
		b.setSize(500,600);
		b.setVisible(true);
	}
}
