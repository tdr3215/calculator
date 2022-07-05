package com.tts;



public class MagicCalculator extends Calculator{
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public MagicCalculator(){
		setNum(0);
		this.num = getNum();
	}
	
	public double squareRoot(int num) {
		setNum(num);
		
		return Math.sqrt(getNum());
	}
	
	public double sin(int num) {
		setNum(num);
		
		return Math.sin(getNum());
	}
	
	public double cosine(int num) {
		setNum(num);
		
		return Math.cos(getNum());
	}
	
	public double tangent(int num) {
		setNum(num);
		
		return Math.tan(getNum());
	}
	
	public double factorial(int num) {
        setNum(num);
        double factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        
        return factorial;
	}
	
	
}
