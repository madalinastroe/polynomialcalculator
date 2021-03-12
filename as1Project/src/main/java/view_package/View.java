package view_package;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model_package.Model;

public class View extends JFrame{
	private JTextField polinom1 = new JTextField(10);
	private JTextField polinom2= new JTextField(10);
	private JTextField polinomRezultat= new JTextField(15);
	
	private JButton procesare= new JButton();
	private JButton procesare1= new JButton();
	private JButton procesare2= new JButton();
	private JButton procesare3=new JButton();
	private JButton procesare4= new JButton();


	private Model model;
	
	public View()
	{
		
	}
	
	public void reset()
	{
		polinomRezultat.setText(Model.INITIAL_VALUE);
	}
	
	public String getPoli1()
	{
		return polinom1.getText();
	}
	
	public String getPoli2()
	{
		return polinom2.getText();
	}

	public void setTotal(String newTotal)
	{
		polinomRezultat.setText(newTotal);
	}
	
	
	public void showError(String errMessage) 
	{
        JOptionPane.showMessageDialog(this, errMessage);
	}
	
	public void addButtonListener(ActionListener adunare)
	{
		procesare.addActionListener(adunare);
	}
	
	public void butonScadere(ActionListener scadere)
	{
		procesare1.addActionListener(scadere);
	}
	
	public void butonInmultire(ActionListener inmultire)
	{
		procesare2.addActionListener(inmultire);
	}
	
	public void butonDerivare(ActionListener derivare)
	{
		procesare3.addActionListener(derivare);
	}
	
	public void butonIntegrare(ActionListener integrare)
	{
		procesare4.addActionListener(integrare);
	}
	public View(Model model)
	{
		
		this.model=model;
		this.model.setValue(Model.INITIAL_VALUE);
		
		
		//initializare componente
		 JPanel content0= new JPanel();
		 JPanel content1= new JPanel();
		 JLabel l1= new JLabel("Polinom 1:");
		 polinom1= new JTextField();
		 
		 content1.setLayout(new FlowLayout());
		 content1.add(l1);
		 content1.add(polinom1);
		 polinom1.setPreferredSize(new Dimension(200,35));
		 content1.add(Box.createVerticalStrut(30));
		 
		 JPanel content2= new JPanel();
		 JLabel l2= new JLabel("Polinom 2:");
		 polinom2 = new JTextField();
		 polinom2.setPreferredSize(new Dimension(200,35)); //dimensiune
		 content2.add(Box.createHorizontalStrut(30));
		 
		 content1.add(l2);
		 content1.add(polinom2);
		 
		 JPanel content3= new JPanel();
		 JLabel l3= new JLabel("Polinom rezultat:");
		 polinomRezultat = new JTextField();
		 polinomRezultat.setPreferredSize(new Dimension(300,35));
		 
		 content3.add(l3);
		 content3.add(polinomRezultat);
		 
		 JPanel content4= new JPanel();
		 procesare= new JButton("Adunare");
		 procesare1= new JButton("Scadere");
		 procesare2=new JButton("Inmultire");
		 procesare3= new JButton("Derivare");
		 procesare4= new JButton("Integrare");
		 content4.add(procesare);
		 content4.add(procesare1);
		 content4.add(procesare2);
		 content4.add(procesare3);
		 content4.add(procesare4);
		 
		 JPanel content5=new JPanel();
		 JLabel l5= new JLabel("NOTA: Introduceti polinom cu coeficient si grad explicit pentru functionare corecta.");
		 content5.add(l5);
		 
		 JPanel panel= new JPanel();
		 panel.add(content0);
		 panel.add(content1);
		 panel.add(content2);
		 panel.add(content4);
		 panel.add(content3);
		 panel.add(content5);
		 
		 panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));			

		 this.setContentPane(panel);
		
		 this.pack();
		 this.setTitle("CALCULATOR POLINOAME");
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(650,600); //marimea ferestrei
		 
	}
	
	

}
