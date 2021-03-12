package model_package;

import java.math.BigInteger;
import java.util.ArrayList;

public class Model {

	public static final String INITIAL_VALUE = "0";
	private BigInteger total;
	private String p1;
	private String p2;
	private Poli result;

	public Poli getResult() {
		return result;
	}

	public void setResult(Poli result) {
		this.result = result;
	}

	public BigInteger getTotal() {
		return total;
	}

	public void setTotal(BigInteger total) {
		this.total = total;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}
	
	//constructor cu parametri
	public Model(BigInteger total, String p1, String p2, Poli result) {
		super();
		this.total = total;
		this.p1 = p1;
		this.result=result;
		this.p2 = p2;
	}

	//constructor
	public Model()
	{
		reset();
	}
	
	public void reset()
	{
		total= new BigInteger(INITIAL_VALUE);
	}
		
	public void setValue(String value)
	{
		total= new BigInteger(value);
	}
	
	public String getValue()
	{
		return total.toString();
	}
	
	
	
	//-------------------------OPERATII-----------------------
	public void adunaPolinoame(Poli p1, Poli p2)
	{
		ArrayList<Monom> rezultat= new ArrayList<Monom>();
		
		Poli p=new Poli(rezultat);
		
		for(Monom a: p1.getMonoame())
		{
			for(Monom b:p2.getMonoame()){
				Monom aux= new Monom();
				if(a.getGrad()==b.getGrad())
				{
					
					aux.setGrad(a.getGrad());
					int coef=a.getCoeficient()+b.getCoeficient();
					System.out.println("Coeficient suma:"+coef);
					aux.setCoeficient(coef);
					System.out.println("pt A grad:"+a.getGrad()+"	A coef:"+a.getCoeficient());
					System.out.println("pt A grad:"+b.getGrad()+"	A coef:"+b.getCoeficient());
					rezultat.add(aux);
				}
				
			}
				
		}
		
		p.setMonoame(rezultat);
		System.out.println(p);
		this.result=p;

	}
	
	public void scadePolinoame(Poli p1, Poli p2)
	{
		ArrayList<Monom> rezultat= new ArrayList<Monom>();
		Poli p=new Poli(rezultat);
		
		for(Monom a: p1.getMonoame())
		{
			for(Monom b:p2.getMonoame()){
				Monom aux= new Monom();
				
				if(a.getGrad()==b.getGrad())
				{
					aux.setGrad(a.getGrad());
					int coef=a.getCoeficient()-b.getCoeficient();
					System.out.println("Coeficient scadere:"+coef);
					aux.setCoeficient(coef);
					System.out.println("pt A grad:"+a.getGrad()+"	A coef:"+a.getCoeficient());
					System.out.println("pt A grad:"+b.getGrad()+"	A coef:"+b.getCoeficient());
					rezultat.add(aux);
				}
				
			}
				
		}
		
		p.setMonoame(rezultat);
		System.out.println(p);
		this.result=p;
	
	}
	
	public void inmultestePolinoame(Poli p1, Poli p2)
	{
		ArrayList<Monom> rezultat= new ArrayList<Monom>();
		Poli p=new Poli(rezultat);
		
		for(Monom a: p1.getMonoame())
		{
			for(Monom b:p2.getMonoame()){
				Monom aux= new Monom();
					
					aux.setGrad(a.getGrad()+b.getGrad());
					int coef=a.getCoeficient()*b.getCoeficient();
					System.out.println("Coeficient inmultire:"+coef);
					aux.setCoeficient(coef);
					System.out.println("pt A grad:"+a.getGrad()+"	A coef:"+a.getCoeficient());
					System.out.println("pt A grad:"+b.getGrad()+"	A coef:"+b.getCoeficient());
					rezultat.add(aux);
				
			}
				
		}
		
		
		
		p.setMonoame(rezultat);
		p.grupare();
		
		System.out.println(p);
		this.result=p;

	}
	
	public void derivarePolinoame(Poli p1)
	{
		ArrayList<Monom> rezultat= new ArrayList<Monom>();
		Poli p=new Poli(rezultat);
		
		for(Monom a:p1.getMonoame())
		{
			Monom aux=new Monom();
			int coef;
			coef=a.getCoeficient()*a.getGrad();
			aux.setGrad(a.getGrad()-1);
			aux.setCoeficient(coef);
			
			rezultat.add(aux);
		}
		p.setMonoame(rezultat);
		System.out.println(p);
		this.result=p;
	}

	public void integrarePolinoame(Poli p1)
	{
		ArrayList<Monom> rezultat= new ArrayList<Monom>();
		Poli p=new Poli(rezultat);
		
		for(Monom a:p1.getMonoame())
		{
			Monom aux=new Monom();
			int coef;
			int grd=a.getGrad()+1;
			aux.setGrad(grd);
			coef=a.getCoeficient()/(grd);
			//System.out.printf( "%.2f %n",coef);
			aux.setCoeficient(coef);
			rezultat.add(aux);
		}
		p.setMonoame(rezultat);
		System.out.println(p);
		this.result=p;
	}
	
}
