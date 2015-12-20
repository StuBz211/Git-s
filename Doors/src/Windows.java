import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Windows extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtScore;
	private JTextField textField2;
	@SuppressWarnings("unused")
	private String s;
	public Windows(int widht, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setSize(508,  298);
		getContentPane().setLayout(null);
		
		
		
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Door2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int doorNumber = 1;
				Algoritm.algoritm(doorNumber);
				System.out.println("Door2");
				textField2.setText(Integer.toString(Algoritm.score));
				if(Algoritm.score > 4){
					win();
				}
			}
		});
		btnNewButton.setBounds(171, 42, 80, 127);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Door1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int doorNumber = 0;
				Algoritm.algoritm(doorNumber);
				System.out.println("Door1");
				textField2.setText(Integer.toString(Algoritm.score));
				if(Algoritm.score > 4){
					win();
				}
			}
		});
		button.setBounds(51, 42, 80, 127);
		getContentPane().add(button);
		
		JButton btnDoor = new JButton("Door3");
		btnDoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int doorNumber = 2;
				Algoritm.algoritm(doorNumber);
				System.out.println("Door3");
				textField2.setText(Integer.toString(Algoritm.score));
				if(Algoritm.score > 4){
					win();
				}
			}
		});
		btnDoor.setBounds(299, 42, 80, 127);
		getContentPane().add(btnDoor);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.WHITE);
		editorPane.setEnabled(false);
		editorPane.setEditable(false);
		editorPane.setText("\u0418\u0441\u043F\u044B\u0442\u0430\u0439 \u0443\u0434\u0430\u0447\u0443.");
		editorPane.setBounds(33, 11, 149, 20);
		getContentPane().add(editorPane);
		
		txtScore = new JTextField();
		txtScore.setForeground(Color.BLACK);
		txtScore.setBackground(Color.WHITE);
		txtScore.setEnabled(false);
		txtScore.setEditable(false);
		txtScore.setText("Score");
		txtScore.setBounds(293, 11, 41, 20);
		getContentPane().add(txtScore);
		txtScore.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(338, 11, 41, 20);
		getContentPane().add(textField2);
		
	
		setVisible(true);
	}
	public static void win(){
		JOptionPane.showMessageDialog(null, "WIN! whith's = "+ Integer.toString(Algoritm.score) +" Score!"  );
	}
}
	
