import java.util.*;
package person;






	public class person {
	    String name;
	    String address;
	    String phone_number;
	    String email_address;

	    public person() {

	    }
	    public person(String n, String a, String p, String e) {
	        name = n;
	        address = a;
	        phone_number = p;
	        email_address = e;
	    }

	    public String toString() {
	       
	    }
	}


	class Student extends person {
	    final String status1 = "Freshman";
	    final String status2 = "Sophomore";
	    final String status3 = "Junior";
	    final String status4 = "Senior";
	    
	    }

	   



	}

	class Employee extends person {
	    String office;
	    double salary;
	   
	    }

	 

	}

	class Faculty extends Employee {

	    double work_hour;
	    String rank;
	   

	    

	}
	class Staff extends Employee {
	    String title;

	 
	    }

	}
//}
