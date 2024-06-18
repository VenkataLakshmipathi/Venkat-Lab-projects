package state;
public class State {
	protected String statename;
	protected String capitalname;
	 public State (String statename, String capitalname) {
	        this.statename = statename;
	        this.capitalname = capitalname ;}
	public void Statename() {
	        System.out.println("STATE NAME: " + statename);}
	    	public void Capitalname() {
		        System.out.println("CAPITAL NAME: " + capitalname);
	        
	        
	}

}