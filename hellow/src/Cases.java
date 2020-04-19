
public class Cases {
		static void convertOpposite(StringBuffer str) 
	     { 
	        int ln = str.length(); 
	             
	        // Conversion using predefined methods 
	        for (int i=0; i<ln; i++) 
	        { 
	            Character c = str.charAt(i); 
	            if (Character.isLowerCase(c)) 
	                str.replace(i, i+1, Character.toUpperCase(c)+""); 
	            else
	                str.replace(i, i+1, Character.toLowerCase(c)+""); 
	             
	        } 
	     } 
	       
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("THANveer"); 
        // Calling the Method 
        convertOpposite(str); 
          
        System.out.println(str); 
	

	}

}
