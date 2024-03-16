

class A {
	
	void add(int a , int b){
		
		System.out.println(a+b );
	}
	
	void add(int a , int b , int c ){
		System.out.println( a+ b * c);
	}
	
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A  ob  = new A ();
		ob.add(20, 30);
		ob.add(20, 30, 40);

	}

}
