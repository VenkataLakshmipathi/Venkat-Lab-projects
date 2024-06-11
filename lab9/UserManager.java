package javafullstack;
	public class UserManager {
	    
	    public void authenticateByUsernameAndPassword(String username, String password) {
	        System.out.println(username + ", you have successfully logged in.");
	    }

	    public void authenticateByEmailAndPassword(String email, String password) {
	        System.out.println(email + ", you have successfully logged in using your email.");
	    }

	    public void authenticateByPhoneNumberAndPin(long phoneNumber, int pin) {
	        System.out.println(phoneNumber + ", you have successfully logged in using your phone number.");
	    }
	 // TODO Auto-generated method stub

	    public static void main(String[] args) {
	        UserManager userManager = new UserManager();
	        userManager.authenticateByUsernameAndPassword("Venkat", "28042408");
	        userManager.authenticateByEmailAndPassword("Venkat@gmail.com", "2824");
	        userManager.authenticateByPhoneNumberAndPin(7993955785L, 2408);
	    }
	}
	
		
	


