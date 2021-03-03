package typeofpolymarphism;

public class MethodoverridingA {

	public void ria(String name) {
	System.out.println("my name is"+ name);
}

    public void ria(int age) {
	System.out.println("my age is"+ age );
  }


    public void ria( int salary, String jobnam) {
    	System.out.println("my salary is"+ salary +  "my job company name"+ jobnam);
    }
}
