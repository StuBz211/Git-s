package ru.stbz.vad;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlHere;
	private JButton btnNewButton;
	private JButton btnGetFile;
	private Choice choice;
	private JLabel lblFormat;
	private JButton btnView;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmGetImage;
	private JMenu mnOption;
	private JMenuItem mntmExit;
	private JScrollPane scrollPane;
	private JLabel imgaeLabel;

	public MainWindow(int widht, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(640,480);
		getContentPane().setLayout(null);
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		
	 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(UIManager.getBorder("EditorPane.border"));
		tabbedPane.setBounds(10, 25, 612, 366);
		getContentPane().add(tabbedPane);
		setVisible(true);
		setResizable(false);
		tabbedPane.addTab("TAB 1", panel1);
		panel1.setLayout(null);
		
	 txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter url here...");
		txtrEnterUrlHere.setToolTipText("");
		txtrEnterUrlHere.setBounds(10, 68, 587, 204);
		panel1.add(txtrEnterUrlHere);
		
	 btnNewButton = new JButton("Get Image");
	 btnNewButton.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent arg0) {
	 		try {
				Main.setImage(new URL(txtrEnterUrlHere.getText()));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "invalid URL of net inet!");
			}
	 	}
	 });
		btnNewButton.setBounds(10, 36, 114, 21);
		panel1.add(btnNewButton);
		
	 btnGetFile = new JButton("Get File");
		
		btnGetFile.setBounds(351, 34, 91, 23);
		panel1.add(btnGetFile);
		tabbedPane.addTab("TAB 2", panel2);
		panel2.setLayout(null);
		
	 choice = new Choice();
		choice.setEnabled(true);
		choice.setBounds(536, 10, 61, 20);
		panel2.add(choice);
		
		choice.add("Jpg");
		choice.add("Png");
		
	 lblFormat = new JLabel("Format");
		lblFormat.setBounds(457, 10, 61, 20);
		panel2.add(lblFormat);
		
	 btnView = new JButton("View");
	 btnView.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 if (Main.getImage()==null){return;}
			 imgaeLabel.setIcon(new ImageIcon(Main.getImage()));
			 imgaeLabel.updateUI();
	 	}
	 });
		btnView.setBounds(21, 10, 91, 23);
		panel2.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 587, 287);
		panel2.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imgaeLabel = new JLabel("");
		panel.add(imgaeLabel, BorderLayout.CENTER);
		
	 menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 634, 14);
		getContentPane().add(menuBar);
		
	 mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
	 mntmGetImage = new JMenuItem("Save Image");
		mnFile.add(mntmGetImage);
		
	 mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
	 mntmExit = new JMenuItem("EXIT");
	 mntmExit.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 	
	 	}
	 });
		mnOption.add(mntmExit);
		btnGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setVisible(true);
	}
}
