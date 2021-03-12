package model_package;

import java.util.ArrayList;

public class Monom {
	
	private int coeficient; //adaug si semnul
	private int grad;
	
	Monom()
	{
		this.coeficient=0;
		this.grad=0;
	}
	
	
	Monom(int coeficient, int grad)
	{
		this.coeficient=coeficient;
		this.grad=grad;
	}

	


	public int getCoeficient() {
		return coeficient;
	}


	public void setCoeficient(int coeficient) {
		this.coeficient = coeficient;
	}


	public int getGrad() {
		return grad;
	}


	public void setGrad(int grad) {
		this.grad = grad;
	}


	public String toString()
	{
		if(this.grad == 0 )
			return this.coeficient+"";
		else if(this.grad == 1 )
				return this.coeficient+"x";
		else
			return this.coeficient+"x^"+this.grad+" ";
	}
	
	
		
			
			
			

}
