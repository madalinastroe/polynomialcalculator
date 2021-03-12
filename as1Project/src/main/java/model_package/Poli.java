package model_package;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poli {
	
	private ArrayList<Monom> monoame= new ArrayList<Monom>(); //lista de monoame din care este format polinomul
	private ArrayList<String> a= new ArrayList<String>();

	public Poli(ArrayList<Monom> monoame) {
		super();
		this.monoame = monoame;
	}

	public Poli()
	{
		
	}
	
	public ArrayList<Monom> getMonoame() {
		return monoame;
	}

	public void setMonoame(ArrayList<Monom> monoame) {
		this.monoame = monoame;
	}
	
	
	//avem nevoie de o functie pentru crearea listei de monoame : Regex
	public void regexChecker(String theRegex,String str2check)
	{
		Monom m= new Monom();
		Pattern checkRegex= Pattern.compile(theRegex);
		Matcher regexMatcher= checkRegex.matcher(str2check);
		
		while(regexMatcher.find())
		{
			if(regexMatcher.group().length()!=0)
			{
				System.out.println("MONOM CA STRING:"+regexMatcher.group().trim());
				a.add(regexMatcher.group().trim());//am gasit monoamele si le adaugam ca stringuri pentru utilizare ulterioara
			}
		}
		
		for(String i: a)
		{
			monoame.add(creareMonom(i));
		}
		

		for(Monom i: monoame)
		{
			System.out.println(i);
		}
		
	}
	
	public void citire(String polinom)
	{
		//functia regexChecker se voia de alt tip initial
		regexChecker("(-)?(\\d+)?[x]?(\\^?(\\d+))?",polinom);
	}

	
	public Monom creareMonom(String monom)
	{
		Monom m= new Monom();
		
		String[] coef=monom.split("[x](\\^?)");
		System.out.println("Coeficient monom:"+coef[0]);
		m.setCoeficient(Integer.parseInt(coef[0]));
		
		String[] grd=monom.split("[x](\\^?)");
		System.out.println("Grad monom: "+grd[grd.length-1]);
		m.setGrad(Integer.parseInt(grd[grd.length-1]));
		
		return m;
		
	}
	
	
	
	
	public void grupare()
	{
		//trebuie sa ne asiguram ca monoamele sunt ordonate dupa grad
		Monom curent=monoame.get(0); //primul element din lista
		
		for(int i=0;i<monoame.size();i++)
		{
			double grad=monoame.get(i).getGrad();
			
			for(int j=i+1;j<monoame.size();j++)
			{
				double grad_next=monoame.get(j).getGrad();
				if(grad==grad_next)
				{
					Monom m= new Monom();
					m.setCoeficient(monoame.get(j).getCoeficient());
					m.setGrad(monoame.get(j).getGrad());
					Monom rezultat=new Monom();
					rezultat.setCoeficient(monoame.get(i).getCoeficient()+m.getCoeficient());
					rezultat.setGrad(m.getGrad());
					monoame.get(i).setGrad(rezultat.getGrad());
					monoame.get(i).setCoeficient(rezultat.getCoeficient());
					
					monoame.remove(j);
					
				}
			}
		}
		
	}
	
	
	@Override
	public String toString() {
		String s="";
		for(Monom a:monoame)
		{
			s+="+"+a;
		}
		
		return s;
	}

}
