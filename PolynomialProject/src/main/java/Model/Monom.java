package Model;
import java.util.*;


public class Monom {
	private int grad;
	private double coef;
	
	public Monom(double coef, int grad) {
		super();
		this.grad = grad;
		this.coef = coef;
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}
	
	public int max(Monom x)
	{

		if(grad>x.getGrad())
		{
			return grad;
		}
		else
		{
			return x.getGrad();
		}
	}
	
	public Monom adunare(Monom x)
	{
		if(grad==x.getGrad())
		{
			return new Monom(coef+x.getCoef(),grad);
		}
		else
		{
			return new Monom(0,0);
		}
	}
	public Monom inmultire(Monom x)
	{
		return new Monom(coef*x.getCoef(),grad+x.getGrad());
	}
	public Monom impartire(Monom x)
	{
		return new Monom(coef/x.getCoef(),grad-x.getGrad());
	}
	public Monom derivare()
	{
		return new Monom(coef*grad,grad-1);
	}
	public Monom integrare()
	{
		return new Monom(coef/(grad+1),grad+1);
	}
}