class SingleTonEx 
{ 
	public static void main(String args[]) 
	{ 

		Singleton some = Singleton.instance();
		
		Singleton some1 = Singleton.instance();
		
		System.out.println(some.s);
		
		
		System.out.println("Some :  " +some.hashCode() + "   some1 :"+some1.hashCode());
 
			} 
} 
