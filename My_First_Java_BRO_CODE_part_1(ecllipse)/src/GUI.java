import javax.swing.JOptionPane;
public class GUI {

	public static void main(String[] args) {		
		
		String name = JOptionPane.showInputDialog("What is your name? ");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		int age;
		age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
		JOptionPane.showMessageDialog(null,"Your age is " +age+" years old");
		
		double height;
		
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
		JOptionPane.showMessageDialog(null,"Your are " +height+ " cm tall.");

	}

}
