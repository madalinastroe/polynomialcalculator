package controller_package;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model_package.Model;
import model_package.Monom;
import model_package.Poli;
import view_package.View;

public class Controller {

	  private Model model;
	  private View  view;
	  
	  public Controller(Model model, View view)
	  {
		  this.model=model;
		  this.view=view;
		  view.addButtonListener(new AdunareListener());
		  view.butonScadere(new ScadereListener());
		  view.butonInmultire(new InmultireListener());
		  view.butonDerivare(new DerivareListener());
		  view.butonIntegrare(new IntegrareListener());
	  }
	  
	class AdunareListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  String p1="";
			  String p2="";
			  ArrayList<Monom> m1=new ArrayList<Monom>();
			  Poli polinom1=new Poli(m1);
			  polinom1.setMonoame(m1);
			  ArrayList<Monom> m2=new ArrayList<Monom>();
			  Poli polinom2=new Poli(m2);
			  polinom2.setMonoame(m2);
			  
				  p1=view.getPoli1();
				  p2=view.getPoli2();
				  if(p1!=null && p2!=null)
					 {
					  polinom1.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p1);
					  polinom2.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p2);
						 model.adunaPolinoame(polinom1,polinom2);
						 System.out.println(model.getResult());
						 String s=model.getResult().toString();
						 view.setTotal(s);
					 }
		  }
	  }
	  
	  class ScadereListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  String p1="";
			  String p2="";
			  ArrayList<Monom> m1=new ArrayList<Monom>();
			  Poli polinom1=new Poli(m1);
			  polinom1.setMonoame(m1);
			  ArrayList<Monom> m2=new ArrayList<Monom>();
			  Poli polinom2=new Poli(m2);
			  polinom2.setMonoame(m2);
			  
			  p1=view.getPoli1();
			  p2=view.getPoli2();
			  
			 if(p1!=null && p2!=null)
			 {
				 polinom1.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p1);
				 polinom2.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p2);
				 model.scadePolinoame(polinom1,polinom2);
				 System.out.println(model.getResult());
				 String s=model.getResult().toString();
				 view.setTotal(s);
			 }
			  
		  }
	  }
	 
	  class InmultireListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  String p1="";
			  String p2="";
			  ArrayList<Monom> m1=new ArrayList<Monom>();
			  Poli polinom1=new Poli(m1);
			  polinom1.setMonoame(m1);
			  ArrayList<Monom> m2=new ArrayList<Monom>();
			  Poli polinom2=new Poli(m2);
			  polinom2.setMonoame(m2);
			  
			  p1=view.getPoli1();
			  p2=view.getPoli2();
			  
			 if(p1!=null && p2!=null)
			 {
				 polinom1.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p1);
				 polinom2.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p2);
				 model.inmultestePolinoame(polinom1,polinom2);
				 System.out.println(model.getResult());
				 String s=model.getResult().toString();
				 view.setTotal(s);
			 }
			  
		  }
	  }
	  
	  class DerivareListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {

			  String p1="";
			  ArrayList<Monom> m1=new ArrayList<Monom>();
			  Poli polinom1=new Poli(m1);
			  polinom1.setMonoame(m1);
			  p1=view.getPoli1();
			  
			 if(p1!=null)
			 {
				 polinom1.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p1);
				 model.derivarePolinoame(polinom1);
				 System.out.println(model.getResult());
				 String s=model.getResult().toString();
				 view.setTotal(s);
			 }
			  
		  }
	  }
	  
	  class IntegrareListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {

			  String p1="";
			  ArrayList<Monom> m1=new ArrayList<Monom>();
			  Poli polinom1=new Poli(m1);
			  polinom1.setMonoame(m1);
			  p1=view.getPoli1();
			  
			 if(p1!=null)
			 {
				 polinom1.regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",p1);
				 model.integrarePolinoame(polinom1);
				 System.out.println(model.getResult());
				 String s=model.getResult().toString();
				 view.setTotal(s);
			 }
			  
		  }
	  }
	  
}