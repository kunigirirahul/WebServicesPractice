 
public class Singleton 
{ 
	 
	private static Singleton single_instance  = new Singleton();;

	 
	public String s; 

	 
	private Singleton() 
	{ 
		s ="Hi I am Rahul from singleton like washinton" ;
	} 
	

	 
	public static Singleton instance() 
	{ 
		
			
		return single_instance; 
	
} 
}

 
