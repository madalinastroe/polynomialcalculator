package PT2020.as1.as1Project;

import junit.framework.TestCase;
import model_package.Model;
import model_package.Poli;

public class aloHELP extends TestCase {
	
	public void testAdunare()
	{
		Model mod= new Model();
		String s1="-5x^3+2x^2+0x^1+2x^0";
		String s2="8x^3+5x^2+2x^1+0x^0";
		String resultAdunare="+3x^3 +7x^2 +2x^1+2x^0";
		
		Poli p1= new Poli();
		p1.citire(s1);
		Poli p2= new Poli();
		p2.citire(s2);
		
		Poli res= new Poli();
	
		res.citire(resultAdunare); //rezultatul corect al adunarii
		mod.adunaPolinoame(p1,p2);		
		Object dataobject1=mod.getResult();
	     String convert1= String.valueOf(dataobject1);
	 
	     Object dataobject2=res;

	     String convert2= String.valueOf(dataobject2);
	     
	     System.out.println(convert1.equals(convert2));
	     assertTrue(convert1.equals(convert2));
	  	}
	public void testScadere()
		{
		Model mod= new Model();
		String s1="-5x^3+2x^2+0x^1+2x^0";
		String s2="8x^3+5x^2+2x^1+0x^0";
		String resultScadere="+-13x^3 +-3x^2 +-2x^1+2x^0";
		
		Poli p1= new Poli();
		p1.citire(s1);
		Poli p2= new Poli();
		p2.citire(s2);
		
		Poli res= new Poli();
		res.citire(resultScadere);
		mod.scadePolinoame(p1,p2);		
		Object dataobject1=mod.getResult();
		String convert1= String.valueOf(dataobject1);
		     
		Object dataobject2=res;
	
		String convert2= String.valueOf(dataobject2);
		     
		 System.out.println(convert1.equals(convert2));
	     assertTrue(convert1.equals(convert2));
	}
	
	public void testInmultire()
	{
		Model mod= new Model();
		
		String s1="-5x^3+2x^2+0x^1+2x^0";
		String s2="8x^3+5x^2+2x^1+0x^0";
		String resultInmultire="+-40x^6 +-9x^5 +0x^4 +20x^3 +10x^2 +4x^1+0x^0";
		
		Poli p1= new Poli();
		p1.citire(s1);
		Poli p2= new Poli();
		p2.citire(s2);
		
		Poli res= new Poli();
		res.citire(resultInmultire);
		
		mod.inmultestePolinoame(p1,p2);	
		
		Object dataobject1=mod.getResult();
		String convert1= String.valueOf(dataobject1);
		System.out.println("ALO:"+convert1);
		
		

		Object dataobject2=res;
	
		String convert2= String.valueOf(dataobject2);
		System.out.println("BUNA:"+convert2);
		     
		System.out.println(convert1.equals(convert2));
		assertTrue(convert1.equals(convert2));
	} 
	
	public void testIntegrare()
	{
		Model mod= new Model();
		String s1="-5x^3+2x^1";
		String resultIntegrare="+-1x^4 +1x^2 ";
		

		Poli p1= new Poli();
		p1.citire(s1);
		
		
		Poli res= new Poli();
		res.citire(resultIntegrare); //rezultatul corect al adunarii
		mod.integrarePolinoame(p1);		
		Object dataobject1=mod.getResult();
		String convert1= String.valueOf(dataobject1);
		System.out.println(convert1.equals(resultIntegrare));
		//assertTrue(convert1.equals(resultIntegrare));
		assertTrue(convert1.equals(resultIntegrare));
	}
	

	public void testDerivare()
	{
		Model mod= new Model();
		String s1="-5x^3+2x^1";
		String resultDerivare="+-15x^2 +2";
		

		Poli p1= new Poli();
		p1.citire(s1);
		
		
		Poli res= new Poli();
		res.citire(resultDerivare);
		mod.derivarePolinoame(p1);		
		Object dataobject1=mod.getResult();
		String convert1= String.valueOf(dataobject1);
		System.out.println(convert1.equals(resultDerivare));
		assertTrue(convert1.equals(resultDerivare));
		
	}

	
}
