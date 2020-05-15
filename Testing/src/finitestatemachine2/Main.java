package finitestatemachine2;



public class Main {
	public static void main(String[] args) {
		DobbelNode n0 = new DobbelNode("n0", false);
		DobbelNode n1 = new DobbelNode("n1", false);
		DobbelNode n2 = new DobbelNode("n2", false);
		DobbelNode n3 = new DobbelNode("n3", false);
		DobbelNode n4 = new DobbelNode("n4", false);
		DobbelNode n5 = new DobbelNode("n5", false);
		DobbelNode n6 = new DobbelNode("n6", false);
					
		DobbelNode g0 = new DobbelNode("0", true);
		DobbelNode g1 = new DobbelNode("1", true);
		DobbelNode g2 = new DobbelNode("2", true);
		DobbelNode g3 = new DobbelNode("3", true);
		DobbelNode g4 = new DobbelNode("4", true);
		DobbelNode g5 = new DobbelNode("5", true);
		DobbelNode g6 = new DobbelNode("6", true);
		
		n0.setVerbinding(n1, 0.5);
		n0.setVerbinding(n2, 1);
		
		n1.setVerbinding(n4, 0.4);
		n1.setVerbinding(n3, 1);

		n2.setVerbinding(n5, 0.8);
		n2.setVerbinding(n6, 1);
		
		n3.setVerbinding(g1, 0.5);
		n3.setVerbinding(n1, 1);
		
		n4.setVerbinding(g2, 0.8);
		n4.setVerbinding(g3, 1);

		n5.setVerbinding(g4, 0.3);
		n5.setVerbinding(g5, 1);
		
		n6.setVerbinding(n2, 0.3);
		n6.setVerbinding(g6, 1);
		
		System.out.println(FSMPicker.bouwDobbelsteen(n0));	
		
//---------------------------------------------------------------------------------------------------------------------------------------------------
		TextNode S0 = new TextNode("S0");
		TextNode S1 = new TextNode("S1");
		TextNode S2 = new TextNode("S2");
		TextNode S3 = new TextNode("S3");
		
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
