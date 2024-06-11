package javafullstack;
class HillStation {
    void location() {
        System.out.println();
    }

    void famousFor() {
        System.out.println();
    }
}

class Manali extends HillStation {
   
    void location() {
        System.out.println("Location: MANALI");
    }

  
    void famousFor() {
        System.out.println("Famous for:HILLS");
    }
}

class Mussoorie extends HillStation {

    void location() {
        System.out.println("Location: Mussoorie");
    }

  
    void famousFor() {
        System.out.println("Famous for: SWEETS");
    }
}

class Gulmarg extends HillStation {
   
    void location() {
        System.out.println("Location: Gulmarg");
    }

    void famousFor() {
        System.out.println("Famous for: GUNS");
    }
}

public class HillStationCode {
    public static void main(String[] args) {
    	 
    	// TODO Auto-generated method stub  
          
          Manali manali = new Manali();
          manali.location();
          manali.famousFor();

          Mussoorie mussoorie = new Mussoorie();
          mussoorie.location();
          mussoorie.famousFor();

          Gulmarg gulmarg = new Gulmarg();
          gulmarg.location();
          gulmarg.famousFor();
    }
}
	