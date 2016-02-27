package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
		
		
		
	}
	//gets private attribute iValue
	public  int getiValue(){
		return iValue;
	}
	//checks if parameter is even
	public static boolean isEven(int value){
		return ((value % 2)==0);
	}
	
	//checks if parameter is odd 
	public static boolean isOdd(int value){
		return !isEven(value);
	}
	
	//checks if parameter is prime
	public static boolean isPrime(int value){
		//print test
		//System.out.print("value in isPrime " + value + "\n");
		//a more efficient way to do this is with square roots
		int i = 2;
		while(!((value % i) == 0) ){
			System.out.print(i + "\n");
			i++;
			if((value == i)){
				return true;
			}
		}
		return false;
		
		
	}
			
			
			
		

	//checks if iValue is even
	public boolean isEven(){
		return isEven(getiValue());
	}
	
	//checks if iValue is odd
	public boolean isOdd(){
		return isOdd(getiValue());
	}

	//checks if iValue is prime
	public boolean isPrime(){
		return isPrime(getiValue());
	}

	public static boolean isEven1(int MyInteger){
		return isEven(MyInteger);
	}
	public static boolean isOdd1(int MyInteger){
		return isOdd(MyInteger);
	}
	public static boolean isPrime1(int MyInteger){
		return isPrime(MyInteger);
	}
	
	
	
	public boolean equalsint(int value){
		return(value == this.getiValue());
	}
	
	public boolean equalsMyInteger(int value){
		return (this.getiValue() == new MyInteger(value).getiValue());
		
	}

}


	
	
	


