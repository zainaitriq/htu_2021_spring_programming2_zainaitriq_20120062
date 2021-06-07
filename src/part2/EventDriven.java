package part2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class EventDriven {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Login");
		frame.setSize(300,200);
		
		JPanel panel = new JPanel();
		JLabel username = new JLabel("user name: ");
		JTextField txtuname= new JTextField(20);
		
        JLabel password = new JLabel("password: ");
		JTextField txtpass= new JTextField(20);
		JButton btn= new JButton("Login");
		username.setBounds(10,10,50,30);
		txtuname.setBounds(100, 10, 50, 100);
		password.setBounds(10, 50, 50, 30);
		txtpass.setBounds(100, 50, 50, 100);
		btn.setBounds(200,150,80,30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password=txtpass.getText();
				String name=txtuname.getText();
				//JOptionPane.show
					String pass="admin1";
				    int x=pass.compareTo(password);
				    if(x==0)
				    {
						JOptionPane.showConfirmDialog(null, "hello " +name, "empolyee",-1);

				    	//JOptionPane.showMessageDialog(null, "employee");
				    }
				    else {
				    	JOptionPane.showConfirmDialog(null, "hello " +name, "costumer",-1);
				    }
				
				
			}
			
		});
		panel.add(username);
		panel.add(txtuname);
		panel.add(password);
		panel.add(txtpass);
		panel.add(btn);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
