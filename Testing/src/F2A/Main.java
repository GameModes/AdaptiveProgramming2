package F2A;

public class Main {
	public static void main(String[] args) {

		Node S0 = new Node("S0");
		
		Node S1 = new Node("S1");
		Node S2 = new Node("S2");
		Node S3 = new Node("S3");
		
		S0.setVerbinding("A", S2);
		S0.setVerbinding("B", S1);
		
		S1.setVerbinding("A", S1);
		S1.setVerbinding("B", S2);
		
		S2.setVerbinding("B", S3);
		
		S3.setVerbinding("A", S3);
		S3.setVerbinding("B", S0);
		
		System.out.println("\nBAAB");
		try {
			System.out.println(S0.FiniteStateMachine("BAAB"));
		}
		catch(IllegalArgumentException fout) {
			System.out.println("kan niet omdat, " + fout.getMessage());
		}
		
		System.out.println("\nAAAA");
		try {
			System.out.println(S0.FiniteStateMachine("AAAA"));
		}
		catch(IllegalArgumentException fout) {
			System.out.println("kan niet omdat, " + fout.getMessage());
		}
		
		System.out.println("\nBBBB");
		try {
			System.out.println(S0.FiniteStateMachine("BBBB"));
		}
		catch(IllegalArgumentException fout) {
			System.out.println("kan niet omdat, " + fout.getMessage());
		}
		System.out.println("\nBABABAABB");
		try {
			System.out.println(S0.FiniteStateMachine("BABABAABB"));
		}
		catch(IllegalArgumentException fout) {
			System.out.println("Kan niet omdat, " + fout.getMessage());
		}
			  
        
		
	}
}
